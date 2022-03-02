package february2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage extends BasePage {

	By logoutBtn = By.xpath("//i[@class='icon-2x icon-signout']");

	public LogoutPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public void logout() {
		clickAndWait(logoutBtn);
	}
	
	
	
}
