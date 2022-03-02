package february2022.Tugas4;

import org.testng.Assert;
import org.testng.annotations.Test;

import february2022.pages.BasePage;
import february2022.pages.HomePage;
import february2022.pages.MailboxPage;

/**
 * Unit test for simple App.
 */
public class AppTestPage extends BaseWebTest{
	
	@Test
	public void test1() {
		HomePage homePage = new HomePage(driver, explicitWait);
		MailboxPage mailPage = new MailboxPage(driver, explicitWait);
		
		String username = "testautomation";
		
		homePage.inputUsername(username);
		homePage.clickarrowBtn();
		mailPage.clickprintBtn();
		

	}
}