package sikuliTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	WebDriver driver;
	
	




	@Test(priority=1)
	public void FunctionalityOfAddingNewOutGoing() throws Exception
	
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");	
		Thread.sleep(3000);		
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);	
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div/div")).click();

	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Outgoings')]")).click();	
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'+ Add New Outgoings')]")).click();
		
		Thread.sleep(2000);
	
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
	Screen s=new Screen();
	s.click("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\browse.PNG");
	}
	
	
	
	
	
}
