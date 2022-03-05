package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//using webdriver interface
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gahsjshdkhkdhjadkahd");
		driver.findElement(By.id("pass")).sendKeys("kjddksc");
		driver.findElement(By.name("login")).click();
	}

}
