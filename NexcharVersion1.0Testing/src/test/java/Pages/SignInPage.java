package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInPage {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
				driver.get("https://nexchar.com/signin");
		//Page title capture
				System.out.println("Title of the page:  "+driver.getTitle());
		//current URL capture
				System.out.println("Current URL of the page: "+driver.getCurrentUrl());
		//Capturing page source code
				System.out.println("Page source code: "+driver.getPageSource());
				
	   //Sign In with all valid info		
				SignIn_Weblocator.emailaddress(driver).sendKeys("gift_shop");
				SignIn_Weblocator.password(driver).sendKeys("12345");
			    SignIn_Weblocator.rememberme(driver).click();
				SignIn_Weblocator.signin(driver).click();
				
		//Sign In with wrong & blank password
				SignIn_Weblocator.emailaddress(driver).sendKeys("gift_shop");
				SignIn_Weblocator.password(driver).sendKeys("123456");
				//SignIn_Weblocator.rememberme(driver).click();
				SignIn_Weblocator.signin(driver).click(); 
				
		//Forgot Password Button
				SignIn_Weblocator.emailaddress(driver).sendKeys("humayarachy.rafa@gmail.com");
				SignIn_Weblocator.password(driver).sendKeys("1234567890-=");
				SignIn_Weblocator.forgotpassword(driver).click();
				
				Thread.sleep(2000);
				
				SignIn_Weblocator.emailaddress(driver).sendKeys("humayarachy.rafa@gmail.com");
				SignIn_Weblocator.resetpassword(driver).click(); 
				  
	}
}