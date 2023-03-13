package eLApplication;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ELProfilePage {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\elderlylife\\chromedriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://dev-app.elderlylife.co.uk/");
		
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("tinku@esmoud.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		Thread.sleep(3000);
		
	}
	
	@Test(priority=1)
	public void ProfileDropDown()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		
		WebElement e1=driver.findElement(By.xpath("//a[contains(text(),'Create New Family')]"));
		WebElement e2=driver.findElement(By.xpath("//a[contains(text(),'Profile')]"));
		WebElement e3=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		WebElement e4=driver.findElement(By.xpath("//div[contains(text(),'User ID:')]"));
		
		if(e1.isDisplayed())
		{
			System.out.println("Profile Dropdown displayed below is the list: ");
			String s1=e1.getText();
			System.out.println(s1);
			String s2=e2.getText();
			System.out.println(s2);
			String s3=e3.getText();
			System.out.println(s3);
			String s4=e4.getText();
			System.out.println(s4);
		}
	}
	@Test(priority=2)
	public void ProfilePageNavigation()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		WebElement e1=driver.findElement(By.xpath("//p[contains(text(),'Manage your Profile on Elderly Life Platform.')]"));
		if(e1.isDisplayed())
		{
			String s1=e1.getText();
			System.out.println(s1);
		}
	}
	@Test(priority=3)
	public void FunctionalityofCameraIcon()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/img[1]")).click();
		WebElement e5=driver.findElement(By.xpath("//span[contains(text(),'View Photo')]"));
		WebElement e6=driver.findElement(By.xpath("//span[contains(text(),'Upload Photo')]"));
		WebElement e7=driver.findElement(By.xpath("//span[contains(text(),'Remove Photo')]"));
		if(e5.isDisplayed())
		{
			System.out.println("Camera Icon list: ");
			String s5=e5.getText();
			System.out.println(s5);
		}
		
		if(e6.isDisplayed())
		{
			String s6=e6.getText();
			System.out.println(s6);
		}
		if(e7.isDisplayed())
		{
			String s7=e7.getText();
			System.out.println(s7);
		}
	}
	
	@Test(priority=4)
	public void FunctionalityofViewPhoto()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/img[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'View Photo')]")).click();
		WebElement e8=	driver.findElement(By.xpath("//h3[contains(text(),'View Profile Photo')]"));
		
		if(e8.isDisplayed())
		{
			String s8=e8.getText();
			System.out.println(s8);
		}
		
	}
	
	@Test(priority=5)
	public void FunctionalityofCloseIconInViewProfilePhoto()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/img[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'View Photo')]")).click();
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/button[1]")).click();
		WebElement e9=	driver.findElement(By.xpath("//p[contains(text(),'Manage your Profile on Elderly Life Platform.')]"));
		
		if(e9.isDisplayed())
		{
			String s9=e9.getText();
			System.out.println(s9);
		}
		
	}
	@Test(priority=6)
	public void FunctionalityofUploadPhoto()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/img[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Upload Photo')]")).click();
		WebElement e9=	driver.findElement(By.xpath("//h3[contains(text(),'Update Profile Photo')]"));
		
		if(e9.isDisplayed())
		{
			String s9=e9.getText();
			System.out.println(s9);
		}
		
	}
	
	@Test(priority=7)
	public void FunctionalityofUploadbuttonInUpdateProfilePhotoPage()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/img[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Upload Photo')]")).click();
		driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
	}
	
	
	@Test(priority=8)
	public void FunctionalityofCloseIconInUploadProfilePhotoPage()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/img[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Upload Photo')]")).click();
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/button[1]")).click();
		WebElement e9=	driver.findElement(By.xpath("//p[contains(text(),'Manage your Profile on Elderly Life Platform.')]"));
		
		if(e9.isDisplayed())
		{
			String s9=e9.getText();
			System.out.println(s9);
		}
		
	}
	@Test(priority=9)
	public void FunctionalityofRemovePhotoLink()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/img[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Remove Photo')]")).click();
		WebElement e9=	driver.findElement(By.xpath("//h3[contains(text(),'Delete Photo')]"));
		if(e9.isDisplayed())
		{
			String s9=e9.getText();
			System.out.println(s9);
		}
	}
	@Test(priority=10)
	public void FunctionalityofRemovingthePhoto()
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/img[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Remove Photo')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
         WebElement e9=	driver.findElement(By.xpath("//p[contains(text(),'Manage your Profile on Elderly Life Platform.')]"));	
		if(e9.isDisplayed())
		{
			String s9=e9.getText();
			System.out.println(s9);
		}
	}
	@Test(priority=11)
	public void UpdateProfilebychangingFirstName() throws Exception
	{
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		WebElement Fname=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		System.out.println("First Name Before Update was "+Fname.getAttribute("value"));
		Fname.clear();
		Fname.sendKeys("Sharat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		Thread.sleep(2000);
		WebElement Fname1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		String Fchange="Sharat";
		Thread.sleep(1000); 
		String AfterFname= Fname1.getAttribute("value");
		System.out.println(AfterFname);
		if(AfterFname.equalsIgnoreCase(Fchange))
		{
			System.out.println("FirstName Updated to "+AfterFname);
		}
		 
	}
	
	@Test(priority=12)
	public void UpdateProfilebychangingLastName() throws Exception
	{
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		WebElement Lname=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
		System.out.println("First Name Before Update was "+Lname.getAttribute("value"));
		Lname.clear();
		Lname.sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		Thread.sleep(2000);
		WebElement Lname1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
		String Lchange="kumar";
		Thread.sleep(1000); 
		String AfterLname= Lname1.getAttribute("value");
		System.out.println(AfterLname);
		if(AfterLname.equalsIgnoreCase(Lchange))
		{
			System.out.println("LastName Updated to "+AfterLname);
		}
		 
	}
	
	
	@Test(priority=13)
	public void UpdateProfilebychangingEmail() throws Exception
	{
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		WebElement email=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		System.out.println("First Name Before Update was "+email.getAttribute("value"));
		email.clear();
		email.sendKeys("kumar@sk.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		WebElement email1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		Thread.sleep(2000);
		String emailchange="kumar@sk.com";
		Thread.sleep(1000); 
		String emailafterchange= email1.getAttribute("value");
		System.out.println(emailafterchange);
		if(emailafterchange.equalsIgnoreCase(emailchange))
		{
			System.out.println("LastName Updated to "+emailafterchange);
		}
		 
	}
	
	@Test(priority=14)
	public void UpdateProfilebychangingPhoneNumber() throws Exception
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		WebElement phonenumber=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]"));
		System.out.println("PhoneNumber Before Update was "+phonenumber.getAttribute("value"));
		phonenumber.clear();
		phonenumber.sendKeys("1456789641");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		Thread.sleep(2000);
		WebElement phonenumber1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]"));
		String phonenumberchange="1456789641";
		Thread.sleep(1000); 
		String Afterchange= phonenumber1.getAttribute("value");
		System.out.println(Afterchange);
		if(Afterchange.equalsIgnoreCase(phonenumberchange))
		{
			System.out.println("PhoneNumber Updated to "+Afterchange);
		}
		 
	}
	@Test(priority=14)
	public void UpdateProfilebychangingalltheFields() throws Exception
	{
     Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		//FirstName Change
		WebElement Fname=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		System.out.println("First Name Before Update was "+Fname.getAttribute("value"));
		Fname.clear();
		Fname.sendKeys("Sharat");
	
		//LastName Change
		WebElement Lname=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
		System.out.println("First Name Before Update was "+Lname.getAttribute("value"));
		Lname.clear();
		Lname.sendKeys("kumar");
		
		//Email Change
				WebElement email=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"));
				System.out.println("First Name Before Update was "+email.getAttribute("value"));
				email.clear();
				email.sendKeys("kumar@sk.com");
		
		
		
				//PhoneNumber Change
				WebElement phonenumber=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]"));
				System.out.println("First Name Before Update was "+phonenumber.getAttribute("value"));
				phonenumber.clear();
				phonenumber.sendKeys("1456789154");
		
	//Click On Update and Save button	
		
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		
				//FirstName Change validation
				Thread.sleep(2000);
				WebElement Fname1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		String Fchange="Sharat";
		Thread.sleep(1000); 
		String AfterFname= Fname1.getAttribute("value");
		System.out.println(AfterFname);
		if(AfterFname.equalsIgnoreCase(Fchange))
		{
			System.out.println("FirstName Updated to "+AfterFname);
		}
		//LastName Change validation
		WebElement Lname1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
		String Lchange="kumar";
		Thread.sleep(1000); 
		String AfterLname= Lname1.getAttribute("value");
		System.out.println(AfterLname);
		if(AfterLname.equalsIgnoreCase(Lchange))
		{
			System.out.println("LastName Updated to "+AfterLname);
		}
		//Email Change	 validation
		WebElement email1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		String emailchange="kumar@sk.com";
		Thread.sleep(1000); 
		String emailafterchange= email1.getAttribute("value");
		System.out.println(emailafterchange);
		if(emailafterchange.equalsIgnoreCase(emailchange))
		{
			System.out.println("Email Updated to "+emailafterchange);
		}
		//PhoneNumber Change validation
		WebElement phonenumber1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]"));
		String phonenumberchange="1456789154";
		Thread.sleep(1000); 
		String Afterchange= phonenumber1.getAttribute("value");
		System.out.println(Afterchange);
		if(Afterchange.equalsIgnoreCase(phonenumberchange))
		{
			System.out.println("PhoneNumber Updated to "+Afterchange);
		}
	}
	
	@Test(priority=15)
	public void FunctionalityOfUpdateProfilewithoutChangingdetails() throws Exception
	{
	     Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		WebElement e12=	driver.findElement(By.xpath("//p[contains(text(),'Please edit the profile details')]"));
		if(e12.isDisplayed())
		{
			String s12=e12.getText();
			System.out.println(s12);			
		}
			
			
	}
	@Test(priority=16)
	public void FunctionalityOfCopyingUserID() throws Exception
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//*[@id='copy']")).click();
		// Thread.sleep(2000);
		 WebElement e13=	driver.findElement(By.xpath("//div[contains(text(),'User Id Copied')]"));
		 Assert.assertTrue(e13.isDisplayed());
		 System.out.println("User Id Copied");
	
		 
	}	
	//////////////////////////////////////////////////////////////////RESET PASSWORD//////////////////////////////////////////////
	@Test(priority=17)
	public void FunctionalityOfResetPasswordtab() throws Exception
	{
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		WebElement e14=	driver.findElement(By.xpath("//p[contains(text(),'Change your Elderly Life Password')]"));
		Assert.assertTrue(e14.isDisplayed());
		
		String s14= e14.getText();
		System.out.println("Page Navigated to "+s14);
		
	}
	@Test(priority=18)
	public void ResetPassword() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("12345678");
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		WebElement e15=	driver.findElement(By.xpath("//div[contains(text(),'Password updated successfully')]"));
		Assert.assertTrue(e15.isDisplayed());
		
		
			String s15=e15.getText();
			System.out.println(s15);
		
		
		WebElement e16=	driver.findElement(By.xpath("//p[contains(text(),'Sign into Elderly Life Account')]"));
	//	Assert.assertTrue(e16.isDisplayed());
		String s16=e16.getText();
		System.out.println(s16);
		Thread.sleep(2000);
	}	
	@Test(priority=19)
	public void FunctionalityOfResetPasswordbyWrongConfirmPassword() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("12345678");
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345676");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		WebElement e16=	driver.findElement(By.xpath("//div[contains(text(),\"Please enter the same password you've entered befo\")]"));
		//Assert.assertTrue(e16.isDisplayed());
		if(e16.isDisplayed())
		{
			String s16=e16.getText();
			System.out.println(s16);
		}
		String s=driver.findElement(By.xpath("//div[contains(text(),\"Please enter the same password you've entered befo\")]")).getText();
		System.out.println(s);
	}
	
	
	@Test(priority=20)
	public void FunctionalityOfResetPasswordwithLessthan8digits() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345676");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		WebElement e17=	driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid password with min 8 character')]"));

		//Assert.assertTrue(e17.isDisplayed());
		if(e17.isDisplayed())
		{
			String s17=e17.getText();
			System.out.println(s17);
		}
		
	}
	
	
	@Test(priority=21)
	public void FunctionalityOfResetPasswordwithInValidPassword() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("1234567833");
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("12345678");
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		WebElement e18=	driver.findElement(By.xpath("//div[contains(text(),'Invalid password')]"));

		//Assert.assertTrue(e18.isDisplayed());
		if(e18.isDisplayed())
		{
			String s18=e18.getText();
			System.out.println(s18);
		}
		
	}
	
	@Test(priority=21)
	public void FunctionalityOfResetPasswordwithOutEnteringtheData() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		WebElement e18=	driver.findElement(By.xpath("//div[contains(text(),'Invalid password')]"));

		//Assert.assertTrue(e18.isDisplayed());
		if(e18.isDisplayed())
		{
			String s18=e18.getText();
			System.out.println(s18);
		}
		
	}
	
	@Test(priority=22)
	public void FunctionalityOfResetPasswordWithOutConfirmPassword() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("12345678");
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("12345678");
		//driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update and Save')]")).click();
		WebElement e16=	driver.findElement(By.xpath("//div[contains(text(),\"Please enter the same password you've entered befo\")]"));
		//Assert.assertTrue(e16.isDisplayed());
		if(e16.isDisplayed())
		{
			String s16=e16.getText();
			System.out.println(s16);
		}
		String s=driver.findElement(By.xpath("//div[contains(text(),\"Please enter the same password you've entered befo\")]")).getText();
		System.out.println(s);
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
}
