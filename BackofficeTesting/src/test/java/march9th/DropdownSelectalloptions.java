package march9th;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelectalloptions {
	WebDriver driver;
	  String generatedString;
	@BeforeMethod
	//@Test
	public void login() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		
	}
	
	
	@Test
	public void test1() throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Outgoings')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'+ Add New Outgoings')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//div[contains(text(),'Accessories')]")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//div[contains(text(),'Auto test')]")).click();
		
		
		
		List<String> a = new ArrayList<String>();
		List<WebElement> options=driver.findElements(By.xpath("//div[@tabindex=\"-1\"]"));		
		System.out.println(options.size());
//		ArrayList<String> ar = new ArrayList<String>(); 
//		for(WebElement a2:options)
//		{
//			ar.add(a2.getText());
//			
//			
//			for(int i=0;i<1;i++)
//			{
//				Thread.sleep(2000);
//	
//				try
//				{
//				if(ar.get(i).contains(ar.get(i)))				
//				{
//					a2.click();
//				}
//				}
//				catch(org.openqa.selenium.StaleElementReferenceException ex)
//				{
//					a2.click();
//				}
//			}
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
//			
//		}
		
		
		
		for(WebElement a1:options)
		{
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(1000);
			System.out.println("length of the Category options are: "+options.size());			
			System.out.println(a1.getText());	
			Thread.sleep(2000);
			
	//	WebElement a1.getText()=driver.findElement(By.xpath(""));
		
			
			
		
				   byte[] array = new byte[7]; // length is bounded by 7
				    new Random().nextBytes(array);
				    generatedString = new String(array, Charset.forName("UTF-8"));

				    System.out.println(generatedString);
				
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
				//String s3=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div["+j+"]")).getText();
				WebElement generatedString  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'"+a1.getText()+"')]"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", generatedString);
			
			
			
			
			
			
			
	

		Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(3000);
		}	
		
	
		
		
		
		
		
	//	driver.findElement(By.xpath("//*[contains(text(),'"+ar.get(1)+"')]")).click();
		
		
	//	System.out.println(ar.get(1));
		
//		for(int i=0;i<1;i++)
//		{
//			Thread.sleep(2000);
//			
//			
//			
//			if(ar.get(i).contains(ar.get(i)))
//				
//				
//			{
//				
//			}
//			System.out.println(ar.get(i));
//			driver.findElement(By.xpath("//*[contains(text(),'"+ar.get(i)+"')]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
//			Thread.sleep(2000);
//			
//			
//		}
		
	//	for(WebElement a1:options)
	//	{
//		if(a1.getText().contains("Accessories"))
//		{
//			a1.click();
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
//		Thread.sleep(2000);		
//			if(a1.getText().contains("Auto test"))
//			{
//				a1.click();
//			}
//			Thread.sleep(3000);		
//			driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
//			Thread.sleep(2000);
	//	}
		
		
		
		
//		for(WebElement a1:options)
//		{
//			Thread.sleep(1000);
//			//driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
//			Thread.sleep(1000);
//			System.out.println("length of the Category options are: "+options.size());			
//			System.out.println(a1.getText());	
//				Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'"+a1.getText()+"')]"))); 
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
//		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'"+a1.getText()+"')]"))).click();
//		Actions action =new Actions(driver);
//		//action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+a1.getText()+"')]"))).click().perform();
//		//driver.findElement(By.xpath("//*[contains(text(),'"+a1.getText()+"')]")).click();
//		Thread.sleep(3000);
//			driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
//			Thread.sleep(3000);
//		}
//		
	
		
	}		
		
	
	
//@AfterMethod
public void browserclose()
{
	driver.close();
}
}
