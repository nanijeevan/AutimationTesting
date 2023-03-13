package windowHandling;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsHandling {
	WebDriver driver;
	
	@Test
	public void setup() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
		//Opening the links in the multiple windows
		
//		String newtab=Keys.chord(Keys.CONTROL,Keys.RETURN);
//		
//		for(WebElement w1:links)
//		{
//			//System.out.println("No of Links"+links.size());
//			System.out.println(w1.getText());
//			Thread.sleep(1000);
//			w1.sendKeys(newtab);
//		}
//		
//		String main=driver.getWindowHandle();
//		
//		Set<String> handles=driver.getWindowHandles();
//		
//		for(String h1:handles)
//		{
//			Thread.sleep(1000);
//			if(!h1.equals(main))
//			{
//				driver.switchTo().window(h1);
//				
//				System.out.println(driver.getTitle());
//				System.out.println(driver.getCurrentUrl());
//			}
//		}
		
	
		
//		WebElement link = driver.findElement(By.xpath("your link xpath"));
//		Actions newwin = new Actions(driver);
//		newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
//		Thread.sleep(6000);
//		
		
		
		
//		//Opening the link in new tab
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
//		String parentWindow=driver.getWindowHandle();
//		for(WebElement str:links)
//		{
//			str.sendKeys(selectLinkOpeninNewTab);
//			
//			Set<String> handles=driver.getWindowHandles();
//			 for(String windowHandle  : handles)
//		       {
//		       if(!windowHandle.equals(parentWindow))
//		    	   
//		          {
//		    	   Thread.sleep(2000);
//		          driver.switchTo().window(windowHandle);
//		          Thread.sleep(2000);
//		        String url=  driver.getCurrentUrl();
//		        System.out.println(url);
//		       //  <!--Perform your operation here for new window-->
//		        driver.close(); //closing child window
//		         driver.switchTo().window(parentWindow); //cntrl to parent window
//		         Thread.sleep(1000);
//		          }
//		       }						
//		}
//		
		
		
		

		
	
		
		
		
	}
	

}
