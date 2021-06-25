package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_HomePage_Weblocator {
	
private static WebElement element=null;
	
	public static WebElement emailaddress(WebDriver driver)
	{
     element=driver.findElement(By.id("Email"));
     return element;
    }
	
	
	public static WebElement password(WebDriver driver)
	{
     element=driver.findElement(By.id("Password"));
     return element;
    }
	
	public static WebElement rememberme(WebDriver driver)
	{
     element=driver.findElement(By.id("RememberMe"));
     return element;
    }
	
	
	public static WebElement signin(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//button[@type='submit']"));
     return element;
     
    }
	
	public static WebElement dropdown(WebDriver driver)
	{
		//element=driver.findElement(By.xpath("//div[@class='dropdown-menu dropdown-menu-end dropdown-menu-arrow show']"));
		//element=driver.findElement(By.xpath("//div[@class='navbar-nav flex-row order-md-last']//div[@class='nav-item dropdown']//a[@class='nav-link d-flex lh-1 text-reset p-0']//div[@class='d-none d-xl-block ps-2']"));
		//element=driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) header.navbar.navbar-expand-md.navbar-light.d-none.d-lg-flex.d-print-none:nth-child(2) div.container-xl div.navbar-nav.flex-row.order-md-last div.nav-item.dropdown:nth-child(2) a.nav-link.d-flex.lh-1.text-reset.p-0 > div.d-none.d-xl-block.ps-2"));
		element=driver.findElement(By.className("d-none d-xl-block ps-2"));
		//element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/a[1]/div[1]"));
		return element; 
	} 

}
