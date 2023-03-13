package elLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ELSignUpAccount {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://dev-app.elderlylife.co.uk/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).click();
	}
	
	@Test(priority=1)
	public void createaccount() throws Exception
	{
		//FirstName
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("MockDemouser");
		//LastName
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("Two");
		//Email
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("abcdefghij@gmail.com");
		//Password
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		//ConfirmPassword
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		//ClickOnSignUp
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
//	WebElement e1=	driver.findElement(By.xpath("//span[contains(text(),'Hurray!! Your Elderly Life account has been succes')]"));
//	Thread.sleep(3000);
//	if(e1.isDisplayed())
//	{
//		System.out.println("EL Account Created");
//		String s1= e1.getText();
//		System.out.println(s1);
//	}
		
//	//Click on Skip and Sign In
//	driver.findElement(By.xpath("//button[contains(text(),'Skip and Login')]")).click();
//	Thread.sleep(3000);
//	//Sign In
//	driver.findElement(By.name("email")).sendKeys("setoxe2556@haizail.com");
//	driver.findElement(By.name("password")).sendKeys("12345678");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
//	WebElement e2= driver.findElement(By.xpath("//h3[contains(text(),'Elderly Life Account Plans')]"));
//	if(e2.isDisplayed())
//	{
//		String s2=e2.getText();
//		System.out.println("EL Sign In Successful");
//		System.out.println(s2);
//	}
	}
	
	
	
	@Test(priority=2)
	public void clickonSignUpwithoutanyCedentials() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		WebElement e3=driver.findElement(By.xpath("//div[contains(text(),'Please enter the required fields')]"));
		WebElement e4=driver.findElement(By.xpath("//small[contains(text(),'This will be used to address you on Elderly Life')]"));
		WebElement e5=driver.findElement(By.xpath("//small[contains(text(),'This will be used to name your family')]"));
		WebElement e6=driver.findElement(By.xpath("//small[contains(text(),'You have been invited to a family with this email.')]"));
		WebElement e7=driver.findElement(By.xpath("//small[contains(text(),'Your password should be of minimum 8 characters an')]"));
		
		if(e3.isDisplayed())
		{
			
			String s3=e3.getText();
			System.out.println(s3);
			String s4=e4.getText();
			System.out.println(s4);
			String s5=e5.getText();
			System.out.println(s5);
			String s6=e6.getText();
			System.out.println(s6);
			String s7=e7.getText();
			System.out.println(s7);
		}
		
	}
	
	
	
	@Test(priority=3)
	public void SignUpWithOutFirstName() throws Exception
	{
		
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("One");
				//Email
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("cagttor88494@migonom.com");
				//Password
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
				//ConfirmPassword
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345678");
				//ClickOnSignUp
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
				WebElement e3=driver.findElement(By.xpath("//div[contains(text(),'Please enter the required fields')]"));
				WebElement e4=driver.findElement(By.xpath("//small[contains(text(),'This will be used to address you on Elderly Life')]"));
				
				
				if(e3.isDisplayed())
				{
					
					String s3=e3.getText();
					System.out.println(s3);
					String s4=e4.getText();
					System.out.println(s4);
				}
				
	}
	
	@Test(priority=4)
	public void SignUpWithOutLastName() throws Exception
	{
		//FirstName
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Demouser");
				
				//Email
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("cagossr88494@migonom.com");
				//Password
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
				//ConfirmPassword
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345678");
				//ClickOnSignUp
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
				WebElement e3=driver.findElement(By.xpath("//div[contains(text(),'Please enter the required fields')]"));
				WebElement e5=driver.findElement(By.xpath("//small[contains(text(),'This will be used to name your family')]"));
				
				if(e3.isDisplayed())
				{
					
					String s3=e3.getText();
					System.out.println(s3);
					String s5=e5.getText();
					System.out.println(s5);
				}
	}
	
	
	@Test(priority=5)
	public void SignUpWithOutUsingEmailID() throws Exception
	{
		//FirstName
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Demouser");
				//LastName
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("One");
			
				//Password
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
				//ConfirmPassword
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345678");
				//ClickOnSignUp
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
				WebElement e3=driver.findElement(By.xpath("//div[contains(text(),'Please enter the required fields')]"));
				WebElement e6=driver.findElement(By.xpath("//small[contains(text(),'You have been invited to a family with this email.')]"));
				
				if(e3.isDisplayed())
				{
					
					String s3=e3.getText();
					System.out.println(s3);
					String s6=e6.getText();
					System.out.println(s6);
				}
				
				
				
				
	}
	@Test(priority=6)
	public void SignUpWithOutUsingPassword() throws Exception
	{
		//FirstName
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Demouser");
				//LastName
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("One");
				//Email
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("cagor88494@migonom.com");
				
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345678");
				//ClickOnSignUp
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
				WebElement e3=driver.findElement(By.xpath("//div[contains(text(),'Please enter the required fields')]"));
				WebElement e7=driver.findElement(By.xpath("//small[contains(text(),'Your password should be of minimum 8 characters an')]"));
				
				if(e3.isDisplayed())
				{
					
					String s3=e3.getText();
					System.out.println(s3);
					String s7=e7.getText();
					System.out.println(s7);
				}
	}
	
	@Test(priority=7)
	public void SignUpWithPasswordLessthan8digits() throws Exception
	{
		//FirstName
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Demouser");
				//LastName
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("One");
				//Email
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("cagor88494@migonom.com");
				
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345678");
				//ClickOnSignUp
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
				WebElement e3=driver.findElement(By.xpath("//div[contains(text(),'Please enter the required fields')]"));
				WebElement e7=driver.findElement(By.xpath("//small[contains(text(),'Your password should be of minimum 8 characters an')]"));
				
				if(e3.isDisplayed())
				{
					
					String s3=e3.getText();
					System.out.println(s3);
					String s7=e7.getText();
					System.out.println(s7);
				}
	}
	
	@Test(priority=8)
	public void SignUpWithOutConfirmPasswords() throws Exception
	{
		//FirstName
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Demouser");
		//LastName
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("One");
		//Email
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("cagor88494@migonom.com");
		//Password
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		
		//ClickOnSignUp
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		WebElement e3=driver.findElement(By.xpath("//div[contains(text(),\"Please enter the same password you've entered befo\")]"));
		WebElement e8=driver.findElement(By.xpath("//small[contains(text(),\"Please retype the same password you've entered bef\")]"));
		
		if(e3.isDisplayed())
		{
			
			String s3=e3.getText();
			System.out.println(s3);
			String s8=e8.getText();
			System.out.println(s8);
		}
		
	}
	
	@Test(priority=9)
	public void SignUpWithDifferentConfirmPasswords() throws Exception
	{
		//FirstName
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Demouser");
		//LastName
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("One");
		//Email
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("cagor88494@migonom.com");
		//Password
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		//ConfirmPassword
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")).sendKeys("123456");
		//ClickOnSignUp
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		Thread.sleep(2000);
		WebElement e3=driver.findElement(By.xpath("//div[contains(text(),\"Please enter the same password you've entered befo\")]"));
		WebElement e8=driver.findElement(By.xpath("//small[contains(text(),\"Please retype the same password you've entered bef\")]"));
		
		if(e3.isDisplayed())
		{
			
			String s3=e3.getText();
			System.out.println(s3);
			String s8=e8.getText();
			System.out.println(s8);
		}
		
	}
	
	@Test(priority=10)
	public void SignUpwithExistingAccount() throws Exception
	{
		//FirstName
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Demouser");
		//LastName
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("One");
		//Email
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("yipebew843@moenode.com");
		//Password
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		//ConfirmPassword
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		//ClickOnSignUp
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		Thread.sleep(3000);
		WebElement e9=driver.findElement(By.xpath("//div[contains(text(),'Email is already taken, Please use another email')]"));
		
		if(e9.isDisplayed())
		{
			String s9=e9.getText();
			System.out.println(s9);
		}
		
	}
	@Test(priority=11)
	public void FunctionalityOfLoginhereLink()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Already have an account? Login here')]")).click();
		WebElement e10=driver.findElement(By.xpath("//p[contains(text(),'Sign into Elderly Life Account')]"));
		if(e10.isDisplayed())
		{
			String s10=e10.getText();
			System.out.println(s10);
		}
	}
	
	@Test(priority=12)
	public void FunctionalityOfTermsandConditionsLink() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]")).click();
	}
	@Test(priority=13)
	public void FunctionalityOfPrivacyPolicyLink() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();
	}
	
	@Test(priority=14)
	public void FunctionalityOfTermsandConditionsLinkinFooter() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(text(),'Terms and conditions')]")).click();
	}
	@Test(priority=15)
	public void FunctionalityOfPrivacyPolicyLinkinFooter() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(text(),'Privacy policy')]")).click();
	}
	
	
//@AfterMethod
public void closebrowser()
{
	driver.close();
}
	
}
