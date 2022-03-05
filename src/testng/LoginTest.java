package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	public void doLogin() {
		String actualResult = "ABC";
		String expectedResult = "ABC";
		
		//Assert.assertEquals(actualResult, expectedResult);
		//Assert.assertTrue(isElementPresent('xxxx'), "Error message");
		System.out.println("-----A-----"); 
		Assert.fail("Custome err message - 404 error");
		System.out.println("-----B-----");
		
	}
}
