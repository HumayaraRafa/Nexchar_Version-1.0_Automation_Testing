package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard_ItemPage {
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
		
		driver.findElement(By.linkText("Item")).click();
		
		/*//valid info search
		Dashboard_ItemPage_Weblocator.searchbox(driver).sendKeys("Amborx");
		//invalid info search
		Dashboard_ItemPage_Weblocator.searchbox(driver).sendKeys("abcd");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click(); */
		
		//add new item
		//driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary btn-sm')]")).click();
		//click on edit 
		driver.findElement(By.cssSelector("tr:nth-child(1) path:nth-child(3)")).click();
	    driver.findElement(By.linkText("Back")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .btnEdit:nth-child(3)")).click();
		//bar-code click
		//driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[2]//*[local-name()='svg']//*[name()='g']//*[name()='g' and contains(@transform,'matrix(1 0')]")).click();
		
	    //Fill all field
		Dashboard_ItemPage_Weblocator.itemname(driver).sendKeys("Pantonix 20mg");
		Dashboard_ItemPage_Weblocator.description(driver).sendKeys("Pantonix Tablet is a medicine used to reduce acid production in stomach");
		Dashboard_ItemPage_Weblocator.SKU(driver).sendKeys("100");
		Dashboard_ItemPage_Weblocator.barcode(driver).sendKeys("111222");
		Dashboard_ItemPage_Weblocator.quantity(driver).sendKeys("100");
		Dashboard_ItemPage_Weblocator.retail(driver).sendKeys("10000");
		Dashboard_ItemPage_Weblocator.costperitem(driver).sendKeys("100");
		Dashboard_ItemPage_Weblocator.unit(driver).sendKeys("10");
		Dashboard_ItemPage_Weblocator.weight(driver).sendKeys("100");
		Dashboard_ItemPage_Weblocator.size(driver).sendKeys("1");
		Dashboard_ItemPage_Weblocator.color(driver).sendKeys("#ff8000"); 
		
		Dashboard_ItemPage_Weblocator.status(driver).click();
		//dropdown menu select status
		WebElement dropdown = driver.findElement(By.id("Status"));
		driver.findElement(By.xpath("//option[@value='Active']")).click();
		//driver.findElement(By.xpath("//option[@value='Draft']")).click();
		
		//Dashboard_ItemPage_Weblocator.defaultimage(driver).click();
		
		//dropdown1 category
		WebElement dropdown1 =driver.findElement(By.id("CategoryId"));
		//driver.findElement(By.xpath("//option[@value='08d8e9d7-0e99-401e-8184-d901f310d93f']")).click();
		//driver.findElement(By.xpath("//option[@value='08d8e9d7-2430-4710-8669-0031360282fd']")).click();
		driver.findElement(By.xpath("//option[@value='08d927ef-7c9e-4977-840f-c50c3c9ea604']")).click();
		
		Dashboard_ItemPage_Weblocator.supplierName(driver).sendKeys("Huma");
		//Dashboard_ItemPage_Weblocator.defaultimage(driver).click();
		
		Dashboard_ItemPage_Weblocator.saleschannels(driver).click();
		driver.findElement(By.xpath("//label[contains(text(),'Point Of Sale')]")).click();
	    driver.findElement(By.xpath("//label[contains(text(),'Marketplace')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Ecommerce')]")).click();
		
		Thread.sleep(2000);
		
		//Dashboard_ItemPage_Weblocator.cancel(driver).click();
		Dashboard_ItemPage_Weblocator.save(driver).click(); 
		
	}

}
