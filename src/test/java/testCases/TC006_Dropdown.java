package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DropdownPage;
import testBase.BaseClass;

public class TC006_Dropdown extends BaseClass{

	@Test
	public void dropdownTest() {
		
		try {
			System.out.println("TC006 started");
			DropdownPage dd= new DropdownPage(driver);
			dd.linkDropdown();
			Thread.sleep(2000);
			dd.clickdropdownopt();
			Thread.sleep(2000);
			String textselected=dd.selectValue(prop.getProperty("value"));
			Assert.assertEquals(textselected, prop.getProperty("value"));
			
			Thread.sleep(2000);
			System.out.println("TC006 Finished");
			
		}
		catch(Exception e){
			Assert.fail();
		}
	}
}
