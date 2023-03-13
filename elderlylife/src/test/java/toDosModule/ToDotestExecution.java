package toDosModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToDotestExecution {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Documents\\Bandicam\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");	
		Thread.sleep(1000);		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
	    Thread.sleep(2000);
	  
	
	}
	
	@Test
	public void TC001() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test1();
	}
	@Test
	public void TC002() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test2();
	}
	@Test
	public void TC003() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test3();
	}
	@Test
	public void TC004() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test4();
	}
	@Test
	public void TC005() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test5();
	}
	@Test
	public void TC006() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test6();
	}
	@Test
	public void TC007() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test7();
	}
	@Test
	public void TC008() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test8();
	}
	@Test
	public void TC009() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test9();
	}
	@Test
	public void TC010() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test10();
	}
	@Test
	public void TC011() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test11();
	}
	@Test
	public void TC012() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test12();
	}
	@Test
	public void TC013() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test13();
	}
	@Test
	public void TC014() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test14();
	}
	@Test
	public void TC015() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test15();
	}
	@Test
	public void TC016() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test16();
	}
	@Test
	public void TC017() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test17();
	}
	@Test
	public void TC018() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test18();
	}
	@Test
	public void TC019() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test19();
	}
	@Test
	public void TC020() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test20();
	}
	@Test
	public void TC021() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test21();
	}
	@Test
	public void TC022() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test22();
	}
	@Test
	public void TC023() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test23();
	}
	@Test
	public void TC024() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test24();
	}
	
	@Test
	public void TC025() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test25();
	}
	@Test
	public void TC026() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test26();
	}
	@Test
	public void TC027() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test27();
	}
	@Test
	public void TC028() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test28();
	}
	@Test
	public void TC029() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test29();
	}
	@Test
	public void TC030() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test30();
	}
	@Test
	public void TC031() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test31();
	}
	@Test
	public void TC032() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test32();
	}
	@Test
	public void TC033() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test33();
	}
	@Test
	public void TC034() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test34();
	}
	@Test
	public void TC035() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test35();
	}
	@Test
	public void TC036() throws Exception
	{
		
		ToDosTestCaseCreation obj=new  ToDosTestCaseCreation(driver);
		 obj.test36();
	}

	
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	
}
