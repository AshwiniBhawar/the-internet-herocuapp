package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DigestAuthPage;
import testBase.BaseAuthClass;

public class TC004_DigestAuthentication extends BaseAuthClass{

	@Test
	public void digest_auth_validation(){
		try {
			System.out.println("TC001 started");
			DigestAuthPage da= new DigestAuthPage(driver);
			da.click_digestAuth_link();
			String msgtext=da.validate_msg_digestAuth();
			Assert.assertEquals(msgtext, "Congratulations! You must have the proper credentials.");
			System.out.println("TC003 Finished");
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			Assert.fail();
		}
		
	}
}
