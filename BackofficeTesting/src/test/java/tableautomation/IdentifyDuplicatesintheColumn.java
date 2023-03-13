package tableautomation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdentifyDuplicatesintheColumn {
	WebDriver driver;
	
	
	@Test
	public void test1() throws Exception
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
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[4]/div/div")).click();
		Thread.sleep(3000);	
		
		 driver.findElement(By.xpath("//div[contains(text(),'View All')]")).click();
		Thread.sleep(2000);	
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);	
		List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[7]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[1]"));
		int count=0;
		String s1=null;
		for(WebElement str:col)
		{
			 s1=str.getText();
				
			if(s1.contains(s1))
			{
				count=count+1;
				System.out.println(s1);
			}
			
			
	    }
		System.out.println("-------------------");
		System.out.println(s1);
		System.out.println(count);
		
	}

}
