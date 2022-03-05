package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://best.aliexpress.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//if getting popup ,close the popup and continue
		List<WebElement> popup = driver.findElements(By.className("btn-close"));
		System.out.println(popup.size());
		
		
		if(popup.size()>0) {
			popup.get(0).click();
		}
		
		driver.findElement(By.id("search-key")).sendKeys("Computer");
		//if donot get popup, continue
		
	}

}
