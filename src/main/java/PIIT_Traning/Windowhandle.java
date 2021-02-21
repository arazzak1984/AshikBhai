package PIIT_Traning;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandle {

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
		
			String mainWindoHandles=driver.getWindowHandle();
			
			System.out.println("This is windowhandle");
		
			act.keyDown(driver.findElement(By.id("createAccountSubmit")),Keys.SHIFT).click().build().perform();
			
			act.keyUp(Keys.LEFT_SHIFT).build().perform(); 
			
			Set<String> Multiwindows=driver.getWindowHandles();
			
			for(String window:Multiwindows) {
				
			if(window.equalsIgnoreCase(mainWindoHandles)){
					
			System.out.println("This to switch");
			}else
			driver.switchTo().window(window);
				
		    WebElement name=driver.findElement(By.id("ap_customer_name"));
				
			name.sendKeys("Afia");
				
			/*driver.switchTo().window(mainWindoHandles);
				
			WebElement user2=driver.findElement(By.id("ap_customer_name"));
				
			user2.sendKeys("Afia");*/
				
				

					
				}
			}
			
		
		
		
		
		
		
		
		
		
		

	}


