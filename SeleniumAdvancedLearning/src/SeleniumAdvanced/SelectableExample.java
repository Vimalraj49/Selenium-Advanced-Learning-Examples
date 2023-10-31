package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/selectable");
		
		List<WebElement> selectables = driver.findElements(By.xpath("//*[@id=\"selectable\"]"));
		
		System.out.println(selectables.size());//have to use "/li" if created with that parameter in xpath
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).
		click(selectables.get(0)).
		click(selectables.get(1)).
		click(selectables.get(2)).
		click(selectables.get(3)).
		click(selectables.get(4)).
		click(selectables.get(5)).
		click(selectables.get(6)).
		click(selectables.get(7)).
		click(selectables.get(8)).
		build().perform();
		

	}

}
