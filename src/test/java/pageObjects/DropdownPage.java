package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Dropdown;

public class DropdownPage extends BasePage {

	public DropdownPage(WebDriver driver) {
		super(driver);
		
	}
		
	@FindBy(xpath="//a[normalize-space()='Dropdown']")
	WebElement linkDropdown;
	
	@FindBy(xpath="//select[@id='dropdown']")
	WebElement clickDropdown;
	
	
	public void linkDropdown() {
		linkDropdown.click();
	}
	
	public void clickdropdownopt() {
		clickDropdown.click();
	}
	
	public String selectValue(String value) {
		
		try {
			String textValue=Dropdown.selectValue(clickDropdown,value);
			return textValue;
			}
			catch(Exception e) {
				return e.getMessage();
			}
	}
}
