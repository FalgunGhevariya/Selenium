package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/javascript4.htm");
		
		WebElement confrimButton = driver.findElement(By.name("B2"));
		confrimButton.click();
		
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		al.accept();
		//al.dismiss();

	}

}
