package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.ca/");
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE); //This is for FirefoxDriver, Chrodriver or any class driver
		//File srcFile = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE); // This line is for WebDriver
		FileUtils.copyFile(srcFile, new File("N:/QA Automation/testing/ScreenShot.png"));
		
	}

}
