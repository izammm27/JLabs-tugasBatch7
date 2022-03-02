package february2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailboxPage extends BasePage {

//	
	@FindBy(xpath = "//iframe[@id='ifmail']")
	private WebElement iframe;
	
	@FindBy(css = "\"button[onclick='w.printmail();']\"")
	private WebElement printBtn;


	public MailboxPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}


	public String getProfileText() {
		driver.get().switchTo().frame("ifmail");
		return iframe.getText();
	}

	public void clickprintBtn() {
		printBtn.click();
	}

}
