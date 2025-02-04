package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage{
	
	public CheckBoxPage(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath= "//a[normalize-space()='Checkboxes']")
	WebElement linkCheckbox;

	@FindBy(xpath= "//input[@type='checkbox'][2]")
	WebElement checkbox1;
	
	
	
	public void lnkCheckbox() {
		linkCheckbox.click();
		
	}
	
	public boolean firstCheckbox() {
		
		//checkbox1.click();
		try {
		boolean result=checkbox1.isSelected();
		
		if(result==false) {
			checkbox1.click();
		}
		
		return result;
		}
		catch(Exception e) {
			e.getMessage();
			return false;
		}
		
		
	
	}
}
