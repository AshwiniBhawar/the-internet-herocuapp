package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.ActionClass;

public class ContextMenuPage extends BasePage {
	
	public ContextMenuPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath= "//a[text()='Context Menu']")
	WebElement linkContextMenu;
	
	@FindBy(id= "hot-spot")
	WebElement box;
	
	
	public void clk_ContextMenu() {
		linkContextMenu.click();
	}
	
	public void box_RightClick() {
	
		 ActionClass.rightClick(driver, box);
	}
	
	public String accept_Alert() {
		try {
		String alertText=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertText;
		}
		catch(Exception e) {
			return e.getMessage();
		}
		
	}

}
