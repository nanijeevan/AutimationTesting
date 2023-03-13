package sikulitesting1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;



public class Test1 {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Primary data management")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Chapters, Topics')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New Chapter')]")).click();
		Thread.sleep(2000);
		 
		   WebElement browse = driver.findElement(By.xpath("//input[@id='select']"));
		   //click on ‘Choose file’ to upload the desired file
		   //browse.sendKeys("C:\\Users\\Chait\\Desktop\\Files\\Job Specification.txt"); //Uploading the file using sendKeys
		//   browse.sendKeys("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\browse.PNG");
	   
		 //  System.out.println("File is Uploaded Successfully");
		   WebElement choose=driver.findElement(By.xpath("//input[@id='select']"));
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("arguments[0].click();", choose);
		   
		   Robot rb=new Robot();
		   
		   StringSelection ss=new StringSelection("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\browse.PNG");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		   
		   //CTR V
		   rb.keyPress(KeyEvent.VK_CONTROL);
		   rb.keyPress(KeyEvent.VK_V);
		   rb.keyRelease(KeyEvent.VK_CONTROL);
		   rb.keyRelease(KeyEvent.VK_V);
		   
		   
		   rb.keyPress(KeyEvent.VK_ENTER);
		   rb.keyRelease(KeyEvent.VK_ENTER);
	}
	}


