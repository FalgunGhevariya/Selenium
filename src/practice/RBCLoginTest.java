package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RBCLoginTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.rbcroyalbank.com/personal.html");

		WebElement signButton = driver.findElement(By.id("header-sign-in-btn"));
		signButton.click();

		WebElement cardNumber = driver.findElement(By.id("userName"));
		cardNumber.sendKeys("4565456545654565");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement nextButton = driver.findElement(By.id("signinNext"));
		wait.until(ExpectedConditions.visibilityOf(nextButton));
		nextButton.click();

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("fkjksfjskfhf");

		password.sendKeys(Keys.ENTER);

		WebElement err = driver.findElement(By.xpath("//h6[@class='alertHeading']"));
		wait.until(ExpectedConditions.visibilityOf(err));

		String errorMsg = err.getText();
		System.out.println(errorMsg);
		String expectedMsg = "We’re expecting a different answer.\r\n" + "Please try again.";
		System.out.println(expectedMsg);
		
		if (errorMsg.equals(expectedMsg)) {
			System.out.println("Pass");
		}
	}

}
