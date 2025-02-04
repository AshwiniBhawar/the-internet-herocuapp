package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DragAndDrop;
import testBase.BaseClass;

public class TC005_DragAndDrop extends BaseClass{
	@Test
	public void dragAndDropElement() {
		
		try {
			System.out.println("TC005 started");
			DragAndDrop dd= new DragAndDrop(driver);
			dd.click_dragAndDrop();
			dd.moveSourceToDestination();
			String sourceText=dd.validateSourceText();
			System.out.println(sourceText);
			Assert.assertEquals(sourceText, "B");
			
			String destText=dd.validateDestText();
			System.out.println(destText);
			Assert.assertEquals(destText, "A");
			
			System.out.println("TC005 started");
			
		}
		catch(Exception e){
			Assert.fail();
		}
	}
}
