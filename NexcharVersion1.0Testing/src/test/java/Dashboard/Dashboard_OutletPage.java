package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard_OutletPage {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://nexchar.com/signin");
        /* //Page title capture
		System.out.println("Title of the page:  "+driver.getTitle());
        //current URL capture
		System.out.println("Current URL of the page: "+driver.getCurrentUrl());
        //Capturing page source code
		System.out.println("Page source code: "+driver.getPageSource()); */
		
		//Sign In with all valid info		
	    Dashboard_HomePage_Weblocator.emailaddress(driver).sendKeys("drug_store");
		//Dashboard_HomePage_Weblocator.emailaddress(driver).sendKeys("gift_shop");
		Dashboard_HomePage_Weblocator.password(driver).sendKeys("12345");
		Dashboard_HomePage_Weblocator.rememberme(driver).click();
		Dashboard_HomePage_Weblocator.signin(driver).click();
		
		
}
}