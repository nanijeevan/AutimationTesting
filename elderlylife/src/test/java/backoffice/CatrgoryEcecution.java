package backoffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CatrgoryEcecution {
	WebDriver driver;
	public CategoryTestCreation obj;
	WebDriverWait wait;
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
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		Thread.sleep(2000);
		obj=new CategoryTestCreation(driver);
		
		Thread.sleep(4000);
	}
	
	
   @Test
	public void VerifytheUIintheDashboard() throws Exception
	{
	  obj.TC_004();
		
	}

}
