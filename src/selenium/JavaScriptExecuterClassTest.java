package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adidas.ca/en");
		
		System.out.println(driver.getTitle());
		WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		//option1
		//trial and error for co-ordinate
		//Scroll using x and y cordinate
		
		//jse.executeScript("window.scrollBy(0,3874)");
		
		
		// getLocation will give the element location
		//System.out.println(aboutUsLink.getLocation());
		
		
		//option2 scroll untill the element is in view
		
		//jse.executeScript("arguments[0].scrollIntoView(true);", aboutUsLink);
		
		
		//aboutUsLink.click();
		
		//option3
		
		
		jse.executeScript("arguments[0].click();", aboutUsLink);
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
