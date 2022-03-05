package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Canada");
		
		Thread.sleep(2000);
		
		List<WebElement> suggestionList = driver.findElements(By.xpath("(//div[@role='presentation'])[1]//ul//li"));
		
		System.out.println(suggestionList.size());
		
		for(WebElement suggestion : suggestionList) {
			System.out.println(suggestion.getText());
		}

	}

}
