package february2022.Tugas3;

import org.testng.Assert;
import org.testng.annotations.Test;

import february2022.pages.LoginPageFactory;
import february2022.pages.LogoutPageFactory;
import february2022.pages.ProfilePageFactory;

/**
 * Unit test for simple App.
 */
public class AppTestPageFactory extends BaseWebTest {

	@Test
	public void test1() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		LogoutPageFactory logoutPage = new LogoutPageFactory(driver, explicitWait);

		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();
		logoutPage.clicklogoutBtn();
		String actualText1 = LoginPageFactory.getLogoutText();
		String expectedText1 = "You logged out of the secure area!";;
		System.out.println(actualText1);
		Assert.assertTrue(actualText1.contains(expectedText1));
		


}
}