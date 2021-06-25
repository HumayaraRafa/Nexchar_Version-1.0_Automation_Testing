package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactPage {
public static void main(String[] args) throws InterruptedException{

	WebDriverManager.firefoxdriver().setup();
	WebDriver driver= new FirefoxDriver();
	
	        //URL visit
			driver.get("https://nexchar.com/contactus");
			
			 /*//Page Title
				System.out.println("Title of the page: " +driver.getTitle());
			//current URL capture
				System.out.println("Current URL of the page: "+driver.getCurrentUrl());
			//Capturing page source code
				System.out.println("Page source code: "+driver.getPageSource());*/
				
	        //Input valid info
				ContactPage_Weblocator.fullname(driver).sendKeys("ABCDF");
				//ContactPage_Weblocator.fullname(driver).sendKeys("        ");
				ContactPage_Weblocator.emailaddress(driver).sendKeys("qazwm1234@gmail.com");
				//ContactPage_Weblocator.emailaddress(driver).sendKeys("qazwtxgmailcom");
				ContactPage_Weblocator.inquirytype(driver).click();
				
			//Inquiry Type
		        WebElement dropdown = driver.findElement(By.id("Query"));
		        //dropdown.findElement(By.xpath("//option[@value='General']")).click();
		        dropdown.findElement(By.xpath("//option[@value='Suggest a feature']")).click();
		        //dropdown.findElement(By.xpath("//option[@value='Report a bug']")).click();
		        

		        //dropdown.findElement(By.cssSelector("option:nth-child(1)")).click();
		        dropdown.findElement(By.cssSelector("option:nth-child(2)")).click();
		        //dropdown.findElement(By.cssSelector("option:nth-child(3)")).click();
		        
		        
		        ContactPage_Weblocator.messagebox(driver).sendKeys("hello hi bye bye");
		        
		  Thread.sleep(2000);
		        ContactPage_Weblocator.send(driver).click(); 
				
		     /* //new tab open
				driver.switchTo().newWindow(WindowType.TAB);
				
			   //open another URL
				driver.navigate().to("https://www.nexchar.com/");
				
				Thread.sleep (3000);
				
			    //tab close
				driver.close();  */
		        
		        
       }
}
