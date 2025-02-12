package Utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.BasePage;

public class Dropdown extends BasePage {
	
	public static Select select;
	
	public Dropdown(WebDriver driver) {
		super(driver);
	}
	
	public static String selectValue(WebElement ele, String value) {
		String text=null;
		select= new Select(ele);
		
		List<WebElement> list=select.getOptions();
		System.out.println(list.size());
		for(WebElement l:list) {
			text=l.getText();
			if(l.getText().equals(value)) {
				
				l.click();
				break;
			}
		}	
		return text;
	}
	
	public static String getTextOfDropdown(WebElement ele) { 
			String text=ele.getText();
			System.out.println(text);
			return text;	
	}
	
	
	/*public static void selectByValue(WebElement ele, String value) {
		
		select= new Select(ele);
		select.selectByValue(value);
	}
	public static void selectByVisibilityText(WebElement ele, String value) {
		
		select= new Select(ele);
		select.selectByVisibleText(value);
	}
	public static void selectByIndex(WebElement ele, int value) {
		
		select= new Select(ele);
		select.selectByIndex(value);
	}*/
}
