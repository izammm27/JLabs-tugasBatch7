package february2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPageFactory extends BasePage {

	@FindBy(xpath = "//i[@class='icon-2x icon-signout']")
	private WebElement logoutBtn;

	public LogoutPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	public void clicklogoutBtn() {
		logoutBtn.click();
	}

}
