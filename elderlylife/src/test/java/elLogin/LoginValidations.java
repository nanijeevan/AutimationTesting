package elLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginValidations {
	WebDriver driver;
	WebElement ele1;
	@BeforeMethod
	public void tescase2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\elderlylife\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://dev-app.elderlylife.co.uk/");
	}
	@Test
	public void loginwithvalidcredentials() throws Exception
	{
		
		driver.findElement(By.name("email")).sendKeys("yipebew843@moenode.com");
		driver.findElement(By.name("password")).sendKeys("sy51N27NGAerx8dc");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		 ele1=driver.findElement(By.xpath("//p[contains(text(),'Family Invitations')]"));
		 if(ele1.isDisplayed())
		 {
			 System.out.println("EL Login Successful");
		 }
	}
		

	@Test
	public void loginwithInvalidEmail() throws Exception
	{
		
		driver.findElement(By.name("email")).sendKeys("yipeb843@moenode.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		
		WebElement ele3=driver.findElement(By.xpath("//div[contains(text(),'Invalid email or password/Account is not Active')]"));
		String s1= ele3.getText();
		System.out.println(s1);
		 if(ele3.isDisplayed())
		 {
			 System.out.println("EL Login Failed");
		 }
		
		
	}
	@Test
	public void loginwitInhvalidPassword() throws Exception
	{
		
		driver.findElement(By.name("email")).sendKeys("jhvefhhr@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sy51N27NGAerx8dc");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		
		WebElement ele2=driver.findElement(By.xpath("//div[contains(text(),'Invalid email or password/Account is not Active')]"));
		String s2= ele2.getText();
		System.out.println(s2);
		 if(ele2.isDisplayed())
		 {
			 System.out.println("EL Login Failed");
		 }
		
		
	}
	@Test
	public void loginwithINvalidEmailandpassword() throws Exception
	{
		
		driver.findElement(By.name("email")).sendKeys("jhvefhhr@gmail.com");
		driver.findElement(By.name("password")).sendKeys("safegrtrh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		WebElement ele4=driver.findElement(By.xpath("//div[contains(text(),'Invalid email or password/Account is not Active')]"));
		String s3= ele4.getText();
		System.out.println(s3);
		 if(ele4.isDisplayed())
		 {
			 System.out.println("EL Login Failed");
		 }
		
		
	}
	@Test
	public void loginwithOnlyemail() throws Exception
	{
		
		driver.findElement(By.name("email")).sendKeys("yipebew843@moenode.com");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		WebElement ele5=driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid password')]"));
		WebElement ele6=	driver.findElement(By.xpath("//small[contains(text(),'Enter your password')]"));
		
		if(ele5.isDisplayed())
		{
			System.out.println("EL Login Failed");
			String s4=ele5.getText();
			String s5=ele6.getText();
			System.out.println(s4);
			System.out.println(s5);
			
		}
	}
	@Test
	public void loginwithOnlypassword() throws Exception
	{
		
		
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	WebElement ele7=	driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid email address')]"));
		 if(ele7.isDisplayed())
		 {
			 System.out.println("EL Login Failed");
			 String s6=ele7.getText();
			 System.out.println(s6);
		 }
		
	}
	@Test
	public void loginwithoutcredentials() throws Exception
	{
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		 
		WebElement ele8=	driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid email address')]"));
		WebElement ele9=	driver.findElement(By.xpath("//small[contains(text(),'Enter your registered email address')]"));
		WebElement ele10=	driver.findElement(By.xpath("//small[contains(text(),'Enter your password')]"));
		if(ele8.isDisplayed())
		{
			System.out.println("EL Login Failed");
			String s8=ele8.getText();
			String s9=ele9.getText();
			String s10=ele10.getText();
			 System.out.println(s8);
			 System.out.println(s9);
			 System.out.println(s10);
			
		}
		
	}
	
	@Test
	public void loginwithPasswordlessthan8digits() throws Exception
	{
		
		driver.findElement(By.name("email")).sendKeys("yipebew843@moenode.com");
		driver.findElement(By.name("password")).sendKeys("sy51N");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		
	WebElement ele11=driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid password')]"));
	
	WebElement ele12=	driver.findElement(By.xpath("//small[contains(text(),'Enter your password')]"));
	if(ele11.isDisplayed())
		 {
			String s11= ele11.getText();
			 System.out.println(s11);
			 String s12= ele12.getText();
			 System.out.println(s12);
			 System.out.println("EL Login Failed");
		 }
	}
	
	
	public void loginwithInvalidEmailFormat() throws Exception
	{
		
		driver.findElement(By.name("email")).sendKeys("yipebew843moe");
		driver.findElement(By.xpath("//input[@id='']"));
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	

}
