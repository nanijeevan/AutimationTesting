package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolltest1 {
	WebDriver driver;
	
	
	@Test
	public void browserlaunch() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bo-dev.nslsdev.com/");
		//driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Locating element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/span[1]"));

        // Scrolling down the page till the element is found		
      //  js.executeScript("arguments[0].scrollIntoView();", Element);
        
        //to perform scroll on an application using Selenium

        // scroll till the bottom of the page
   //     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		

        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(3000);
     
        act.sendKeys(Keys.PAGE_UP).build().perform();       //Page Up
        System.out.println("Scroll up perfomed");
        Thread.sleep(3000);
		
	}

}
