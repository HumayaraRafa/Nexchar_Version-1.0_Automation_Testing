package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ContactPage_Weblocator {
		
private static WebElement element=null;
	
	public static WebElement fullname(WebDriver driver)
	{
     element=driver.findElement(By.id("FullName"));
     return element;
    }
	
	public static WebElement emailaddress(WebDriver driver)
	{
     element=driver.findElement(By.id("Email"));
     return element;
    }
	
	public static WebElement inquirytype(WebDriver driver)
	{
     element=driver.findElement(By.id("Query"));
     return element;
    }
			
	
	public static WebElement messagebox(WebDriver driver)
	{
     element=driver.findElement(By.id("Message"));
     return element;
    }
					
	public static WebElement send(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//button[@type='submit']"));
     return element;
     
    }			
	
	public static WebElement facebook(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//img[@src='/images/svg/facebook.svg']"));
     return element;
     
    }
	
	
	public static WebElement Twitter(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//img[@src='/images/svg/twitter.svg']"));
     return element;
     
    }
	
}	


