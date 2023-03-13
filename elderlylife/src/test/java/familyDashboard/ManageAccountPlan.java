package familyDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManageAccountPlan {
	
	

	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\elderlylife\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("tinku@esmoud.com");	
		driver.findElement(By.name("password")).sendKeys("12345678");
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[2]")).click();		
	}	
	@Test(priority=1)
	public void FunctionalityOfManageAccountPlanButton() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//p[contains(text(),'Manage Subscription')]"));
		if(e1.isDisplayed())
		{
			String s1=e1.getText();
			System.out.println(s1);
		}	
	}
	
	@Test(priority=2)
	public void ValidatingManageAccountPageDetails() throws Exception
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//p[contains(text(),'Payment Method')]"));
		WebElement e2=driver.findElement(By.xpath("//p[contains(text(),'Renewal History')]"));
		WebElement e3=driver.findElement(By.xpath("//p[contains(text(),'Family')]"));
	
		if(e1.isDisplayed())
		{
			String s1=e1.getText();
			System.out.println(s1);
		}
		
		if(e2.isDisplayed())
		{
			String s2=e2.getText();
			System.out.println(s2);
		}
		
		if(e3.isDisplayed())
		{
			String s3=e3.getText();
			System.out.println(s3);
		}
		
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void VefifythePresecneOfCurrentPlanwithChangePlanCTA() throws Exception
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		
		WebElement e4=driver.findElement(By.xpath("//p[contains(text(),'Family')]"));
		
		if(e4.isDisplayed())
		{
			String s4=e4.getText();
			System.out.println(s4);
		}
        WebElement e5=driver.findElement(By.xpath("//span[contains(text(),'Change Plan')]"));
		
		if(e5.isDisplayed())
		{
			String s5=e5.getText();
			System.out.println(s5);
		}
		
	}
	
	@Test(priority=4)
	public void FunctionalityOfChangePlanButton() throws Exception
	{
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Change Plan')]")).click();
		Thread.sleep(3000);
		 WebElement e6=driver.findElement(By.xpath("//h3[contains(text(),'Elderly Life Account Plans')]"));
		 if(e6.isDisplayed())
		 {
			 String s6=e6.getText();
			 System.out.println("Page Navigated to "+s6);
		 }
	}
	@Test(priority=5)
	public void RemoveUserFromFamily() throws Exception
	{
		Thread.sleep(4000);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement e8=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/span[2]/div[1]/div[1]/div[4]/div[1]/div[1]/button[1]/img[1]"));
		e8.click();
		driver.findElement(By.xpath("//a[contains(text(),'Remove User')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(4000);
		WebElement e7=driver.findElement(By.xpath("//div[contains(text(),'admin two')]"));
		Assert.assertFalse(e7.isDisplayed());
		System.out.println("User Deleted SuccessFully");
		
	}	
	@Test(priority=6)
	public void VFunctionalityOfChangeCardButton() throws Exception
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();	
	Thread.sleep(2000);
  WebElement e5=driver.findElement(By.xpath("//h3[contains(text(),'Payment Methods')]"));
        WebElement e6=driver.findElement(By.xpath("//p[contains(text(),'Current Card Being Used')]"));
        WebElement e7=driver.findElement(By.xpath("//p[contains(text(),'Tinku Goud')]"));
        WebElement e8=driver.findElement(By.xpath("//span[contains(text(),'+ Add new')]"));  
		if(e5.isDisplayed())
		{
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
		if(e8.isDisplayed())
		{
			String s8=e8.getText();
			System.out.println(s8);
		}
		
	}
	@Test(priority=7)
	public void FinctionalityOfAddNewCardButton() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'+ Add new')]")).click();
	Thread.sleep(2000);
	  WebElement e9=driver.findElement(By.xpath("//h3[contains(text(),'Add New Card')]"));  
			if(e9.isDisplayed())
			{
				String s9=e9.getText();
				System.out.println(s9);
			}
			 WebElement e10=driver.findElement(By.xpath("//p[contains(text(),'Add the details below to save a new card')]"));  
				if(e10.isDisplayed())
				{
					String s10=e10.getText();
					System.out.println(s10);
				}
		
	
	}
	@Test(priority=8)
	public void FinctionalityOfAddingNewCard() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'+ Add new')]")).click();
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/form[1]/div[1]")).sendKeys("4242424242424242424242424242");
	driver.findElement(By.name("cardnumber")).sendKeys("4242424242424242424242424242");
	driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[2]/form[1]/input[2]")).sendKeys("Bandlaguda");
	driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("Hydershakote");
	driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("Hyderabad");
	driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]")).sendKeys("Telangana");
	driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
	}
	
	
	@Test(priority=9)
	public void FinctionalityOfAddingNewCardWithoutFillingtheCardDetails() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'+ Add new')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
	}
	@Test(priority=10)
	public void FunctionalityOf3DotsBesidetheCard() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/img[1]")).click();
	Thread.sleep(2000);
	 WebElement e10=driver.findElement(By.xpath("//span[@id='del-pm_1LsPlGHPjiF3hUjmr6yR6kFL']"));  
		if(e10.isDisplayed())
		{
			String s10=e10.getText();
			System.out.println(s10);
		}
		 WebElement e1=driver.findElement(By.xpath("//span[@id='use-pm_1LsPlGHPjiF3hUjmr6yR6kFL']"));  
			if(e1.isDisplayed())
			{
				String s1=e1.getText();
				System.out.println(s1);
			}
	}
	@Test(priority=11)
	public void FunctionalityOfDeletingtheCard() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/img[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='del-pm_1LsPlGHPjiF3hUjmr6yR6kFL']")).click();
driver.findElement(By.xpath("//div[contains(text(),'YES')]")).click();
	}
	
@Test(priority=12)
public void FunctionalityOfUSEthisCard() throws Exception
{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
	Thread.sleep(2000);
	
driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();	
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/img[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@id='use-pm_1LsPlGHPjiF3hUjmr6yR6kFL']")).click();
WebElement e2=driver.findElement(By.xpath("//div[contains(text(),'Card has been updated as your default payment card')]"));
if(e2.isDisplayed())
{
	String s2=e2.getText();
	System.out.println(s2);
}	
}
@Test(priority=13)
public void DownloadInvoice() throws Exception
{
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
}	
@Test(priority=14)	
public void FunctionalityOfCloseIconInPaymentMethodsModalPage() throws Exception
{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/button[1]")).click();
	WebElement e2=driver.findElement(By.xpath("//p[contains(text(),'Manage Subscription')]"));
	if(e2.isDisplayed())
	{
		String s2=e2.getText();
		System.out.println(s2);
	}
}
@Test(priority=15)	
public void FunctionalityOfCloseIconInAddNewCardModalPage() throws Exception
{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
	Thread.sleep(2000);	
driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();	
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'+ Add new')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/button[1]")).click();
	
}
@Test(priority=16)
public void DeleteCardPopup () throws Exception
{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
	Thread.sleep(2000);
	
driver.findElement(By.xpath("//span[contains(text(),'Change Card')]")).click();	
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/img[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@id='del-pm_1Lk2lLHPjiF3hUjmSZ3Wdyr9']")).click();
Thread.sleep(2000);
WebElement e1=driver.findElement(By.xpath("//h3[contains(text(),'Confirm')]"));
WebElement e2=driver.findElement(By.xpath("//div[contains(text(),'Are you sure you want to delete this card ?')]"));
WebElement e3=driver.findElement(By.xpath("//div[contains(text(),'CANCEL')]"));
WebElement e4=driver.findElement(By.xpath("//div[contains(text(),'YES')]"));

if(e1.isDisplayed())
{
	String s1=e1.getText();
	System.out.println(s1);
}
if(e2.isDisplayed())
{
	String s2=e2.getText();
	System.out.println(s2);
}
if(e3.isDisplayed())
{
	String s3=e3.getText();
	System.out.println(s3);
}
if(e4.isDisplayed())
{
	String s4=e4.getText();
	System.out.println(s4);
}
}
@Test(priority=17)
public void CancelAccountPlanPopUp () throws Exception
{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Change Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Cancel Account Plan')]")).click();
	Thread.sleep(2000);
	WebElement e1=driver.findElement(By.xpath("//h3[contains(text(),'Cancel Account Plan')]"));
	WebElement e2=driver.findElement(By.xpath("//div[contains(text(),'You have opted to cancel your Family account plan ')]"));
	WebElement e3=driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
	WebElement e4=driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));

	if(e1.isDisplayed())
	{
		String s1=e1.getText();
		System.out.println(s1);
	}
	if(e2.isDisplayed())
	{
		String s2=e2.getText();
		System.out.println(s2);
	}
	if(e3.isDisplayed())
	{
		String s3=e3.getText();
		System.out.println(s3);
	}
	if(e4.isDisplayed())
	{
		String s4=e4.getText();
		System.out.println(s4);
	}
	
	}
@Test(priority=18)
public void FunctionalityOfCancelButtonInCancelAccountPlanPopUp () throws Exception
{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Change Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Cancel Account Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
	WebElement e1=driver.findElement(By.xpath("//h3[contains(text(),'Elderly Life Account Plans')]"));
	if(e1.isDisplayed())
	{
		String s1=e1.getText();
		System.out.println(s1);
	}
}
@Test(priority=19)
public void CancelAccountPlan () throws Exception
{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Change Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Cancel Account Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	WebElement e1=driver.findElement(By.xpath("//h3[contains(text(),'Elderly Life Account Plans')]"));
	if(e1.isDisplayed())
	{
		String s1=e1.getText();
		System.out.println(s1);
	}
}
	@Test(priority=20)
	public void FunctionalityOfCloseIconInCancelAccountPlanPopUp() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Manage Account Plan')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Change Plan')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Cancel Account Plan')]")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/button[1]")).click();
		WebElement e1=driver.findElement(By.xpath("//h3[contains(text(),'Elderly Life Account Plans')]"));
		if(e1.isDisplayed())
		{
			String s1=e1.getText();
			System.out.println(s1);
		}	
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
}

	
}

