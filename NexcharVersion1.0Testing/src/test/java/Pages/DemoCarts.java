package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCarts {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\OneDrive\\Desktop\\Nexchar\\NexcharProject\\Drivers\\geckodriver\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://nexchar.com/demo");
		
		/* //Page Title
		System.out.println("Title of the page: " +driver.getTitle());
		//current url capture
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		
	    //Demo carts click
		driver.findElement(By.xpath("//div[@class='card card-sm demo-col-1 demo-col-1']//div[@class='col-12 div-demo']")).click();
		driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) div.content:nth-child(4) div.container-xl div.row.row-cards div.col-sm-6.col-lg-3:nth-child(2) div.card.card-sm.demo-col-2 > div.col-12.div-demo")).click();
	    driver.findElement(By.xpath("//body[@class='antialiased']/div[@class='page']/div[@class='content']/div[@class='container-xl']/div[@class='row row-cards']/div[3]")).click();
	    driver.findElement(By.xpath("//body[@class='antialiased']/div[@class='page']/div[@class='content']/div[@class='container-xl']/div[@class='row row-cards']/div[4]")).click();
	    driver.findElement(By.xpath("//body[@class='antialiased']/div[@class='page']/div[@class='content']/div[@class='container-xl']/div[@class='row row-cards']/div[5]")).click();
	    driver.findElement(By.xpath("//body[@class='antialiased']/div[@class='page']/div[@class='content']/div[@class='container-xl']/div[@class='row row-cards']/div[6]")).click();
	    driver.findElement(By.xpath("//body[@class='antialiased']/div[@class='page']/div[@class='content']/div[@class='container-xl']/div[@class='row row-cards']/div[7]")).click();
	    driver.findElement(By.xpath("//body[@class='antialiased']/div[@class='page']/div[@class='content']/div[@class='container-xl']/div[@class='row row-cards']/div[8]")).click();
	    */ 
		
		//Page Refresh
		driver.navigate().refresh(); 
	
		//new tab open
		driver.switchTo().newWindow(WindowType.TAB);
		
	   //open another URL
		driver.navigate().to("https://www.nexchar.com/contactus");
		
		Thread.sleep (3000);
		
	    //tab close
		driver.close();
		//driver.quit();
		
		//Footer Part
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.findElement(By.linkText("Terms of Use")).click();
		driver.findElement(By.linkText("Contact")).click();
	}

}

