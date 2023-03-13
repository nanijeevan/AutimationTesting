package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerycalender {
	WebDriver driver;
	@Test
	public void demotest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
	    driver.switchTo().frame(0);
	    
		//driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")).click();
		
	    driver.findElement(By.id("datepicker")).click();
		String month="April";
		String year="2023";
		String date="23";
															
		
		
		
		while(true)
			
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			
			if(month.equalsIgnoreCase(mon) && year.equalsIgnoreCase(yr))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			}
		}
		
//	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
//	for(WebElement ele:dates)
//	{
//		String dt=ele.getText();
//		System.out.println(dt);
//		if(dt.equalsIgnoreCase(date))
//		{
//			ele.click();
//		}
//	}
//				
//	}
	
	
	
	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	
//	int count=dates.size();
//	
//	
//
//		
//		for(int i=0;i<count;i++)
//		{
//			List<WebElement> ele=dates;
//			String dt=((WebElement) ele).getText();
//			System.out.println(dt);
//			if(dt.equalsIgnoreCase(date))
//			{
//				((WebElement) ele).click();
//			}
//			
//		}
		
		
		
	
	for(WebElement ele:dates)
	{
		String dt=ele.getText();
		System.out.println(dt);
		if(dt.equalsIgnoreCase(date))
		{
			ele.click();
		}
	}
				
//	}
	}
}
