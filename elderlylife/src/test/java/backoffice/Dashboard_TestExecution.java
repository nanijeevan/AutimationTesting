package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard_TestExecution {
	WebDriver driver;
public	Dashboard obj;
	
	@BeforeMethod
	public void browserlaunch() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev-admin.elderlylife.co.uk/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@el.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		obj=new Dashboard(driver);
		
		Thread.sleep(2000);
	}
	
	
   @Test
	public void VerifytheUIintheDashboard()
	{
	  // Dashboard obj=new Dashboard(driver);
		obj.TC_001();
	}
   @Test
	public void VerifytheStatsofOugoings()
	{
	   obj.TC_002();
	}
   @Test
	public void VerifytheStatsofWarranties()
	{
	   obj.TC_003();
	}
   @Test
	public void VerifytheStatsofVouchersandGiftcards()
	{
	   obj.TC_004();
	}
   @Test
	public void VerifytheStatsofToDos()
	{
	   obj.TC_005();
	}
   @Test
	public void VerifytheFooterUIintheDashboard()
	{
	   obj.TC_006();
	}
   
   
   @AfterMethod
   public void closebrowser()
   {
	   driver.close();
   }
}
