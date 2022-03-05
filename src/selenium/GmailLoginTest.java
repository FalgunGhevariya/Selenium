package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email.sendKeys("falgun@ghan.ca");
		WebElement nextButton = driver.findElement(By.xpath("//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']//button[@type='button']"));
		nextButton.click();
		
		String expectedError = "Couldn’t find your Google Account";
		WebElement error = driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		String actualError = error.getText();
		
		if(expectedError.equals(actualError)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		

	}

}
