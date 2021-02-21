package PIIT_Traning;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_1 {

	public static void main(String[] args) throws IOException {
		
		
		Date dt=new Date();
		
		//System.out.println(dt);
		
	 String screenshotdate=dt.toString().replace(" ", "-").replace(":", "-");
		
	 System.out.println(screenshotdate);
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Storage\\Driver/chromedriver.exe");
			
	 WebDriver driver=new ChromeDriver();
			
			
			
	 driver.get("https://www.ebay.com.au/");
			
	 driver.manage().window(). maximize();
			
     File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
     FileHandler.copy(screenshotFile, new File("C:\\Users\\apdaf\\eclipse-workspace\\Traningsession\\Screenshot\\"+screenshotdate+".png"));
			
			
		
		
		
		
		
		
		
		
		

	}

}
