package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VigeoDash {
	WebDriver driver;
	
	
	@Test
	public void test1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://dev.vigeodash.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gleecus.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vigeo@1234");
		Thread.sleep(2000);
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/button[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.navigate().to("https://dev.vigeodash.com/blank-hipps");
		//driver.navigate.to("https://dev.vigeodash.com/claim-details");
		Thread.sleep(11000);
		//driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		executor.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]"));
	
		
		
		 element.click();
         Actions move = new Actions(driver);
         move.moveToElement(element).clickAndHold();
         move.moveByOffset(250,0);
         move.release();
         move.perform();
	}

}
