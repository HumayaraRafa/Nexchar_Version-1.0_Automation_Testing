package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPage {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
	    //URL visit
		driver.get("https://nexchar.com/signup");
       /*//Page title capture
		System.out.println("Title of the page:  "+driver.getTitle());
		//current URL capture
		System.out.println("Current URL of the page: "+driver.getCurrentUrl());
		//Capturing page source code
		System.out.println("Page source code: "+driver.getPageSource()); */
		
		
		//Sign up with filled box
		SignUp_Weblocator.customername(driver).sendKeys("abcd");
		SignUp_Weblocator.categorytype(driver).click();
		
		//CategoryType
		WebElement dropdown = driver.findElement(By.id("CategoryId"));
		
		//Drop-down all category menu 
	      dropdown.findElement(By.xpath("//option[@value='2']")).click();
	    /*dropdown.findElement(By.xpath("//option[@value='1']")).click();
	      dropdown.findElement(By.xpath("//option[@value='3']")).click();
	      dropdown.findElement(By.xpath("//option[@value='4']")).click();
	      dropdown.findElement(By.xpath("//option[@value='5']")).click();
	      dropdown.findElement(By.xpath("//option[@value='6']")).click();
	      dropdown.findElement(By.xpath("//option[@value='9']")).click();
	      dropdown.findElement(By.xpath("//option[@value='10']")).click();
	      dropdown.findElement(By.xpath("//option[@value='11']")).click();
	      dropdown.findElement(By.xpath("//option[@value='50']")).click(); */
	      
	      driver.findElement(By.cssSelector("option:nth-child(2)")).click();
	   /* driver.findElement(By.cssSelector("option:nth-child(1)")).click();
		  driver.findElement(By.cssSelector("option:nth-child(3)")).click();
		  driver.findElement(By.cssSelector("option:nth-child(4)")).click();
		  driver.findElement(By.cssSelector("option:nth-child(5)")).click();
		  driver.findElement(By.cssSelector("option:nth-child(6)")).click();
		  driver.findElement(By.cssSelector("option:nth-child(9)")).click();
		  driver.findElement(By.cssSelector("option:nth-child(10)")).click();
		  driver.findElement(By.cssSelector("option:nth-child(11)")).click();
		  driver.findElement(By.cssSelector("option:nth-child(50)")).click(); */
		
		Thread.sleep(1000);
		
		SignUp_Weblocator.emailbox(driver).sendKeys("efgh128@gmail.com");
		//without domain
		//SignUp_Weblocator.emailbox(driver).sendKeys("efgh123com");
		
		SignUp_Weblocator.password(driver).sendKeys("abcdef1234567");
		//wrong or blank password field
		//SignUp_Weblocator.password(driver).sendKeys("        ");
		
		SignUp_Weblocator.showpassword(driver).click();
		SignUp_Weblocator.tickoption(driver).click();
		SignUp_Weblocator.createnewaccount(driver).click();
				
	}

}