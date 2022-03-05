package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radioButtons = driver.findElements(By.name("group1"));
		
		System.out.println(radioButtons.size());
		for(WebElement button : radioButtons) {
			System.out.println(button.getAttribute("value")+"----------"+ button.isSelected());
		}
		
		for(WebElement button : radioButtons) {
			if(button.getAttribute("value").equals("Cheese")) {
				button.click();
			}
		}
		
		
	}

}
