package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

//		 List<WebElement> links= driver.findElements(By.tagName("a"));
//		 System.out.println(links.size());
//		 for(WebElement link : links) {
//			 System.out.println(link.getText());
//		 }

//		WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
//		List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
//
//		System.out.println(footerLinks.size());
//		for (WebElement link : footerLinks) {
//			System.out.println(link.getText());
//		}

		WebElement footerDiv1 = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		List<WebElement> footerLinksDiv1 = footerDiv1.findElements(By.tagName("a"));
//List<WebElement> footerLinksDiv1 = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		System.out.println(footerLinksDiv1.size());
		for (WebElement link : footerLinksDiv1) {
			System.out.println(link.getText());
		}

	}

}
