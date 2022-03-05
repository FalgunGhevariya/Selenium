package testng;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {

	boolean flag=false; //read from external files xls, json
	
	@Test(priority = 1)
	public void search(ITestContext context) {	//failing or skipping
		if(flag)
			throw new SkipException("Skipping Test");
		System.out.println("Searching Phone");
		context.setAttribute("phoneName", "onePlus 7t");
	}
	
	@Test(priority = 2,dependsOnMethods = {"search"})
	public void select(ITestContext context) {
		String name = (String)context.getAttribute("phoneName");
		System.out.println("Selecting Phone"+ name);
		Assert.fail();
	}
	
	@Test(priority = 3, dependsOnMethods = {"search","select"})
	public void buy(ITestContext context) {
		System.out.println("Buying Phone");
	}
}
