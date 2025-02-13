package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContextMenuPage;
import testBase.BaseClass;

public class TC003_ContextMenu extends BaseClass{

	@Test
	public void context_menu_validation() {
		try {
		System.out.println("****TC003 Started****");
		ContextMenuPage cm= new ContextMenuPage(driver);
		
		cm.clk_ContextMenu();
		cm.box_RightClick();
		String alertText=cm.accept_Alert();
		System.out.println(alertText);
		Assert.assertEquals(alertText, "You selected a context menu");
				
		System.out.println("****TC003 Finished****");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	
}
