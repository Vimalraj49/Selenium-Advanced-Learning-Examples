package SeleniumAdvanced;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException   {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement UploadFile = driver.findElement(By.id("j_idt88:j_idt89_input"));
		String File = "C:\\Users\\PC\\Downloads\\sample.xlsx";
		UploadFile.sendKeys(File); 
		
		/*driver.get("https://letcode.in/file");
		WebElement UploadFile = driver.findElement(By.name("resume"));
		String File = "C:\\Users\\PC\\Downloads\\sample.xlsx";
		UploadFile.sendKeys(File);*/
		
		
		/*
		--this method is not working for websites throws exception but study for interview on "robot class"
		 
		//Storing Upload file with location as string
		String File = "C:\\Users\\PC\\Downloads\\sample.xlsx";
		
		//Using String selection to convert above string into a plain text or a transferable string
		StringSelection selection = new StringSelection(File);
		
		//Using toolkit class to get clipboard and sending the string to the clipboard(with no owner which is null)
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//Using Robot class to perform paste and enter operation in windows env
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		

	}

}
