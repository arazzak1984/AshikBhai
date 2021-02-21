import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 {

	       public static void main(String[] args) {
	
		    System.setProperty("webdriver.chrome.driver","C:\\\\Selenium_Files\\\\chromedriver_win32/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.com");
			
			driver.manage().window(). maximize();
			
			WebElement Search= driver.findElement(By.id("twotabsearchtextbox"));
		
		    Search.sendKeys("Phone");
		    
		
		    WebElement Searchbutton=driver.findElement(By.id("nav-search-submit-text"));
		 
		    Searchbutton.click();
			
			
			
			
			
			
		
		   
		
		

	}

}
