package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateUserRegTest {
	
	@Test
	public void validate() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("ABC", "ABC");
		softAssert.assertEquals("ABC", "XYZ"); //fail
		softAssert.assertTrue(5>11, "Error Message"); //fail
		softAssert.fail("404 Error came up");
		
		
		
		softAssert.assertAll();
	}

}
