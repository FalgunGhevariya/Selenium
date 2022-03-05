package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		//driver.get("https://ca.yahoo.com/");
		
		//Difference between driver.get and driver.navigate
		
		driver.navigate().to("https://ca.yahoo.com/"); //same as driver.get if you see inside code of navigate.to it's calling get() mmethod
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
