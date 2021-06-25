package OldPages;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class PreviousSignUpPage {
		public static void main(String[] args) { 
			
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\OneDrive\\Desktop\\Nexchar\\NexcharProject\\Drivers\\geckodriver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver= new FirefoxDriver();
			
			//URL visit
			driver.get("https://nexchar.com/signup");
			
			//Page title capture
				System.out.println("Title of the page:  "+driver.getTitle());
			//current url capture
				System.out.println("Current url of the page: "+driver.getCurrentUrl());
			//Capturing page source code
				System.out.println("Page souce code: "+driver.getPageSource());
				
			//form fillup with 	
				
				    driver.findElement(By.id("Name")).click();
				    driver.findElement(By.id("Name")).sendKeys("abcd");
				    
			//without fill name box	    
				    //driver.findElement(By.id("Name")).sendKeys(" ");
				    driver.findElement(By.id("CategoryId")).click();
				    {
				      WebElement dropdown = driver.findElement(By.id("CategoryId"));
				      //Select dropdownbox=new Select(driver.findElement(By.id("CategoryId")));//
	       ////Drop-down all category menu 
				      //dropdown.findElement(By.xpath("//option[@value='2']")).click();
				      //dropdown.findElement(By.xpath("//option[@value='1']")).click();
				      //dropdown.findElement(By.xpath("//option[@value='3']")).click();
				      //dropdown.findElement(By.xpath("//option[@value='4']")).click();
				      dropdown.findElement(By.xpath("//option[@value='5']")).click();
				     /*dropdown.findElement(By.xpath("//option[@value='6']")).click();
				      dropdown.findElement(By.xpath("//option[@value='9']")).click();
				      dropdown.findElement(By.xpath("//option[@value='10']")).click();
				      dropdown.findElement(By.xpath("//option[@value='11']")).click();
				      dropdown.findElement(By.xpath("//option[@value='50']")).click();*/
				      
				    }
				    //driver.findElement(By.cssSelector("option:nth-child(2)")).click();
				    //driver.findElement(By.cssSelector("option:nth-child(1)")).click();
				    //driver.findElement(By.cssSelector("option:nth-child(3)")).click();
				    //driver.findElement(By.cssSelector("option:nth-child(4)")).click();
				    driver.findElement(By.cssSelector("option:nth-child(5)")).click();
				    /*driver.findElement(By.cssSelector("option:nth-child(6)")).click();
				    driver.findElement(By.cssSelector("option:nth-child(9)")).click();
				    driver.findElement(By.cssSelector("option:nth-child(10)")).click();
				    driver.findElement(By.cssSelector("option:nth-child(11)")).click();
				    driver.findElement(By.cssSelector("option:nth-child(50)")).click();*/
				  
				     
				    driver.findElement(By.id("Email")).click();
		  ///without domain email address   
				    //driver.findElement(By.id("Email")).sendKeys("aabcc123com");
		  ///blank mail field
		 		    //driver.findElement(By.id("Email")).sendKeys(" ");
		 ///Valid Mail id
				    driver.findElement(By.id("Email")).sendKeys("aabdc123@gmail.com");
				    driver.findElement(By.cssSelector(".justify-content-center")).click();
				    driver.findElement(By.id("Password")).click();
				    driver.findElement(By.id("Password")).sendKeys("abcdef12345678");
				    
				    //only 8 space password
				    //driver.findElement(By.id("Password")).sendKeys("        ");
				  
				    //show password button
				    driver.findElement(By.cssSelector(".icon")).click();
				    
				    //option click
				    driver.findElement(By.id("NotReceiveNewsLetter")).click();
				    driver.findElement(By.cssSelector(".btn-primary")).click();
    }	
		
		
}		
	
