package OldPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PreviousContactPage {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
				driver.get("https://nexchar.com/contactus");
				
				 //Page Title
					System.out.println("Title of the page: " +driver.getTitle());
				//current URL capture
					System.out.println("Current URL of the page: "+driver.getCurrentUrl());
				//Capturing page source code
					System.out.println("Page source code: "+driver.getPageSource());
					
					//Image_Button
				    //facebook_button
				    driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) div.content:nth-child(4) div.container-xl div.row.row-cards div.col-sm-6.col-lg-6:nth-child(1) div.card.card-body div.col-12:nth-child(4) ul.nav:nth-child(2) li:nth-child(1) a:nth-child(1) > img:nth-child(1)")).click();
				    
				    Thread.sleep(2000);
					driver.findElement(By.linkText("Home")).click();
					
					driver.findElement(By.linkText("Contact")).click();
					
					//twitter_button
					driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) div.content:nth-child(4) div.container-xl div.row.row-cards div.col-sm-6.col-lg-6:nth-child(1) div.card.card-body div.col-12:nth-child(4) ul.nav:nth-child(2) li:nth-child(2) a:nth-child(1) > img:nth-child(1)")).click();
				
				
				//Form fill up(with fill all box)	
					driver.findElement(By.id("FullName")).click();
				    driver.findElement(By.id("FullName")).sendKeys("Rafaaa");
				    driver.findElement(By.id("Email")).click();
				    driver.findElement(By.id("Email")).sendKeys("qwer2@gmail.com");
				    driver.findElement(By.id("Query")).click();
				    {
				      WebElement dropdown = driver.findElement(By.id("Query"));
				      
				    //type of select inquiry options 
				     dropdown.findElement(By.xpath("//option[. ='General']")).click();
				    //dropdown.findElement(By.xpath("//option[. = 'Suggest a feature']")).click();
				    //dropdown.findElement(By.xpath("//option[. = 'Report a bug']")).click();
				    }
				    
				    driver.findElement(By.cssSelector("option:nth-child(1)")).click();
				    //driver.findElement(By.cssSelector("option:nth-child(2)")).click();
				    //driver.findElement(By.cssSelector("option:nth-child(3)")).click();
				    
				    driver.findElement(By.id("Message")).click();
				    driver.findElement(By.id("Message")).sendKeys("qwert");
				    driver.findElement(By.cssSelector(".btn-primary")).click(); 
				   
				  //form fill up without name   
				    driver.findElement(By.id("FullName")).click();
				    driver.findElement(By.id("Email")).click();
				    driver.findElement(By.id("Email")).sendKeys("ascdfv");
				    driver.findElement(By.id("Message")).click();
				    driver.findElement(By.id("Message")).sendKeys("V vc ");
				    driver.findElement(By.cssSelector(".btn-primary")).click();
				    
				   Thread.sleep(2000);
				    
				    driver.findElement(By.linkText("Privacy Policy")).click();
				    driver.findElement(By.linkText("Terms of Use")).click();
				    driver.findElement(By.cssSelector(".nav-item:nth-child(4) .nav-link-title")).click();
				    
		
	}
	

}
