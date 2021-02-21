package PIIT_Traning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver",  "C:\\Selenium Storage\\Driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.jqueryui.com/droppable");
			
			driver.manage().window(). maximize();
			
			Actions ace=new Actions(driver);
			
			Thread.sleep(3000);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy (0,1000)");
			
			
			driver.switchTo().frame(0);
			
			WebElement drag=driver.findElement(By.id("draggable"));
			
			WebElement drop=driver.findElement(By.id("droppable"));
			
			ace.dragAndDrop(drag, drop).build().perform();
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
