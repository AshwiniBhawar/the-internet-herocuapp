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
			dd.clickdropdownopt();
			String textselected=dd.selectValue(prop.getProperty("value"));
			Assert.assertEquals(textselected, prop.getProperty("value"));
			
			System.out.println("TC006 Finished");
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
}
