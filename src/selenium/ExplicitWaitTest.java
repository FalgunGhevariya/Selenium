package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/javascript4.htm");
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement confrimButton = driver.findElement(By.name("B2"));
		confrimButton.click();
		
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();
		//al.dismiss();

	}

}
