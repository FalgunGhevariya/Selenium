package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		/*if(driver.findElement(By.linkText("About")).isDisplayed()){
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}*/
		
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size() > 0 ) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
	
	}

}
