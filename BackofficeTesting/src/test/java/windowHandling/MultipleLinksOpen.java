package windowHandling;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleLinksOpen {
	WebDriver driver;
	
	@Test
	public void test() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		List<WebElement> e1=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav[2]/ul/li[2]/div/ul/li/a"));
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		String parentWindow=driver.getWindowHandle();
		for(WebElement str:e1)
		{
			str.sendKeys(selectLinkOpeninNewTab);
			
			Set<String> handles=driver.getWindowHandles();
			 for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		    	   
		          {
		    	   Thread.sleep(2000);
		          driver.switchTo().window(windowHandle);
		          Thread.sleep(2000);
		        String url=  driver.getCurrentUrl();
		        System.out.println(url);
		       //  <!--Perform your operation here for new window-->
		        driver.close(); //closing child window
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		         Thread.sleep(1000);
		          }
		       }						
		}
			
		/////////////////////////////////Working code//////////////////////////
	
//		for(int i=1;i<=e1.size();i++)
//		{
//			 Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav[2]/ul/li[2]/div/ul/li["+i+"]/a")).sendKeys(selectLinkOpeninNewTab);
//			Set<String> handles=driver.getWindowHandles();
//			for(String windowHandle  : handles)
//		       {
//		       if(!windowHandle.equals(parentWindow))
//		    	   
//		          {
//		    	   Thread.sleep(2000);
//		          driver.switchTo().window(windowHandle);
//		          Thread.sleep(1000);
//		        String url=  driver.getCurrentUrl();
//		        System.out.println(url);
//		        Thread.sleep(1000);
//		       //  <!--Perform your operation here for new window-->
//		         driver.close(); //closing child window
//		         driver.switchTo().window(parentWindow); //cntrl to parent window
//		        
//		          }
//		       }
//			
//		}
	
	
	}

}
