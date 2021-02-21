package Home_Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	
	public WebDriver driver;
	
	@FindBy(name="email")
	
	WebElement emailfildKeys;
	
	@FindBy(name="pass")
	
	WebElement pssfindKeys;
	
	@FindBy(name="login")
	
	WebElement sign;
	
	Pom(WebDriver driver){
		
	this.driver=driver;
	
	PageFactory.initElements(driver, driver);
	
	}
	public void emailfildKeys() {
		
		emailfildKeys.sendKeys("afiaapd@yahoo.com");
	}
	
	public void pssfindKeys() {
		
		pssfindKeys.sendKeys("123");
		
	}
	public void sign() {
		
		sign.click();
	}
	
	
	
	
	
	
	
	

}
