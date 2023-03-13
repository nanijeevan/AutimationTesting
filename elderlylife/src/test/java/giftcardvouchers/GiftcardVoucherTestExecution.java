package giftcardvouchers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GiftcardVoucherTestExecution {
	
	public GiftcardVoucherTestCreation obj;
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");	
		driver.findElement(By.name("password")).sendKeys("12345678");
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
	Thread.sleep(2000);
	obj=new GiftcardVoucherTestCreation(driver);
	}
	
@Test(priority=1)	
public void VerifytheUIofVouchersGiftcardinmenulist()
{
	obj.TC001();
}
@Test(priority=2)	
public void VerifytheFunctionalityofVouchersGiftcardinmenulist() throws Exception
{
	obj.TC002();
}
@Test(priority=3)	
public void VerifytheUIofMyVouchersGiftcardpage() throws Exception
{
	obj.TC003();
}
@Test(priority=4)	
public void VerifytheUIofGiftcardVoucherboxesintheMyVouchersGiftcardpage() throws Exception
{
	obj.TC004();
}
@Test(priority=5)	
public void VerifythefunctionalityofAddnewGiftCardbutton() throws Exception
{
	obj.TC005();
}
@Test(priority=6)	
public void VerifytheUIofAddNewGiftcardpage() throws Exception
{
	obj.TC006();
}
@Test(priority=7)	
public void VerifythefunctionalityofaddingtheVoucher() throws Exception
{
	obj.TC007();
}
@Test(priority=8)	
public void VerifythefunctionalityofaddingtheVoucherwithoutenteringthedatainsidethefields() throws Exception
{
	obj.TC008();
}
@Test(priority=9)	
public void VerifythefunctionalityofBacktoMyVouchersGiftcardbutton() throws Exception
{
	obj.TC009();
}
@Test(priority=10)	
public void VerifythefunctionalityofVoucherdetailspagenavigation() throws Exception
{
	obj.TC010();
}
@Test(priority=11)	
public void VerifytheFunctionalityofEditicon() throws Exception
{
	obj.TC011();
}
@Test(priority=12)	
public void VerifythefunctionalityofEditVoucher() throws Exception
{
	obj.TC012();
}
@Test(priority=13)	
public void VerifytheFunctionalityofDeleteicon() throws Exception
{
	obj.TC013();
}
@Test(priority=14)	
public void VerifytheFunctionalityofCancelbuttoninDeletepopup() throws Exception
{
	obj.TC014();
}
@Test(priority=25)	
public void VerifytheFunctionalityofdeletinganOutgoing() throws Exception
{
	obj.TC015();
}
@Test(priority=16)	
public void VerifytheSearchfunctionalityinMyVouchersGiftcardspage() throws Exception
{
	obj.TC016();
}
@Test(priority=17)	
public void VerifytheSearchfunctionalityinMyVouchersGiftcardspagebyclearingtheinputtext() throws Exception
{
	obj.TC017();
}
@Test(priority=18)	
public void VerifytheFunctionalityoffilters() throws Exception
{
	obj.TC018();
}
@Test(priority=19)	
public void Verifythefunctionalityofsortbychangingthevalue() throws Exception
{
	obj.TC019();
}
@Test(priority=20)	
public void VerifythefunctionalityofBacktoFamilydashboardbutton () throws Exception
{
	obj.TC020();
}
@Test(priority=21)	
public void VerifytheFunctionalityofRemindertogglebutton() throws Exception
{
	obj.TC021();
}
@Test(priority=22)	
public void VerifythefunctionalityofReminderTurnOFF() throws Exception
{
	obj.TC022();
}
@Test(priority=23)	
public void VerifythefunctionalityofCancelbuttoninCancelReminderpopup() throws Exception
{
	obj.TC023();
}
@Test(priority=24)	
public void VerifytheUIofVoucherdetailspage() throws Exception
{
	obj.TC024();
}


	
	//@AfterMethod
	public void terminate()
	{
		
		driver.close();
	}

}
