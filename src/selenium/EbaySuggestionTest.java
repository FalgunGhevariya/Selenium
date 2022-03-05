package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		//suggestion for iphone
		
		System.setProperty("webdriver.gecko.driver", "N:\\\\QA Automation\\\\SeleniumJars\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.ca/");
		
		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.sendKeys("iphone");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//a"));
		System.out.println(suggestionList.size());
		
		for(WebElement suggestion: suggestionList) {
			if(suggestion.getText().contains("iphone")) {
				System.out.println(suggestion.getText()+"Pass");
			}
			else {
				System.out.println(suggestion.getText()+"Fail");
			}
		}

	}

}
