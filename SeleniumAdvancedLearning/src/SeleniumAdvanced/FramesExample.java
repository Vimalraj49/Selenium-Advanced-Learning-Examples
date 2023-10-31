package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		String Text = driver.findElement(By.id("Click")).getText();
		System.out.println(Text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		button2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		System.out.println("total frames: "+totalframes.size());

	}

}
