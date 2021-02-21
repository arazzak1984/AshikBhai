      package PIIT_Traning;

      import org.openqa.selenium.WebDriver;
      import org.openqa.selenium.chrome.ChromeDriver;

      public class Traning_com {

	   public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Selenium Storage\\Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window(). maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		 
		driver.close();
		
		

	}

}
