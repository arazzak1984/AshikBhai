package PIIT_Traning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_control {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Storage\\Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.qatarairways.com/en_us/homepage.html");
			
			driver.manage().window(). maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("cookie-close")).click();
			
			driver.findElement(By.xpath("//*[@id=\"j-main-nav-list\"]/li[2]/a")).click();
			
			WebElement calen=driver.findElement(By.id("T7-departure_1"));
			
			calen.click();
			
			WebElement dts= driver.findElement(By.xpath("(//*[text()='26'])[2]"));
			
			dts.click();
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
