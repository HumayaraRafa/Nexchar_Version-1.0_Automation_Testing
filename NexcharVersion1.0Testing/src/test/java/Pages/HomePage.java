package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Asus\\OneDrive\\Desktop\\Nexchar\\NexcharProject\\Drivers\\geckodriver\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://nexchar.com/");
		
		Thread.sleep(3000);
		
		
	   /* //Page title capture
			System.out.println("Title of the page:  "+driver.getTitle());
		
			//current URL capture
			System.out.println("Current url of the page: "+driver.getCurrentUrl());
		
			//Capturing page source code
			System.out.println("Page source code: "+driver.getPageSource()); */
		
			//for windows maximize
		/*driver.manage().window().maximize();
		
		//3 sec delay
		Thread.sleep(3000);
		
		//for windows minimize
		driver.manage().window().minimize(); */
		
		//for windows full screen
		//driver.manage().window().fullscreen();
		
		//Navigate
		/*driver.navigate().to("https://daraz.com.bd/");
		
		//BackNavigate
		driver.navigate().back();
		
		//ForwardNavigate
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		//Page Refresh
		driver.navigate().refresh(); */
			
		//new tab open
			driver.switchTo().newWindow(WindowType.TAB);
			
		//open another URL
			driver.navigate().to("https://nexchar.com/demo");
			//driver.navigate().to("https://www.nexchar.com/contactus");
			
			
		//tab close
			driver.close();
			//driver.quit();
		
	 //HomePage through Sign up/Try/Footer Part
			
			//driver.findElement(By.linkText("Sign up now")).click();
		    //driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();
			driver.findElement(By.linkText("Home")).click();
			//driver.findElement(By.linkText("Privacy Policy")).click();
			//driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) footer.footer.footer-transparent.d-print-none:nth-child(8) div.container div.row.text-center.align-items-center.flex-row-reverse div.col-lg-auto.ms-lg-auto ul.list-inline.list-inline-dots.mb-0 li.list-inline-item:nth-child(1) > a.link-secondary")).click();
			//driver.findElement(By.linkText("Home")).click();
			driver.findElement(By.linkText("Terms of Use")).click();
			driver.findElement(By.linkText("Contact")).click();
	}

} 
