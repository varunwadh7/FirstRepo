package executionEngine;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DriverScript {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Setting up system properties	
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varun\\Desktop\\Drivers\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  String appUrl = "http://store.demoqa.com/";
		  //initiating variable
		  driver = new ChromeDriver();
		  //opening the application
		  driver.get(appUrl);
		  
		  driver.findElement(By.xpath("//*[@id=\"account\"]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"log\"]")).sendKeys("testuser_3");
		  driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("Test@123");
		  driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

	}

}
