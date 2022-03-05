package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RBCSearchBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rbcroyalbank.com/personal.html");
		WebElement account = driver.findElement(By.xpath("//a[@data-dig-id='pb-nav-401']"));
		
		
		
		Actions builders = new Actions(driver);
		builders.moveToElement(account).build().perform();
		
		List<WebElement> allOption = driver.findElements(By.xpath("//div[@id='mm-accounts']/div/div/div[2]//ul//li//a"));
		
		System.out.println(allOption.size());
		
		for(WebElement option : allOption) {
			System.out.print(option.getText());
			System.out.println("\t" + option.getAttribute("href"));
		}
		
		
		//searchBox.click();
		
		//driver.findElement(By.id("header-search")).sendKeys("Account");

	}

}
