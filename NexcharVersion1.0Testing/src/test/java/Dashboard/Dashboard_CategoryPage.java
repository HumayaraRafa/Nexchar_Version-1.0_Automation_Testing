package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard_CategoryPage {
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
		
		driver.findElement(By.linkText("Category")).click();
		
		//valid info search
		Dashboard_CategoryPage_Weblocator.searchbox(driver).sendKeys("Pain Killer");
		//invalid info search
		//Dashboard_CategoryPage_Weblocator.searchbox(driver).sendKeys("abcd");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		driver.findElement(By.linkText("Create new category")).click();
		driver.findElement(By.linkText("Back")).click();
		//fill-up field
		driver.findElement(By.linkText("Create new category")).click();
		Dashboard_CategoryPage_Weblocator.categoryName(driver).sendKeys("Gastric Medicine");
		Dashboard_CategoryPage_Weblocator.description(driver).sendKeys("The gastric pain that many Singaporeans experience in their upper abdomen is most commonly non-ulcer dyspepsia.");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		Thread.sleep(3000);
		//delete item
		//driver.findElement(By.xpath("//body[@class='antialiased']/div[@class='page']/div[@class='content']/div[@class='container-xl']/div[@class='col-12']/div[@class='card']/div[@class='table-responsive']/table[@class='table card-table table-vcenter text-nowrap datatable']/tbody/tr[14]/td[3]/a[2]/*[1]")).click();
	    //edit button click
		//driver.findElement(By.cssSelector("tr:nth-child(12) .btnDelete > .icon")).click();
		
		
		
		
	}		
}
