package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://ca.yahoo.com/");
		String searchWord = "canada";
		WebElement searchBox = driver.findElement(By.name("p"));
		searchBox.sendKeys(searchWord);

		Thread.sleep(2000);

		List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		System.out.println(suggestionList.size());

		for (WebElement suggestion : suggestionList) {
			if(suggestion.getText().startsWith(searchWord)) {
				System.out.println(suggestion.getText() +" ****** related to Canada ******Pass******");
			}else {
				System.out.println(suggestion.getText() +" not related to Canada ++++++Fail++++++");
			}
			
		}

	}

}
