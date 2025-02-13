package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthPage extends BasePage{

	public FormAuthPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='Form Authentication']")
	WebElement linkFormAuth;
	

	@FindBy(id="username")
	WebElement enterUsername;
	

	@FindBy(id="password")
	WebElement enterPassword;
	

	@FindBy(xpath="//i[normalize-space()='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//div[@class='flash success']")
	WebElement validateMsg;
	
	@FindBy(xpath="//i[normalize-space()='Logout']")
	WebElement logout;
	
	public void clickFormAuthentication() {
		linkFormAuth.click();
	}
	
	public void enterusername(String value) {
		enterUsername.sendKeys(value);
	}
	
	public void enterpassword(String value) {
		enterPassword.sendKeys(value);
	}
	
	public void clicklogin() {
		btnLogin.click();
	}
	
	public String validateMsg() {
		try{
			String text=validateMsg.getText();
			return text;
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}

	public void clicklogout() {
		logout.click();
		
	}
	
	public boolean alertValidate() {
		try {
			driver.switchTo().alert().accept();
			return true;
		}
		catch(Exception e) {
			return false;
		}
		
	}

}
