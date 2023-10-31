package SeleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		//1----------
		String OldWindow = driver.getWindowHandle();
		
		WebElement OpenButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]"));
		OpenButton.click();		
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);
		}
		
		WebElement EmailInput=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		EmailInput.sendKeys("Testing@gmail.com");
		
		driver.close();
		
		driver.switchTo().window(OldWindow);
		
		//2------------
		WebElement OpenMultiple = driver.findElement(By.id("j_idt88:j_idt91"));
		OpenMultiple.click();
		
		int numofwindows = driver.getWindowHandles().size();
		System.out.println("Num of opened windows: "+numofwindows);
		
		//3-------------
		WebElement CloseWindows = driver.findElement(By.id("j_idt88:j_idt93"));
		CloseWindows.click();
		Thread.sleep(3000);
		
		Set<String> WindowHandles = driver.getWindowHandles();
		for (String CurrentWindow : WindowHandles) {
			if(!CurrentWindow.equals(OldWindow))
			{
				driver.switchTo().window(CurrentWindow);
				driver.close();
			}
		} 
		
	}

}
