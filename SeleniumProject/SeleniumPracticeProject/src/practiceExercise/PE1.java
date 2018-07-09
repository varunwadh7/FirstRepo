package practiceExercise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PE1 {

	WebDriver driver;
	String appUrl = "http://www.store.demoqa.com"; 

  @Test
  public void f() {
      try{ 
		  String titleName = driver.getTitle();
		  
		  System.out.println("Title of the page: " + titleName);
		  int titleLength = titleName.length();
		  System.out.println("Title length: " + titleLength);
		  String currentUrl = driver.getCurrentUrl();
		  
		  if(currentUrl.equalsIgnoreCase(appUrl)) 
		  {
			  System.out.println("Correct Page opened");
		  }
		  
		  else 
		  { 
			  System.out.println("Incorrect page opened");
		  }
		  
		  String pageSource = driver.getPageSource();
		  int pageSourceLength = pageSource.length();
		  
		  System.out.println("Page source length: "+pageSourceLength);
	   	 }
      catch(Exception e)
      {
    	System.out.println(e);  
      }
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {	  
	  
	  //Setting up system properties	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varun\\Desktop\\Drivers\\chromedriver.exe");
	  
	  //initiating variable
	  driver = new ChromeDriver();
	  //opening the application
	  driver.get(appUrl);
	  
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  //closing the current window
	  driver.close();
	  //closing all windows
	  driver.quit();
  }

}
