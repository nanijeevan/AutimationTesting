package familyDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangeFamilyName {
	
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
	public void FunctionalityOfChangeFamilyNameButton() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Change Family Name')]")).click();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//h3[contains(text(),'Update Family Name')]"));
		if(name.isDisplayed())
		{
			String s=name.getText();
			System.out.println("Update Family Name Modal page Opened and titled as "+s);
		}
		else
		{
			System.out.println("Page not opened Test Failed");
		}
	}
	@Test(priority=2)
	public void FunctionalityOfUpdatingeFamilyName() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Change Family Name')]")).click();
		Thread.sleep(2000);
		
		WebElement e1=driver.findElement(By.name("family_name"));
		//WebElement e1=driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"));
		e1.clear();
		e1.sendKeys("FamilyUpdate123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
	}
	
	@Test(priority=3)
	public void FunctionalityOfUpdatingeFamilyNamewithoutchangingthename() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Change Family Name')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
	//	WebElement e4=	driver.findElement(By.xpath("//div[contains(text(),'Same Family Name exists')]"));
//		if(e4.isDisplayed())
//		{
//			String s3=e4.getText();
//			System.out.println(s3);}
//		    Thread.sleep(2000);
//		
	}
//	
	@Test(priority=4)
	public void FunctionalityOfUpdatingeFamilyByClearingtheName() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Change Family Name')]")).click();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.name("family_name"));
		e1.clear();
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		Thread.sleep(2000);
//		WebElement e2=driver.findElement(By.xpath("//p[contains(text(),'Add a name to your family on EL platform. It shoul')]"));
//		
//		if(e2.isDisplayed())
//		{
//			String s2=e2.getText();
//			System.out.println(s2);
//		}
		Thread.sleep(2000);
	}
	@Test(priority=5)
	public void FunctionalityOfCloseIconInUpdatingeFamilyModalPage() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Change Family Name')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		WebElement e3=	driver.findElement(By.xpath("//h3[contains(text(),'Notifications')]"));
		if(e3.isDisplayed())
		{
			System.out.println("Update Family Name ModalPage Closed and Navigated to Family Dashboard Page");
		}
		Thread.sleep(2000);
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
