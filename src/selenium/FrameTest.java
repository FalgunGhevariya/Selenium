package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "N:\\QA Automation\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> elements = driver.findElements(By.xpath("//a[text()='Sortable']"));
		System.out.println(elements.size());
		if (elements.size() > 0) {
			System.out.println("Elements Present");
		} else {
			System.out.println("Element is not Present");
		}

		driver.switchTo().frame(0);// by Index
//		driver.switchTo().frame("demo-frame");//by Name must have name or id
//		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //By web element
		List<WebElement> box = driver.findElements(By.id("draggable"));
		System.out.println(box.size());
		if (box.size() > 0) {
			System.out.println("Elements Present");
		} else {
			System.out.println("Element is not Present");
		}
		
		driver.switchTo().defaultContent();
		
		elements = driver.findElements(By.xpath("//a[text()='Sortable']"));
		System.out.println(elements.size());
		if (elements.size() > 0) {
			System.out.println("Elements Present");
		} else {
			System.out.println("Element is not Present");
		}

	}

}
