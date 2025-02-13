package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.FormAuthPage;
import testBase.BaseClass;

public class TC007_FormAuth extends BaseClass{
	
	@Test
	public void validateFormAuthentication(){
		try {
			System.out.println("****TC006 started****");
			FormAuthPage fp= new FormAuthPage(driver);
			fp.clickFormAuthentication();
			fp.enterusername(prop.getProperty("Username"));
			fp.enterpassword(prop.getProperty("Password"));
			fp.clicklogin();
			fp.alertValidate();
			String msg=fp.validateMsg();
			String msgtext[]=msg.split("×");
			Assert.assertEquals(msgtext[0].trim(), "You logged into a secure area!");
			fp.clicklogout();
			Thread.sleep(2000);
			System.out.println("****TC006 Finished****");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

}
