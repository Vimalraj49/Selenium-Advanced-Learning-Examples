package SeleniumAdvanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class XclDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/file");
		
		WebElement DownloadXcel = driver.findElement(By.id("xls"));
		DownloadXcel.click();
		
		Thread.sleep(3000);
		//C:\Users\PC\Downloads
		
		File filelocation = new File("C:\\Users\\PC\\Downloads");
		
		File[] TotalFiles = filelocation.listFiles();
		
		for (File file : TotalFiles) {
			
			if(file.getName().equals("sample.xlsx"))
			{
				System.out.println("The file is downloaded");
				break;
			}
		}

	}

}
