package familyDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserFamilyDashBoard {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\elderlylife\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("tinku@esmoud.com");	
		driver.findElement(By.name("password")).sendKeys("12345678");
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[2]")).click();
			
			
	}
	@Test
	public void FamilyDashboardNavigation()
	{
		String s1=driver.getCurrentUrl();
		String s2="https://dev-app.elderlylife.co.uk/family_dashboard/elf-99a4d479-a3de-47a3-ba4b-920cfdef17c1";
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Page Navigated to Family Dashboard");
		}
		
	}
	
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
    }

}






