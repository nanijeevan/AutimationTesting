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

public class OpenLinksInNewWindow {
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
		
//		WebElement link = driver.findElement(By.xpath("your link xpath"));
//		Actions newwin = new Actions(driver);
//		newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
//		Thread.sleep(6000);
//	Actions action=new Actions(driver);
	//action.keyDown(Keys.SHIFT).click(null).keyUp(Keys.SHIFT).build().perform();
		
		
		String newtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
//	String win=Keys.chord(Keys.SHIFT,Keys.ENTER);
//	
//		for(WebElement w1:links)
//		{
//			//System.out.println("No of Links"+links.size());
//			System.out.println(w1.getText());
//			Thread.sleep(1000);
//		//	action.keyDown(Keys.SHIFT).click(w1).keyUp(Keys.SHIFT).build().perform();
//			
//			w1.sendKeys(win);
//		}
//	System.out.println("----------success------------");
//	
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
	
		
	//Type two----Openeing 1 window->Swotch to that window->Get data->Close browser->Switch to main window->Open new window and continue the same process.
		
		String main1=driver.getWindowHandle();
		for(WebElement e1: links)
		{
			e1.sendKeys(newtab);
			
			Set<String> handles1=driver.getWindowHandles();
			
			for(String h2:handles1)
			{
				if(!h2.equals(main1))
				{
					driver.switchTo().window(h2);
					System.out.println(driver.getCurrentUrl());
					Thread.sleep(2000);					
					driver.close();
					driver.switchTo().window(main1);
					Thread.sleep(2000);
				}
				Thread.sleep(2000);
			}	
		}
		
		driver.close();


}
}