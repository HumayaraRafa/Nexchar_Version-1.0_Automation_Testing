package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_CategoryPage_Weblocator {
	
private static WebElement element=null;
	
	public static WebElement searchbox(WebDriver driver)
	{
     element=driver.findElement(By.id("txtSearch"));
     return element;
    }
	
	public static WebElement categoryName(WebDriver driver)
	{
     element=driver.findElement(By.id("CategoryName"));
     return element;
    }
	 
	public static WebElement description(WebDriver driver)
	{
     element=driver.findElement(By.id("Description"));
     return element;
    }
}