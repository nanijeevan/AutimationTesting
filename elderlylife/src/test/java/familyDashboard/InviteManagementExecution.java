package familyDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InviteManagementExecution {
	public InviteManagement obj;
	
	WebDriver driver;
	
	@BeforeMethod
	public void browserlaunch() throws Exception
	{
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
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	    Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		 Thread.sleep(2000);
	    obj=new InviteManagement(driver);
	}
	
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC001();
//	}
//
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC002();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC003();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC005();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC009();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC010();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC011();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC012();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC013();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC014();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC015();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC016();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC017();
//	}	@Test
//	public void test1() throws Exception
//	{
//		obj.TC018();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC019();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC020();
//	}	@Test
//	public void test1() throws Exception
//	{
//		obj.TC021();
//	}	@Test
//	public void test1() throws Exception
//	{
//		obj.TC022();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC005();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC023();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC024();
//	}
//	@Test
//	public void test1() throws Exception
//	{
//		obj.TC025();
//	}
}
