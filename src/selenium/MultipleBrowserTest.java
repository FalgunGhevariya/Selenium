package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) {
		
		String brower = "Firefox";
		WebDriver driver = null;
		if(brower.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		}
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		//Thread.sleep(1500);
		
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		driver.findElement(By.name("reg_email__")).sendKeys("dshjfdg@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Dakdndcxz");

	}

}
