package eLFamilyOutgoings;

import static org.testng.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyOutgoingsPage {
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
		driver.findElement(By.xpath("//span[contains(text(),'Outgoings')]")).click();
		
	}
	
//	@Test
//	public void verifypagetitle()
//	{
//	WebElement pagetitle=	driver.findElement(By.xpath("//p[contains(text(),'You can track all your Outgoings on Elderly Life p')]"));
//	
//	if(pagetitle.isDisplayed())
//	{
//		String s1=pagetitle.getText();
//		System.out.println(s1);
//	}	
//	}
//	
//	@Test
//	public void verifysearchfield()
//	{
//	WebElement searchfield=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]"));
//	
//	if(searchfield.isDisplayed())
//	{
//		String s1=searchfield.getText();
//		System.out.println(s1);
//	}	
//	}	
//	
//	@Test
//	public void verifyAddnewOutgoingbutton()
//	{
//		WebElement AddnewOutgoingbutton=	driver.findElement(By.xpath("//button[contains(text(),'+ Add New Outgoings')]"));
//		if(AddnewOutgoingbutton.isDisplayed())
//		{
//			String s1=AddnewOutgoingbutton.getText();
//			System.out.println(s1);
//		}
//	}
//	
//	@Test
//	public void verifyFilterdropdown()
//	{
//		WebElement Filterdropdown=	driver.findElement(By.xpath("//div[contains(text(),'Filter by :')]"));
//		if(Filterdropdown.isDisplayed())
//		{
//			String s1=Filterdropdown.getText();
//			System.out.println(s1);
//		}
//	}
//	
//	@Test
//	public void verifysortdropdown()
//	{
//		WebElement sortdropdown=	driver.findElement(By.xpath("//div[contains(text(),'Sort by :')]"));
//		if(sortdropdown.isDisplayed())
//		{
//			String s1=sortdropdown.getText();
//			System.out.println(s1);
//		}
//	}
//	@Test
//	public void ValidateOutgoinglisting() throws Exception
//	{
//		Thread.sleep(3000);
//		WebElement productname=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/small[1]"));
//		if(productname.isDisplayed())
//		{
//			String s1=productname.getText();
//			System.out.println(s1);
//		}
//		WebElement suppliername=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/small[1]"));
//		if(suppliername.isDisplayed())
//		{
//			String s2=suppliername.getText();
//			System.out.println(s2);
//		}
//		WebElement billing=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/small[1]"));
//		if(billing.isDisplayed())
//		{
//			String s3=billing.getText();
//			System.out.println(s3);
//		}
//		WebElement cost=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/small[1]"));
//		if(cost.isDisplayed())
//		{
//			String s4=cost.getText();
//			System.out.println(s4);
//		}
//		WebElement endDate=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/small[1]"));
//		if(endDate.isDisplayed())
//		{
//			String s5=endDate.getText();
//			System.out.println(s5);
//		}
//		WebElement EditIcon=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/span[1]/div[1]/button[1]/img[1]"));
//		if(EditIcon.isDisplayed())
//		{
//			String s6=EditIcon.getText();
//			System.out.println("Edit Icon Displayed "+s6);
//		}
//		
//	
//	}
//	
//	
//	@Test
//	public void FunctionalityofEditIcon() throws Exception
//	{
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/span[1]/div[1]/button[1]/img[1]")).click();
//		//driver.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[5]/div/div/div[1]/div/div/div[7]/span/div/div"));
//		List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='dropdown-menu show']"));
//		for(WebElement e : myElements) {
//		  System.out.println("Edit Menu options: "+e.getText());
//		}
//	}
//	
//	
//	@Test
//	public void FunctionalityOfViewDetailsLink() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/span[1]/div[1]/button[1]/img[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'View Details')]")).click();
//		Thread.sleep(2000);
//		WebElement e1=	driver.findElement(By.xpath("//h4[contains(text(),'Outgoing details')]"));
//		if(e1.isDisplayed())
//		{
//			String s6=e1.getText();
//			System.out.println(s6);
//		}
//			
//	}
//	@Test
//	public void FunctionalityOfEditOutgoingLink() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/span[1]/div[1]/button[1]/img[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'Edit Outgoing')]")).click();
//		Thread.sleep(2000);
//		WebElement e1=	driver.findElement(By.xpath("//h3[contains(text(),'Edit Outgoing')]"));
//		if(e1.isDisplayed())
//		{
//			String s6=e1.getText();
//			System.out.println(s6);
//		}
//	}
//	@Test
//	public void FunctionalityOfCancelReminderLink() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/span[1]/div[1]/button[1]/img[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'Cancel Reminder')]")).click();
//		Thread.sleep(2000);
//		WebElement e1=	driver.findElement(By.xpath("//h3[contains(text(),'Cancel Reminder')]"));
//		if(e1.isDisplayed())
//		{
//			String s6=e1.getText();
//			System.out.println(s6);
//		}
//	}
//	@Test
//	public void FunctionalityOfDeleteOutgoingLink() throws Exception
//	{
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/span[1]/div[1]/button[1]/img[1]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[contains(text(),'Delete Outgoing')]")).click();
//		Thread.sleep(4000);
//		WebElement e1=	driver.findElement(By.xpath("//p[contains(text(),'All the Outgoings related details will be deleted ')]"));
//		if(e1.isDisplayed())
//		{
//			String s6=e1.getText();
//			System.out.println(s6);
//		}
//	}
//	@Test
//	public void FunctionalityOfSearchOutgoing() throws Exception
//	{
//		Thread.sleep(2000);
//		WebElement e1=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]"));
//		e1.sendKeys("Demo test");
//		e1.sendKeys(Keys.ENTER);	
//		Thread.sleep(2000);
//		WebElement e2=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]"));
//		if(e2.isDisplayed())
//		{
//			String s6=e2.getText();
//			System.out.println(s6+" Search Results are fetched");
//		}
//		Thread.sleep(2000);
//	}
//	@Test
//	public void FunctionalityOfCloseIconInSearchField() throws Exception
//	{
//		Thread.sleep(2000);
//		WebElement e1=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]"));
//		e1.sendKeys("Demo test");
//		e1.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/button[1]/img[1]")).click();
//		Thread.sleep(2000);
//		WebElement e2=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]"));	
//		Assert.assertFalse(e2.isDisplayed());
//		
//	}
	
	@Test(priority=1)
	public void DeleteOutgoing() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/span[1]/img[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		
		WebElement e1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]"));
		Assert.assertFalse(e1.isDisplayed());
	}
//	@Test(priority=2)
//	public void CancelDeleteOutgoing() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/span[1]/img[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
//		Thread.sleep(2000);
//		WebElement e1=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]"));
//		Assert.assertTrue(e1.isDisplayed());
//		
//	}
//	@Test(priority=3)
//	public void ReminderOFF() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/p[1]/label[1]/div[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		
//	}
	@Test(priority=4)
	public void CancelReminderOFF() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/p[1]/label[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
	}
//	@Test(priority=5)
//	public void ReminderON() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/p[1]/label[1]/div[1]")).click();
//	}
	
	
	@AfterMethod
	public void browserclose()
	{
		driver.close();
	}
	
	
	
	
	

//	public void VerifyPageHeader()
//	{
//		WebElement endDate=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/small[1]"));
//	}
}
