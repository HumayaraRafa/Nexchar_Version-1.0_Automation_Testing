package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn_Weblocator {
	
	private static WebElement element=null;
	
	public static WebElement emailaddress(WebDriver driver)
	{
     element=driver.findElement(By.id("Email"));
     return element;
    }
	
	
	public static WebElement password(WebDriver driver)
	{
     element=driver.findElement(By.id("Password"));
     return element;
    }
		
	public static WebElement forgotpassword(WebDriver driver)
	{
	 element=driver.findElement(By.linkText("I forgot password"));
	 return element;
	}
    
     
	public static WebElement rememberme(WebDriver driver)
	{
     element=driver.findElement(By.id("RememberMe"));
     return element;
    }
	
	
	public static WebElement signin(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//button[@type='submit']"));
     return element;
     
    }
	
	public static WebElement resetpassword(WebDriver driver)
	{
	element=driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']"));
	return element;		
		
			}
}