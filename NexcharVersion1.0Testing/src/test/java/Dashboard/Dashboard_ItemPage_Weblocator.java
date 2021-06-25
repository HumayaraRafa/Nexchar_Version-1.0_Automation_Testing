package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_ItemPage_Weblocator {
	
private static WebElement element=null;
	
	public static WebElement searchbox(WebDriver driver)
	{
     element=driver.findElement(By.id("txtSearch"));
     return element;
    }
	
	public static WebElement itemname(WebDriver driver)
	{
     element=driver.findElement(By.id("Name"));
     return element;
    }
	 
	public static WebElement description(WebDriver driver)
	{
     element=driver.findElement(By.id("Description"));
     return element;
    }
	public static WebElement SKU(WebDriver driver)
	{
     element=driver.findElement(By.id("SKU"));
     return element;
    }
	
	public static WebElement barcode(WebDriver driver)
	{
     element=driver.findElement(By.id("Barcode"));
     return element;
    }
	
	public static WebElement quantity(WebDriver driver)
	{
     element=driver.findElement(By.id("Outlets_0__Quantity"));
     return element;
    }
	public static WebElement retail(WebDriver driver)
	{
     element=driver.findElement(By.id("RetailPrice"));
     return element;
    }
	public static WebElement costperitem(WebDriver driver)
	{
     element=driver.findElement(By.id("CostPerItem"));
     return element;
    }
	public static WebElement unit(WebDriver driver)
	{
     element=driver.findElement(By.id("Unit"));
     return element;
    }
	public static WebElement weight(WebDriver driver)
	{
     element=driver.findElement(By.id("Weight"));
     return element;
    }
	public static WebElement size(WebDriver driver)
	{
     element=driver.findElement(By.id("Size"));
     return element;
    }
	public static WebElement color(WebDriver driver)
	{
     element=driver.findElement(By.id("Color"));
     return element;
    }
	
	public static WebElement status(WebDriver driver)
	{
     element=driver.findElement(By.id("Status"));
     return element;
    }
	
	public static WebElement defaultimage(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//input[@type='button']"));
     return element;
    }
	
	public static WebElement categoryid(WebDriver driver)
	{
     element=driver.findElement(By.id("CategoryId"));
     return element;
    }
	
	public static WebElement supplierName(WebDriver driver)
	{
     element=driver.findElement(By.id("SupplierName"));
     return element;
    }
	
	public static WebElement saleschannels(WebDriver driver)
	{
     element=driver.findElement(By.id("SalesFromPointOfSaleFlag"));
     return element;
    }
	
	public static WebElement cancel(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//a[@class='btn btn-link']"));
     return element;
    } 
	
	public static WebElement save(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//button[@type='submit']"));
     return element;
    }
    
}
