package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		String s = searchBar.getAttribute("placeholder");
		System.out.println(s);
		
		
		searchBar.sendKeys("iphone");
		
		String p = searchBar.getAttribute("value");
		System.out.println(p);

	}

}
