package OldPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PreviousSignInPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
//URL visit
		driver.get("https://www.nexchar.com/signin");
		
		/*//Page title capture
		System.out.println("Title of the page:  "+driver.getTitle());
//current URL capture
		System.out.println("Current URL of the page: "+driver.getCurrentUrl());
//Capturing page source code
		System.out.println("Page source code: "+driver.getPageSource());
		
		//Sign In with valid Info
		/*driver.findElement(By.id("Email")).click();
	    driver.findElement(By.id("Email")).sendKeys("gift_shop");
	    driver.findElement(By.id("Password")).click();
	    driver.findElement(By.id("Password")).sendKeys("12345");
	    driver.findElement(By.id("RememberMe")).click();
	    driver.findElement(By.cssSelector(".btn-primary")).click();*/
		
	    
		/* //Forgot Password Button
	    driver.findElement(By.id("Email")).click();
	    driver.findElement(By.id("Password")).sendKeys("1234567890-=");
	    driver.findElement(By.id("Email")).sendKeys("humayarachy.rafa@gmail.com");
	    driver.findElement(By.linkText("I forgot password")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("Email")).sendKeys("humayarachy.rafa@gmail.com");
	    driver.findElement(By.cssSelector(".icon")).click();*/
		
		
		//Sign In with wrong & blank password
		driver.findElement(By.id("Email")).click();
	    driver.findElement(By.id("Email")).sendKeys("gift_shop");
	    driver.findElement(By.id("Password")).click();
	    driver.findElement(By.id("Password")).sendKeys("12345");
	    //driver.findElement(By.id("Password")).sendKeys("123456");
	    //driver.findElement(By.id("Password")).sendKeys("        ");
	    driver.findElement(By.id("RememberMe")).click();
	    driver.findElement(By.cssSelector(".btn-primary")).click();
		
		
	}

}
