package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=EgpFdVxRn7o&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiRWdwRmRWeFJuN28iLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0MzA4MDU3NCwiaWF0IjoxNjQzMDc5Mzc0LCJqdGkiOiI0NzdhNGFiMS0wOGJhLTQ1MmEtODQwNy02MGY0YTJkYTMyMDMiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.DY_IWcOxeJTA7IKw-qkljmUCN47jnYCzTMTU35djRuCQ0ZyrMFKy2vkBZ-IPR4yBiiPFVtMnsBXriWGnEHNjZe-ehCkjLA2N7URXb1joasdrEUor69HvDEfIVFl9UKlpDZWRKW2L3wTYpmZf3wdEf1kYAh7zWFhDzhGkk7x-RclgMyUjHQfNUtO-6fJ7O5oB9yZde9LEDsGxD_0M15UNkF2SLTWcI3_hmMGeQS5-vzkzBQIvZG5T-4O4rRuHpvY88uvhqFaYZcuMfMBRQc4eCMf2HMuRagcUH6fW8Ntr0qpLOtHMo2bpstYiXDHmKbrWGwkQxCCSlqBvcUgq3HYHAQ&preferred_environment=");
		driver.findElement(By.name("usernameInput")).sendKeys("cdlkfje");
		driver.findElement(By.name("password")).sendKeys("sfsfdsfad");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
		
		String expectedErr = "Please check your card number / username or password and try again.";
		String actualErr = driver.findElement(By.id("globalError")).getText();
		
		if (expectedErr.equals(actualErr))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}

	}

}
