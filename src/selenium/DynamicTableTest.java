package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		System.out.println(row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]//td"));
		System.out.println(col.size());
		
		
		for(int i =2 ; i <= row.size();i++) {
			for(int j=1 ; j<=col.size(); j++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]")).getText()+"    ");
			}
			System.out.println();
		}

	}

}
