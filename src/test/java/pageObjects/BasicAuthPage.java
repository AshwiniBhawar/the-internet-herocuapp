package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage extends BasePage{
	
	public BasicAuthPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Basic Auth']")
	WebElement linkBasicAuth;
	
	@FindBy(xpath="//div[@class='example']/h3")
	WebElement txtBasicAuth;
	
	@FindBy(xpath="//div[@class='example']/p")
	WebElement txtBasicAuthSuccessMsg;
	
	public String validate_Text_BasicAuth() {
		try {
			String basicauthtext=txtBasicAuth.getText();
			return basicauthtext;
			
		}
		catch(Exception e){
			return e.getMessage();
		}
		
	}
	
	public void clk_Basic_Auth_Link() {
		linkBasicAuth.click();
	}
	
	public String validate_BasicAuth_Congrajulation_Message() {
		try {
		String msgBasicAuth=txtBasicAuthSuccessMsg.getText();
		return msgBasicAuth;
		}
		catch(Exception e){
			return e.getMessage();
		}
	}
	
	public String validateTitle() {
		try {
		String title=driver.getTitle();
		return title;
		}
		catch(Exception e){
			return e.getMessage();	
		}
	}

}

