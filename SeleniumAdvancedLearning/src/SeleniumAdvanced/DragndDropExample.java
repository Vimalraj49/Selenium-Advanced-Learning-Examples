package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");

		WebElement from = driver.findElement(By.id("form:drag"));
		WebElement to = driver.findElement(By.id("form:drop"));

		Actions actions = new Actions(driver);
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		//actions.dragAndDrop(from, to).build().perform();--same above action another way
		}

}
