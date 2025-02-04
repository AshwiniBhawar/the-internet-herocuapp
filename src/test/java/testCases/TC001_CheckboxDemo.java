package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CheckBoxPage;
import testBase.BaseClass;

public class TC001_CheckboxDemo extends BaseClass{
	
	@Test
	public void checkbox_demo() throws InterruptedException {
		try {
		System.out.println("TC001 started");
		
		CheckBoxPage ld= new CheckBoxPage(driver);
		ld.lnkCheckbox();
		ld.firstCheckbox();
		Thread.sleep(2000);
		System.out.println("TC001 finished");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

}
