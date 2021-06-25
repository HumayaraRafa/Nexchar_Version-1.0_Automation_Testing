package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp_Weblocator {
	
	private static WebElement element=null;
	
	public static WebElement customername(WebDriver driver)
	{
     element=driver.findElement(By.id("Name"));
     return element;
    }
	
	public static WebElement categorytype(WebDriver driver)
	{
     element=driver.findElement(By.id("CategoryId"));
     return element;
    }
	
	
	public static WebElement emailbox(WebDriver driver)
	{
     element=driver.findElement(By.id("Email"));
     return element;
    }
	
	
	public static WebElement password(WebDriver driver)
	{
     element=driver.findElement(By.id("Password"));
     return element;
    }
	
	
	public static WebElement tickoption(WebDriver driver)
	{
     element=driver.findElement(By.id("NotReceiveNewsLetter"));
     return element;
    }
	
	
	public static WebElement showpassword(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//*[@class='icon']"));
     return element;
    }
	
	
	
	public static WebElement createnewaccount(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//button[@type='submit']"));
     return element;
     
    }
	
}