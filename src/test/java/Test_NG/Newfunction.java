package Test_NG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Newfunction {
	
	
	public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Annotation is good test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Annotation is good beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  System.out.println("Annotation is good aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  
	 // Driver.("Chrome","https://www.Facebook.com");
	  
	  System.out.println("Annotaion is good beforeclass");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  
	  System.setProperty("webdriver.chrome.driver","C:\\\\Selenium_Files\\\\chromedriver_win32/chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window(). maximize();
	  
	  System.out.println("Annotation is good afterclass");
  }

}
