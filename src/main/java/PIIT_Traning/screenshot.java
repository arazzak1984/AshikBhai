package PIIT_Traning;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Storage\\Driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.qatarairways.com/en_us/homepage.html");
			
			driver.manage().window(). maximize();
			
			Date currentdate=new Date();
			
			System.out.println(currentdate);
			
			String screenshotdate=currentdate.toString().replace(" ", "-").replace(":", "-");
			
			System.out.println(screenshotdate);
			
			
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(src, new File("C:\\Users\\apdaf\\eclipse-workspace\\Traningsession\\airlines"+screenshotdate+".png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
