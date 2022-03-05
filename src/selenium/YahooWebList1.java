package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooWebList1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://ca.yahoo.com");
		
		List<WebElement> trendingLinks = driver.findElements(By.xpath("//div[@id='ybar-navigation']/div/ul/li"));
		
		System.out.println(trendingLinks.size());
		
		for(WebElement links : trendingLinks) {
			System.out.println(links.getText());
		}

	}

}
