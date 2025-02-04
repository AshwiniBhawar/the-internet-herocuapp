package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigestAuthPage extends BasePage {

	public DigestAuthPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@href='/digest_auth']")
	WebElement clkDigestAuthLink;

	@FindBy(xpath = "//div[@class='example']//p")
	WebElement msgDigestAuthLink;

	public void click_digestAuth_link() {
		clkDigestAuthLink.click();
	}

	public String validate_msg_digestAuth() {
		try {
			String msg = msgDigestAuthLink.getText();
			return msg;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
