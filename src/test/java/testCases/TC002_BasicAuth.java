package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BasicAuthPage;
import testBase.BaseAuthClass;

public class TC002_BasicAuth extends BaseAuthClass{
	
	@Test
	public void basic_auth() throws InterruptedException {
		try {
		System.out.println("TC002 started");
		
		BasicAuthPage ba= new BasicAuthPage(driver);
		ba.clk_Basic_Auth_Link();
		
		String title=ba.validateTitle();
		Assert.assertEquals(title, "The Internet");
		
		String authtext=ba.validate_Text_BasicAuth();
		Assert.assertEquals(authtext, "Basic Auth");
		
		String congratstext=ba.validate_BasicAuth_Congrajulation_Message();
		Assert.assertEquals(congratstext, "Congratulations! You must have the proper credentials.");
		
		System.out.println("TC002 finished");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

}
