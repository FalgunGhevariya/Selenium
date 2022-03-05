package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		//Thread.sleep(1500);
		
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		driver.findElement(By.name("reg_email__")).sendKeys("dshjfdg@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Dakdndcxz");
		
		Select  day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("10");
		
		Select  month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Jul");
		
		Select  year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("2000");
		
		WebElement radioButtonFemale = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		radioButtonFemale.click();
//		
//		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
//
//		System.out.println(footerLinks.size());
//		for (WebElement link : footerLinks) {
//			System.out.println(link.getText());
//		}
		
		

	}

}
