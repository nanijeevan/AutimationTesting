package sikulitesting1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestinBackoffice {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://dev-admin.elderlylife.co.uk/login");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@el.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]/div[1]")).click();

		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Template')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(1000);
	//WebElement str=	driver.findElement(By.xpath("//span[contains(text(),'Choose file')]"));
		
	   WebElement choose=driver.findElement(By.xpath("//span[contains(text(),'Choose file')]"));
	 
	   
	   
	//////////////////////////Using the the Robot Keys///////////////////////////////////
	      
//	   JavascriptExecutor js=(JavascriptExecutor)driver;
//	   js.executeScript("arguments[0].click();", choose);
//	   
//	   Robot rb=new Robot();
//	   rb.delay(2000);
//	   StringSelection ss=new StringSelection("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\categoriesCompare&Save (17).csv");
//	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	 
	   
	   //CTR V
	   
//	   rb.keyPress(KeyEvent.VK_CONTROL);
//	   rb.keyPress(KeyEvent.VK_V);
//	   rb.keyRelease(KeyEvent.VK_CONTROL);
//	   rb.keyRelease(KeyEvent.VK_V);
//	   
//	   
//	   rb.keyPress(KeyEvent.VK_ENTER);
//	   rb.keyRelease(KeyEvent.VK_ENTER);
	   
	   
	///////////////////////////////Using the SendKeys/////////////////////////////////////////////////////////
	   
	   choose.sendKeys("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\categoriesCompare&Save (17).csv");	   
		
	}

}
