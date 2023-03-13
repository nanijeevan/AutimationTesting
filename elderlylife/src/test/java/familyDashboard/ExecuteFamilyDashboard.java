package familyDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecuteFamilyDashboard {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\elderlylife\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("nanijeevangoud686@gmail.com");	
		driver.findElement(By.name("password")).sendKeys("12345678");
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();		
		Thread.sleep(2000);
	}	
	
	
	
	@Test
	public void FunctionalityofoutgoingCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase12();
	}
	@Test
	public void FunctionalityofwarrantiesCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase13();
	}
	
	@Test
	public void FunctionalityofbenefitsCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase14();
	}
	@Test
	public void FunctionalityofCompareCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase15();
	}
	@Test
	public void FunctionalityofGiftsCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase16();
	}
	
	
	@Test
	public void FunctionalityoftodosCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase17();
	}
	@Test
	public void FunctionalityofChangefamilynameCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase15();
	}
	
	@Test
	public void FunctionalityofmanageaccountplanCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase15();
	}
	@Test
	public void FunctionalityofviewallNotificationsCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase14();
	}
	@Test
	public void FunctionalityofcopyFamilyIDCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase13();
	}
	@Test
	public void FunctionalityofRemindersettingsCTA() throws Exception
	{
		FamilyDashboard obj=new FamilyDashboard(driver);
		obj.testcase13();
	}
	


	
	@AfterMethod
	public void close()
	{
		driver.close();
}
}
