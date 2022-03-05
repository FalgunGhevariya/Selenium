package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");
		
		List<WebElement> trendingLinks = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		
		System.out.println(trendingLinks.size());
		
		for(WebElement links : trendingLinks) {
			System.out.println(links.getText());
		}


	}

}
