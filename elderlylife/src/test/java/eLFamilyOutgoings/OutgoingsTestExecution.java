package eLFamilyOutgoings;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OutgoingsTestExecution {
	WebDriver driver;
	public OutgoingTestCreation obj;
	
	
	@BeforeMethod
	public void BrowserLaunch() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();			
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");	
		driver.findElement(By.name("password")).sendKeys("12345678");		
		Thread.sleep(1000);	
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
	    Thread.sleep(2000);
	    obj=new OutgoingTestCreation(driver);
	}

	
	@Test(priority=1)
	public void VerifytheUIofOutgoingsintheMENUitems() throws Exception 
	{
		
		obj.TC001();
	}
	@Test(priority=2)
	public void VerifythefunctionalotyofOutgoingslink() throws Exception 
	{
		obj.TC002();
	}
//	@Test(priority=3)
//	public void VerifytheUIofMyOutgoings() throws Exception 
//	{
//		obj.TC003();
//	}
//	@Test(priority=4)
//	public void VerifytheUIofOutgoingslisting() throws Exception 
//	{
//		obj.TC004();
//	}
//	@Test(priority=5)
//	public void VerifythefunctionalityofAddNewOutgoing() throws Exception 
//	{
//		obj.TC005();
//	}
//	@Test(priority=6)
//	public void VerifytheUIofAddNewOutgoing() throws Exception 
//	{
//		obj.TC006();
//	}
//	
//	@Test(priority=7)
//	public void VerifythefunctionalityofcreatinganOutgoing() throws Exception 
//	{
//		obj.TC007();
//	
//	}
//	
//	
//	@Test(priority=8)
//	public void VerifythefunctionalityofcreatinganOutgoingwithoutgivingrequireddata() throws Exception 
//	{
//		obj.TC008();
//	}	
//	@Test(priority=9)
//	public void VerifythefunctionalityofBacktoMyOutgoingsbuttoninAddNewOutgoingpage() throws Exception 
//	{
//		obj.TC009();
//	}	
//	@Test(priority=10)
//	public void VerifythefunctionalityofViewoutgoingnavigation() throws Exception 
//	{
//		obj.TC010();
//	}	
//	@Test(priority=11)
//	public void VerifytheUIofOutgoingsdetailspage() throws Exception 
//	{
//		obj.TC011();
//	}
//	@Test(priority=12)
//	public void VerifytheFunctionalityofRemindertogglebutton() throws Exception 
//	{
//		obj.TC012();
//	}
//	@Test(priority=13)
//	public void VerifythefunctionalityofReminderTurnOFF() throws Exception 
//	{
//		obj.TC013();
//	}
//	@Test(priority=14)
//	public void VerifythefunctionalityofCancelbuttoninCancelReminderpopup() throws Exception 
//	{
//		obj.TC014();
//	}
//	@Test(priority=15)
//	public void VerifythefunctionalityofEditIcon() throws Exception 
//	{
//		obj.TC015();
//	}
//	@Test(priority=16)
//	public void VerifytheUIofEditOutgoingpage() throws Exception 
//	{
//		obj.TC016();
//	}
//	@Test(priority=17)
//	public void VerifythefunctionalityofEditOutgoing() throws Exception 
//	{
//		obj.TC017();
//	}
//	@Test(priority=18)
//    public void VerifytheFunctionalityofDeleteicon() throws Exception 
//	{
//		obj.TC018();
//	}
//	@Test(priority=19)
//	public void VerifytheFunctionalityofCancelbuttoninDeletepopup() throws Exception 
//	{
//		obj.TC019();
//	}
//	@Test(priority=26)
//	public void VerifytheFunctionalityofdeletinganOutgoing() throws Exception 
//	{
//		obj.TC020();
//	}
//	@Test(priority=21)
//	public void VerifytheSearchfunctionalityinMyOutgoingspage() throws Exception 
//	{
//		obj.TC021();
//	}
//	@Test(priority=22)
//	public void VerifytheSearchfunctionalityByclearingtheSearchText() throws Exception 
//	{
//		obj.TC022();
//	}
//	@Test(priority=23)
//	public void VerifytheFunctionalityoffilters() throws Exception 
//	{
//		obj.TC023();
//	}
//	@Test(priority=24)
//	public void Verifythefunctionalityofsortbychangingthevalue() throws Exception 
//	{
//		obj.TC024();
//	}
//	@Test(priority=25)
//	public void VerifythefunctionalityofBacktoFamilydashboardbutton() throws Exception 
//	{
//		obj.TC025();
//	}
//	@Test(priority=27)
//	public void VerifytheFunctionalityofcreatinganOutgoingwithoutEnddate() throws Exception 
//	{
//		obj.TC026();
//	}
	
	
	
	
	@AfterMethod
	//AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
	if(ITestResult.FAILURE==result.getStatus()){
	try{
	// To create reference of TakesScreenshot
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	// Call method to capture screenshot
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	// Copy files to specific location
	// result.getName() will return name of test case so that screenshot name will be same as test case name
	FileUtils.copyFile(src, new File("E:\\AutomationScreenshot\\"+result.getName()+".png"));
	System.out.println("Successfully captured a screenshot");
	}catch (Exception e){
	System.out.println("Exception while taking screenshot "+e.getMessage());
	}
	}

	}
	
	
	
	
	
	
//	@AfterMethod
//	public void closebrowser()
//	{
//		driver.close();
//	}
	
}
