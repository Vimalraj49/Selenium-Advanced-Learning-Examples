package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAdvancedExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		WebElement dashboard = driver.findElement(By.linkText("Go to Dashboard"));
		dashboard.click();
		
		driver.navigate().back();//to go back to previous page
		
		WebElement Findurl = driver.findElement(By.partialLinkText("Find the URL"));//Link or partial linktext both can be used
		String Link = Findurl.getAttribute("href");
		System.out.println("The URL destination is :" + Link);
		
		
		WebElement Broken = driver.findElement(By.linkText("Broken?"));	
		Broken.click();
		
		String ErrorTitle = driver.getTitle();
		if(ErrorTitle.contains("404"))
		{
			System.out.println("This link is broken");
		}
		
		driver.navigate().back();
		
		WebElement dashboardDuplicate = driver.findElement(By.linkText("Go to Dashboard"));
		//will get stale exception error if u dont identify the webelement again after refresh bcoz the properties would be changes
		dashboardDuplicate.click();
		
		driver.navigate().back();
		
		List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));
		int Linksize = TotalLinks.size();
		System.out.println("The Total link in this page :"+Linksize);
		
	
		
	}

}
