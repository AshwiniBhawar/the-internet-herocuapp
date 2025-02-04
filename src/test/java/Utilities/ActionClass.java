package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObjects.BasePage;

public class ActionClass extends BasePage{
	
	public static Actions act;
		
	public ActionClass(WebDriver driver){
		super(driver);
	}
	
	public static void rightClick(WebDriver driver, WebElement ele) {
		act= new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	public static void dragAndDrop(WebDriver driver, WebElement src, WebElement dest) {
		act= new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}
	
	
	
}
