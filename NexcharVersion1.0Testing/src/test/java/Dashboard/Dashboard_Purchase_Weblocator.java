package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_Purchase_Weblocator {
	
private static WebElement element=null;
	
 public static WebElement itemname(WebDriver driver)
{
 element=driver.findElement(By.id("ItemName"));
 return element;
}
 public static WebElement date(WebDriver driver)
{
 element=driver.findElement(By.xpath("//input[@id='Date']"));
 return element;
}
 public static WebElement outletid(WebDriver driver)
	{
  element=driver.findElement(By.id("OutletId"));
  return element;
 }
 
 public static WebElement supplierName(WebDriver driver)
 {
  element=driver.findElement(By.id("SupplierName"));
  return element;
 }
 public static WebElement supplierNameid(WebDriver driver)
 {
  element=driver.findElement(By.id("ui-id-1"));
  return element;
 }
 
 public static WebElement quantity(WebDriver driver)
 {
  element=driver.findElement(By.id("Quantity"));
  return element;
 }
 
 public static WebElement unitprice(WebDriver driver)
 {
  element=driver.findElement(By.id("UnitPrice"));
  return element;
 }
 
 public static WebElement amountpaid(WebDriver driver)
 {
  element=driver.findElement(By.id("AmountPaid"));
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
