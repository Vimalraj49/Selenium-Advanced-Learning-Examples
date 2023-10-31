package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendersExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml");
		
		WebElement Calender = driver.findElement(By.xpath("//a[contains(text(),'5')]"));
		Calender.click();
		
		Thread.sleep(2000);//need to learn how to use wait
		
		WebElement Title = driver.findElement(By.xpath("//input[@id='j_idt87:title']"));
		Title.sendKeys("Teachers day");
		Thread.sleep(2000);
		
		WebElement checkbox = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		checkbox.click();
		
		Thread.sleep(2000);
		
		WebElement Save = driver.findElement(By.xpath("//button[@id='j_idt87:addButton']"));
		Save.click();
		
		
	}

}
