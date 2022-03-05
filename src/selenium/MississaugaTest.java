package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mississauga.ca/");
		
		WebElement ourOrgaTab = driver.findElement(By.xpath("//button[contains(text(),'Our organization')]"));
		ourOrgaTab.click();
		List<WebElement> allOrgaOption = driver.findElements(By.xpath("//nav[@id='com-main-navbar']/div/ul/li[3]/ul//li//a"));
		System.out.println(allOrgaOption.size());
		
		for(WebElement option : allOrgaOption) {
			System.out.println(option.getText());
		}
		
		for(WebElement option : allOrgaOption) {
			if(option.getText().equals("Jobs and volunteer")) {
				option.click();
				break;
			}
		}
		
		
		
		

	}

}
