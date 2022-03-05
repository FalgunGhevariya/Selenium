package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooWebList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://ca.yahoo.com");
		
		List<WebElement> trendingLinks = driver.findElements(By.xpath("//div[@class = 'c-list Mb(24px) wafer-tabs-target_Mb(18px) D(b)']/div/div/a"));
		
		System.out.println(trendingLinks.size());
		
		for(WebElement links : trendingLinks) {
			System.out.println(links.getText());
		}

	}

}
