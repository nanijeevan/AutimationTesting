package demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Browserlaunch {
	WebDriver driver;

	@Test
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Documents\\Bandicam\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
			
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");	
		Thread.sleep(1000);		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[contains(text(),'Create New Family')]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[3]/button[1]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("SingleWizard");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@name='paymentMethod_id']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
		Thread.sleep(3000);	
	
	}

}
