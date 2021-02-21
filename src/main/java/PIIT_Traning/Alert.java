package PIIT_Traning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Storage\\Driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			
			driver.manage().window(). maximize();
			
			WebElement alt=driver.findElement(By.name("submit"));
			
			alt.click();
			
			Thread.sleep(4000);
			
		    //driver.switchTo().alert().accept();
			
			driver.switchTo().alert().accept();
			
			driver.switchTo().alert().dismiss();
			
			
			
			
			
			
		
		
		
		
		
		
		

	}

}
