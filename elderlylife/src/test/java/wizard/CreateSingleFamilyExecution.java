package wizard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateSingleFamilyExecution {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Documents\\Bandicam\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
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
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]")).click();
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
	
	
	
//	@Test
//	public void TC001() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test1();
//	}
//	@Test
//	public void TC002() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test2();
//	}
//	@Test
//	public void TC003() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test3();
//	}
//	@Test
//	public void TC004() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test4();
//	}
//	@Test
//	public void TC005() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test5();
//	}
//	@Test
//	public void TC006() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test6();
//	}
//	@Test
//	public void TC007() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test7();
//	}
//	@Test
//	public void TC008() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test8();
//	}
////	@Test
////	public void TC009() throws Exception
////	{
////		
////		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
////		 obj.test9();
////	}
//	@Test
//	public void TC010() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test10();
//	}
//	@Test
//	public void TC011() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test11();
//	}
//	@Test
//	public void TC012() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test12();
//	}
//	@Test
//	public void TC013() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test13();
//	}
//	@Test
//	public void TC014() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test14();
//	}
//	@Test
//	public void TC015() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test15();
//	}
//	@Test
//	public void TC016() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test16();
//	}
//	@Test
//	public void TC017() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test17();
//	}
//	@Test
//	public void TC018() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test18();
//	}
//	@Test
//	public void TC019() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test19();
//	}
//	@Test
//	public void TC020() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test20();
//	}
//	@Test
//	public void TC021() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test21();
//	}
//	@Test
//	public void TC022() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test22();
//	}
//	@Test
//	public void TC023() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test23();
//	}
//	@Test
//	public void TC024() throws Exception
//	{
//		
//		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
//		 obj.test24();
//	}
	
	@Test
	public void TC025() throws Exception
	{
		
		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
		 obj.test25();
	}
	@Test
	public void TC026() throws Exception
	{
		
		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
		 obj.test26();
	}
	@Test
	public void TC027() throws Exception
	{
		
		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
		 obj.test27();
	}
	@Test
	public void TC028() throws Exception
	{
		
		 WizardSingleFamilyCreation obj=new  WizardSingleFamilyCreation(driver);
		 obj.test28();
	}
	@AfterMethod
	public void browserclose()
	{
		driver.close();
	}
	
	
	
	
}