package tableautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdentifiTextinTableandClickOnIt {
	WebDriver driver;
	@Test
	public void browserlaunch() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
//		driver.get("https://dev-admin.elderlylife.co.uk/login");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@el.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
//		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]/div[1]")).click();
//		Thread.sleep(4000);
//		//driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")).click();
//		driver.findElement(By.linkText("Primary Data")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Discounts")).click();
//		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,300)");
		
//		List<WebElement> s1=	driver.findElements(By.tagName("tr"));
	//	
	//	
//		for(WebElement s2:s1)
//		{
//		String text=	s2.getText();
	//	
//		if(text.contains("Albania"))
//		{
//			driver.findElement(By.xpath("//input[@class=\"hasVisited\"]")).click();
//		}
//		System.out.println(text);
//		}
		
		
//		String ss=driver.findElement(By.xpath("//*[@id=\"panel-0\"]/div/div[2]/div/div/table/tbody")).getText();
//		System.out.println(ss);
		
//		driver.findElement(By.xpath("//*[@id=\"panel-0\"]/div/div[2]/div/div/table/tbody/tr[1]/td[4]/div[1]"));
	//List<WebElement> total=	driver.findElements(By.xpath("//*[@id=\"panel-0\"]/div/div[2]/div/div/table/tbody/tr/td[4]/div[1]"));
	//	
	//int size=total.size();
	//System.out.println(size);



//		if(ss.contains("Electrical"))
//		{
//			driver.findElement(By.xpath("//*[@id=\"panel-0\"]/div/div[2]/div/div/table/tbody/tr[1]/td[1]"));
//		//	driver.findElement(By.xpath("//*[@id=\"panel-0\"]/div/div[2]/div/div/table/tbody/tr["+i+"]/td[4]/div[1]")).click();
//		}	
	
		
			driver.get("https://bo-dev.nslsdev.com/");
			driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
			driver.findElement(By.id("password")).sendKeys("AdminOne@123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			String Pagetitle =	driver.getTitle();
			System.out.println(Pagetitle);		
		
			Thread.sleep(3000);	
			driver.findElement(By.linkText("User management")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Partnered Schools')]")).click();
			Thread.sleep(3000);
			JavascriptExecutor js=(JavascriptExecutor)driver;

			List<WebElement> columVal =  driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[1]"));
		    // count the size of the list to match with the size of the column state
		    System.out.println("Size of the contents in the column state is : " +columVal.size());
		    List<WebElement> viewdetails=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[3]/div/div/div/a/button/span"));
		    // now for matching one of the content and then performing some action please
		    // start a for loop
			String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		    String oneVal = "Camritz Global School - CBSE Kavadiguda";
		    WebElement element=driver.findElement(By.xpath(""));
		    
		    
		    for(int i=0;i<columVal.size();i++)
		    {
		        System.out.println("Content text is : " + columVal.get(i).getText());
		        System.out.println("Content text is : " + viewdetails.get(i).getText());
		        // match the content here in the if loop
		        if(columVal.get(i).getText().equals(oneVal))
		        {
		            // perform action
			            //columVal.get(i).click();
		        	viewdetails.get(i).sendKeys(selectLinkOpeninNewTab);
		        	
		    }
	        
	}
		    
	}
	
}
