package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		  driver.get("https://www.ebay.ca/");
		  
		  WebElement electronics = driver.findElement(By.linkText("Electronics"));
		  
		  Actions builder = new Actions(driver);
		  builder.moveToElement(electronics).build().perform();
		 
		
		
		
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("(//nav[@aria-label=\"Top Categories\"]/ul)[3]/li"));
		System.out.println(allOptions.size());
		
		for(WebElement option: allOptions) {
			System.out.println(option.getText());
		}
		
		
	}

}
