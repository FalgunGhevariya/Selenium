package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraHoverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement menTab = driver.findElement(By.xpath("//header[@id='desktop-header-cnt']//a[text()='Men']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(menTab).build().perform();
		List<WebElement> allOption = driver.findElements(By.xpath("//ul[@data-reactid ='27']//li//a"));
		
		System.out.println(allOption.size());
		
		for(WebElement option : allOption) {
			System.out.println(option.getText());
		}

	}

}
