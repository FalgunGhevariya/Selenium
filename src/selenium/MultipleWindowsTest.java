package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.freecodecamp.org/news/how-to-use-html-to-open-link-in-new-tab/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[text()='freeCodeCamp'])[2]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> it = allWindows.iterator();
		String parentWindow = it.next();
		String childWinow = it.next();
			
		
		System.out.println(parentWindow);
		System.out.println(childWinow);
		
		Thread.sleep(2000);
		
		
		driver.switchTo().window(childWinow);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
