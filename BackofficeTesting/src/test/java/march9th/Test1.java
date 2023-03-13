package march9th;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
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
		
		
		List<String> a = new ArrayList<String>();
		List<WebElement> options=driver.findElements(By.xpath("//div[@tabindex=\"-1\"]"));		
		System.out.println(options.size());
	
		
		for(WebElement a1:options)
		{
			Thread.sleep(1000);
		
				System.out.println("length of the Category options are: "+options.size());			
				System.out.println(a1.getText());	
				Thread.sleep(2000);
				generatedString = RandomStringUtils.randomAlphabetic(10);
				System.out.println(generatedString);
	
				WebDriverWait wait = new WebDriverWait(driver, 10);
				//String s3=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div["+j+"]")).getText();
				WebElement generatedString  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'"+a1.getText()+"')]"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", generatedString);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				Thread.sleep(3000);
			
		
				
				
				
				
		}	
	
}
}