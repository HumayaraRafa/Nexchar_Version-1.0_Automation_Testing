package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
	
public class Dashboard_PurchasePage {
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
				//click purchase
				driver.findElement(By.linkText("Purchase")).click();
				//add new purchase
				driver.findElement(By.linkText("New Purchase")).click();
				Dashboard_Purchase_Weblocator.itemname(driver).sendKeys("Pantonix 20mg"); 
				//date
				Dashboard_Purchase_Weblocator.date(driver).click();
				driver.findElement(By.cssSelector(".flatpickr-day:nth-child(24)")).click();
				Dashboard_Purchase_Weblocator.date(driver).sendKeys("22-06-2021");
				
				//dropdown outlet
				WebElement dropdown =driver.findElement(By.id("OutletId"));
				dropdown.findElement(By.xpath("//option[@value='08d8e9d6-1105-4a4a-8bf9-47390ae0d876']")).click();
				
				/* //supplier name
				Dashboard_Purchase_Weblocator.supplierName(driver).sendKeys("Huma-(PHARMACY)");
				Dashboard_Purchase_Weblocator.supplierName(driver).sendKeys(Keys.DOWN);
				Dashboard_Purchase_Weblocator.supplierName(driver).sendKeys(Keys.ENTER);
				Dashboard_Purchase_Weblocator.supplierNameid(driver).click(); */
				
				driver.findElement(By.id("SupplierName")).sendKeys("H");
			    driver.findElement(By.id("SupplierName")).sendKeys(Keys.DOWN);
			    driver.findElement(By.id("SupplierName")).sendKeys(Keys.ENTER); 
			    driver.findElement(By.id("SupplierName")).click();
				//Quantity
				Dashboard_Purchase_Weblocator.quantity(driver).click();
				Dashboard_Purchase_Weblocator.quantity(driver).sendKeys("100");
				Dashboard_Purchase_Weblocator.quantity(driver).sendKeys(Keys.ENTER);
				
				/*driver.findElement(By.id("Quantity")).click();
			    driver.findElement(By.id("Quantity")).sendKeys("1000");
			    driver.findElement(By.id("Quantity")).sendKeys(Keys.ENTER);*/
				
                //payment method dropdown1
			    WebElement dropdown1 = driver.findElement(By.id("PaymentMethod"));
			   //dropdown1.findElement(By.xpath("//option[. = 'Debit Card']")).click();
			   //dropdown1.findElement(By.xpath("//option[. = 'Cash')]")).click();
			   //dropdown1.findElement(By.xpath("//option[. = 'Credit Card')]")).click();
			    dropdown1.findElement(By.xpath("//option[. = 'Cheque')]")).click();
			    
			    driver.findElement(By.cssSelector("#PaymentMethod > option:nth-child(2)")).click(); 
				
			    driver.findElement(By.id("AmountPaid")).click();
			    driver.findElement(By.id("AmountPaid")).sendKeys("1000");
			    driver.findElement(By.cssSelector(".btn-primary")).click();
			    
			    Thread.sleep(2000);
				
				//Dashboard_Purchase_Weblocator.cancel(driver).click();
				Dashboard_Purchase_Weblocator.save(driver).click(); 
				
}		

}
