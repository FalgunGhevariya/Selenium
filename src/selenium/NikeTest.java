package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\\\QA Automation\\\\SeleniumJars\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/ca/");
		
		WebElement menTab = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(menTab).build().perform();
		
		List<WebElement> allOption = driver.findElements(By.xpath("(//div[@id='DesktopMenu-0-1-0']//div)[3]//a"));
		////a[contains(@aria-label,'main-menu, Men, Shoes' )]    can use this as well
		System.out.println(allOption.size());
		for(WebElement option : allOption) {
			System.out.println(option.getText());
		}
		
		
		

	}

}
