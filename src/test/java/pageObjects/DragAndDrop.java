package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.ActionClass;

public class DragAndDrop extends BasePage {

	public DragAndDrop(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Drag and Drop']")
	WebElement clkDragAndDrop;

	@FindBy(xpath = "//div[@id='column-a']")
	WebElement source;

	@FindBy(xpath = "//div[@id='column-b']")
	WebElement desitination;
	
	@FindBy(xpath = "//div[@id='column-a']/header")
	WebElement srcText;
	
	@FindBy(xpath = "//div[@id='column-b']/header")
	WebElement destText;
	

	public void click_dragAndDrop() {
		clkDragAndDrop.click();
	}

	public void moveSourceToDestination() {

		ActionClass.dragAndDrop(driver, source, desitination);
	}

	public String validateSourceText() {
		try {
			String sourceText = srcText.getText();
			return sourceText;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String validateDestText() {
		try {
			String destinationText = destText.getText();
			return destinationText;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
