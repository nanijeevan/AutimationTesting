package eLApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateFamily {
WebDriver driver;
	
	

	@BeforeMethod
	public void setup() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\elderlylife\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");	
		Thread.sleep(3000);		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New Family')]")).click();
		
	}
	
	@Test
	public void CreateNewFamily() throws Exception
	{
		Thread.sleep(3000);	
		//Click on Choose Plan
		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-monthly\"]/div[1]/div[2]/div/div/div/span/button")).click();
		Thread.sleep(3000);	
		//Input Family Name
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("Demo Testing");
		Thread.sleep(3000);	
		//Click on Proceed to Payment button
		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
		Thread.sleep(3000);	
		//Click on Add new Card button
		
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/button")).click();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/input[1]"));
		e1.clear();
		e1.sendKeys("Test Automation");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")).sendKeys("2356444");
		
//	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[1]/div/div/div/div/label/span[1]/input")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
//	Thread.sleep(3000);
//	WebElement Confirmation=driver.findElement(By.xpath("//h3[contains(text(),'Congratulations !!')]"));
//	Confirmation.isDisplayed();

		
		
	}	
}
