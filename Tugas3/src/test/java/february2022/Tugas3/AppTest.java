package february2022.Tugas3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import february2022.pages.LoginPage;
import february2022.pages.LogoutPage;
import february2022.pages.ProfilePage;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseWebTest {
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);
	LogoutPage logoutpage = new LogoutPage(driver, explicitWait);

	@Test
	public void test1() {
		// loginpage
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		loginPage.login(username, password);
		
		// logoutpage
		logoutpage.logout();
		String actualText1 = LoginPage.getLogoutText();
		String expectedText1 = "You logged out of the secure area!";
		System.out.println(actualText1);
		
		
		
		// assertion
		Assert.assertTrue(actualText1.contains(expectedText1));


		


}
}
