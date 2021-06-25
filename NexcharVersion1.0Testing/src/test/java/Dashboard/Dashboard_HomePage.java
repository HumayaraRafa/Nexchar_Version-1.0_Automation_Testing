package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard_HomePage {
         
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
	    // WebDriverManager.chromedriver().setup();
		WebDriver driver= new FirefoxDriver();
	     //WebDriver driver= new ChromeDriver();
		
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
				
	   //Dash board Drop down check
				//WebElement dropdown = driver.findElement(By.xpath("//div[@class='navbar-nav flex-row order-md-last']//div[@class='nav-item dropdown']//a[@class='nav-link d-flex lh-1 text-reset p-0']//div[@class='d-none d-xl-block ps-2']"));
				//WebElement dropdown = driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) header.navbar.navbar-expand-md.navbar-light.d-none.d-lg-flex.d-print-none:nth-child(2) div.container-xl div.navbar-nav.flex-row.order-md-last div.nav-item.dropdown:nth-child(2) a.nav-link.d-flex.lh-1.text-reset.p-0 > div.d-none.d-xl-block.ps-2"));
				
				//driver.findElement(By.xpath("//a[@class='nav-link d-flex lh-1 text-reset p-0 show']//div[@class='d-none d-xl-block ps-2']")).click();
				//driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) header.navbar.navbar-expand-md.navbar-light.d-none.d-lg-flex.d-print-none:nth-child(2) div.container-xl div.navbar-nav.flex-row.order-md-last div.nav-item.dropdown:nth-child(2) a.nav-link.d-flex.lh-1.text-reset.p-0.show > div.d-none.d-xl-block.ps-2")).click();
			    
				driver.findElement(By.className("d-none d-xl-block ps-2"));
				
				//WebElement dropdown = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/a[1]/div[1]"));
				
				
				driver.findElement(By.cssSelector(".btn-primary")).click();
			    driver.findElement(By.cssSelector(".show > .avatar")).click();
			    driver.findElement(By.linkText("Ticket")).click();
			    driver.findElement(By.cssSelector(".show > .avatar")).click();
			    driver.findElement(By.linkText("LogOut")).click();
					
}

}
