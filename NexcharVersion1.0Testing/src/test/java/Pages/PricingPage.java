package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PricingPage {
	public static void main(String[] args) {
		
		//webdrivermanager setup
		WebDriverManager.firefoxdriver().setup();
		//webdriver object creation
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://nexchar.com/pricing");
		
	/*	//Page Title
			System.out.println("Title of the page: " +driver.getTitle());
		//current url capture
			System.out.println("Current url of the page: "+driver.getCurrentUrl());
		//Capturing page source code
			System.out.println("Page source code: "+driver.getPageSource());
				
			//Page Refresh
			driver.navigate().refresh(); */
		
			
			//Footer Part
			driver.findElement(By.linkText("Privacy Policy")).click();
			driver.findElement(By.linkText("Terms of Use")).click();
			driver.findElement(By.linkText("Contact")).click();
	}

}
