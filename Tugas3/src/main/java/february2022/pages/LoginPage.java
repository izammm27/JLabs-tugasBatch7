package february2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	By username = By.xpath("//*[@id=\"username\"]");
	By password = By.id("password");
	By loginBtn = By.xpath("//button[@type='submit']");
	static By logoutText = By.xpath("//div[@id='flash']");

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public void login(String user, String pass) {
		setText(username, user);
		setText(password, pass);
		clickAndWait(loginBtn);
	}

	public void inputUsername(String user) {
		setText(username, user);
	}

	public void inputPassword(String pass) {
		setText(password, pass);
	}

	public void clickLoginButton() {
		clickAndWait(loginBtn);
	}
	
	public static String getLogoutText() {
		return getText(logoutText);
	}
}
