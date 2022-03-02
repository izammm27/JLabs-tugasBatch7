package february2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement username;
	
	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	private WebElement arrowBtn;

	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void inputUsername(String user) {
		username.sendKeys(user);
	}
	
	public void clickarrowBtn() {
		arrowBtn.click();
	}
}
