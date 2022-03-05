package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddidasLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement id = driver.findElement(By.id("login-email"));
		id.sendKeys("test@test.ca");
		WebElement password = driver.findElement(By.id("login-password"));
		password.sendKeys("Fnakdddddd");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement errLable = driver.findElement(By.xpath("//div[@class='errorMessage___2sHhm gl-form-hint gl-form-hint--error']"));
		wait.until(ExpectedConditions.visibilityOf(errLable));
		
		String actualError = errLable.getText();
		String expectedError = "Incorrect email/password – please check and retry";
		
		if(actualError.equals(expectedError)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		

	}

}
