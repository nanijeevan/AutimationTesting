package wizard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CoupleFamilyExecution {
	WebDriver driver;
	@BeforeMethod
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
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/button[1]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("coupleWizard");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@name='paymentMethod_id']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
		Thread.sleep(3000);	
	
	}
	
//	@Test
//	public void TC001() throws Exception
//	{
//		
//		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
//		 obj.test1();
//	}
//	@Test
//	public void TC002() throws Exception
//	{
//		
//		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
//		 obj.test2();
//	}
//	@Test
//	public void TC003() throws Exception
//	{
//		
//		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
//		 obj.test3();
//	}
//	@Test
//	public void TC004() throws Exception
//	{
//		
//		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
//		 obj.test4();
//	}
//	@Test
//	public void TC005() throws Exception
//	{
//		
//		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
//		 obj.test5();
//	}
//	@Test
//	public void TC006() throws Exception
//	{
//		
//		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
//		 obj.test6();
//	}
//	@Test
//	public void TC007() throws Exception
//	{
//		
//		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
//		 obj.test7();
//	}
//	@Test
//	public void TC008() throws Exception
//	{
//		
//		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
//		 obj.test8();
//	}
	@Test
	public void TC009() throws Exception
	{
		
		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
		 obj.test9();
	}
	@Test
	public void TC010() throws Exception
	{
		
		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
		 obj.test10();
	}
	@Test
	public void TC011() throws Exception
	{
		
		WizardCoupleFamilyCreation obj=new  WizardCoupleFamilyCreation(driver);
		 obj.test11();
	}
	@AfterMethod
	public void browserclose()
	{
		driver.close();
	}
	
}
