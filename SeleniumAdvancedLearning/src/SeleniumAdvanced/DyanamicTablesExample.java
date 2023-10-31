package SeleniumAdvanced;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicTablesExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "F:\\Selenium learning\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		WebElement table = driver.findElement(By.id("shopping"));//getting specific table from the webpage as more than one table present
		WebElement t1body = table.findElement(By.tagName("tbody"));//navigating to the body and skipping the header
		List<WebElement> t1rows = t1body.findElements(By.tagName("tr"));//navigating to the rows where elements and data present 
		
		System.out.println("Shopping table rows: "+t1rows.size());//just validation
		
		int total = 0;//for add intialization
		//for loop to access single row from the list of rows in "t1rows"
		for (int i = 0; i < t1rows.size(); i++)
		{
		
		List<WebElement> t1coloumns = t1rows.get(i).findElements(By.tagName("td"));//isolating each data cell or can call as seperate coloumn from the current row in operation
		
		if(t1coloumns.size() == 2)//just validation
		{
			String PriceText = t1coloumns.get(1).getText();//getting text from the webelement 
			int Price = Integer.parseInt(PriceText);//converting text into integer 
			
			total = total+Price;//final sum value	
		}	
		}
		
		int expectedtotal = 858;
		if(total == expectedtotal)
		{
			System.out.println("The Total is correct.");
		}else 
		{
			System.out.println("The Total is Wrong");
		}
		
		//Second Table
		
		WebElement table2 = driver.findElement(By.id("simpletable"));
		WebElement t2body = table2.findElement(By.tagName("tbody"));
		List<WebElement> t2rows = t2body.findElements(By.tagName("tr"));
		
		for (int i = 0; i < t2rows.size(); i++) {
			
		List<WebElement> t2coloumns = t2rows.get(i).findElements(By.tagName("td"));
		String Lastname = t2coloumns.get(1).getText();
		
		System.out.println(Lastname);//just validation
		
		if(Lastname.equals("Raj"))
		{
			WebElement input = t2coloumns.get(3).findElement(By.tagName("input"));
			input.click();
			break;
		}
		}
		
		
	}
	}

