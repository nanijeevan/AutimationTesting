package pageObjectModel;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderTesting {
	WebDriver driver;
	
@Test	
public void test1() throws Exception
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[3]/span[1]")).click();
	Thread.sleep(2000);
	String year="2023";
	 String month="Feb";	
	    String date="22";
	    Thread.sleep(2000);
	//    driver.findElement(By.xpath("//td[@class='next']")).click();
	    
	while(true)
	   {
	   String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	   Thread.sleep(2000);
	    String arr[]=	monthyear.split(" ");
	    String mon=arr[0];
	    String yr=arr[1];
	    if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
	    break;
	    else 
	    	driver.findElement(By.xpath("//td[@class='next']")).click();
	    
	    }
		
	   
	    //Date selection	   
	  List<WebElement> alldates=  driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
	  Thread.sleep(2000);
	   for(WebElement ele:alldates)
	   {
		   String dt=ele.getText();
		   if(dt.equalsIgnoreCase(date))
		   {
			   ele.click();
			   break;
		   }
	   }	 
	    
	   }
	

@AfterMethod
public void close()
{
	driver.close();
}

}


