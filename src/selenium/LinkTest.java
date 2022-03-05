package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		
		//Thread.sleep(2000);
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		

	}

}
