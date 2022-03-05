package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.ca/");
		List<WebElement> dropDown = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(dropDown.size());
		for(WebElement option : dropDown) {
			if(option.isSelected()){
				System.out.println(option.getText());
				break;
			}
		}
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		
		Select selectOption = new Select(box);
		selectOption.selectByIndex(2);
		
		Thread.sleep(2000);
		
		selectOption.selectByValue("2984");
		Thread.sleep(2000);
		
		selectOption.selectByVisibleText("Books");
		
		System.out.println("------------------------------After Selected----------------------------");
		System.out.println();
		System.out.println();
		
		for(WebElement option : dropDown) {
			if(option.isSelected()){
				System.out.println(option.getText());
				break;
			}
		}
		
		

	}

}
