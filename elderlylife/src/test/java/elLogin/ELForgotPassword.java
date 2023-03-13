package elLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ELForgotPassword {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\elderlylife\\chromedriver\\chromedriver.exe");
		
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.findElement(By.xpath("//span[contains(text(),'Forgot Password?')]")).click();
		Thread.sleep(3000);
	}
	@Test
	public void forgotpasswordlinkfunctionality() throws Exception
	{
		
	WebElement f1=	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/p[1]"));
	Thread.sleep(3000);
	if(f1.isDisplayed())
	{
		String s1=f1.getText();
		System.out.println(" Navigated to "+s1+"Page");
	}
	}
	
	@Test
	public void RequestUniqueCodeWithExisstingEmailID() throws Exception
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("nanijeevangoud8@gmail.com");
		
         driver.findElement(By.xpath("//button[contains(text(),'Request Unique code')]")).click();
         Thread.sleep(3000);
         
       WebElement f2=  driver.findElement(By.xpath("//div[contains(text(),'Unique code has been send to your email')]"));
       String s2= f2.getText();
       System.out.println(s2);
       WebElement f3= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/p[2]"));
       String s3= f3.getText();
       System.out.println(s3);
       Thread.sleep(3000);
	}   
	
	
	@Test
	public void RequestUniqueCodeWithNewEmailID() throws Exception
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("basfesetb@gmail.com");
		
        driver.findElement(By.xpath("//button[contains(text(),'Request Unique code')]")).click();
        Thread.sleep(3000);
		WebElement f4=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]"));
		Thread.sleep(2000);
		if(f4.isDisplayed())
		{
			
		String s4=f4.getText();
		System.out.println(s4);
      	}		
	}
	
	@Test
	public void RequestUniqueCodeWithOutEmailID() throws Exception
	{
		  driver.findElement(By.xpath("//button[contains(text(),'Request Unique code')]")).click();
	        Thread.sleep(3000);
	    	WebElement f5=    driver.findElement(By.xpath("//div[contains(text(),'Please enter the required fields')]"));
	    	if(f5.isDisplayed())
	    	{
	    		String s5=f5.getText();
	    		System.out.println(s5);
	    	}
	}
	
	@Test
	public void ValidateRequestUniqueCode() throws Exception
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("nanijeevangoud8@gmail.com");
		
        driver.findElement(By.xpath("//button[contains(text(),'Request Unique code')]")).click();
        Thread.sleep(3000);
		WebElement f6=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		f6.sendKeys("537474");
		driver.findElement(By.xpath("//button[contains(text(),'Submit Code')]")).click();	
	}
	@Test
	public void ValidateInvalidRequestUniqueCode() throws Exception
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("nanijeevangoud8@gmail.com");

        driver.findElement(By.xpath("//button[contains(text(),'Request Unique code')]")).click();
        Thread.sleep(3000);
		WebElement f6=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		f6.sendKeys("537474");
		driver.findElement(By.xpath("//button[contains(text(),'Submit Code')]")).click();
		WebElement f8=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]"));
		Thread.sleep(2000);
		if(f8.isDisplayed())
		{
			String s8=f8.getText();
			System.out.println(s8);
		}
	}
	
	
	
	@Test
	public void ValidateInvalidRequestUniqueCodewithlessthandigits() throws Exception
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("nanijeevangoud8@gmail.com");
		
        driver.findElement(By.xpath("//button[contains(text(),'Request Unique code')]")).click();
        Thread.sleep(3000);
		WebElement f6=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		f6.sendKeys("537");
		driver.findElement(By.xpath("//button[contains(text(),'Submit Code')]")).click();
		WebElement f7=driver.findElement(By.xpath("//div[contains(text(),'Please enter valid verification code')]"));
		if(f7.isDisplayed())
		{
			String s7=f7.getText();
			System.out.println(s7);
		}
		
			
	}
	
	@Test
	public void ValidateWithoutRequestUniqueCode() throws Exception
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("nanijeevangoud8@gmail.com");
		
        driver.findElement(By.xpath("//button[contains(text(),'Request Unique code')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Submit Code')]")).click();
		WebElement f7=driver.findElement(By.xpath("//div[contains(text(),'Please enter valid verification code')]"));
		if(f7.isDisplayed())
		{
			String s7=f7.getText();
			System.out.println(s7);
		}		
	}
	@Test
	public void backtologinlinkfunctionality() throws Exception
	{
		 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("nanijeevangoud8@gmail.com");	
	        driver.findElement(By.xpath("//button[contains(text(),'Request Unique code')]")).click();
	        Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/div[2]/p[1]/a[1]/span[1]")).click();
		WebElement f9=driver.findElement(By.xpath("//p[contains(text(),'Sign into Elderly Life Account')]"));
		if(f9.isDisplayed())
		{
			String s9=f9.getText();
			System.out.println(s9);
		}
		
		
		
	}
	
	@Test
	public void backtologinlinkfunctionalityinrestpasswordpage() throws Exception
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/div[2]/p[1]/a[1]/span[1]")).click();
		
		
		////*[@id="root"]/div[1]/div/div/div[2]/div/div/form[1]/div[2]/p/a/span
		//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/p[1]/a[1]/span[1]
		Thread.sleep(3000);
		WebElement f10=driver.findElement(By.xpath("//p[contains(text(),'Sign into Elderly Life Account')]"));

	if(f10.isDisplayed())
		{
			String s10=f10.getText();
			System.out.println(s10);
		}
		
	}
	
	@Test
	public void functionalityofSignUpLink() throws Exception
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/div[2]/p[1]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).click();
		WebElement e11=driver.findElement(By.xpath("//p[contains(text(),'Create an account on Elderly Life')]"));
		if(e11.isDisplayed())
		{
			String s11=e11.getText();
			System.out.println(s11);
		}
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void browserclose() throws Exception
	{
      
		driver.close();
	}
	
	}
	
	
	
	
	

		


