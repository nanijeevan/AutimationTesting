package eLWarranties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WarrantyExecution {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Documents\\Bandicam\\driver\\chromedriver.exe");
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
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
	    Thread.sleep(2000);	
	    driver.findElement(By.xpath("//span[contains(text(),'Warranties')]")).click();
	    Thread.sleep(2000);	
	}
	@Test
	public void TC002() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test2();
	}	

	@Test
	public void TC003() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test3();
	}		
	@Test
	public void TC004() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test4();
	}	
	@Test
	public void TC005() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test5();
	}
	
	@Test
	public void TC006() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test6();
	}
	
	@Test
	public void TC007() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test7();
	}
	
	@Test
	public void TC008() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test8();
	}
	
	@Test
	public void TC009() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test9();
	}
	
	@Test
	public void TC010() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test10();
	}
	
	
	@Test
	public void TC011() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test11();
	}
	
	
	@Test
	public void TC012() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test12();
	}	
	@Test
	public void TC013() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test13();
	}
	@Test
	public void TC015() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test15();
	}
	
	
	@Test
	public void TC016() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test16();
	}
	
	
	@Test
	public void TC017() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test17();
	}
	@Test
	public void TC018() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test18();
	}
	@Test
	public void TC019() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test19();
	}
	@Test
	public void TC020() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test20();
	}	
	@Test
	public void TC021() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test21();
	}
	@Test	
	public void TC022() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test22();
	}
	@Test
	public void TC023() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test23();
	}
	@Test
	public void TC024() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test24();
	}
	@Test
	public void TC025() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test25();
	}
	@Test
	public void TC026() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test26();
	}
	
	@Test
	public void TC027() throws Exception
	{
		
		Warranties obj=new  Warranties(driver);
		 obj.test27();
	}
	@AfterMethod
	public void browserclose()
	{
		driver.close();
	}
	
	
}
