package PIIT_Traning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Selenium Storage\\Driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.com");
			
			driver.manage().window(). maximize();
			
			Actions act=new Actions(driver);
			
			act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
			
			Thread.sleep(3000);
			
			act.moveToElement(driver.findElement(By.xpath("(//span[ text()='Sign in'])[1]"))).click().build().perform();
			
			act.keyDown(driver.findElement(By.id("createAccountSubmit")),Keys.SHIFT).click().build().perform();
			
			
			
			
		
		
		
		
		
		

	}

}
