package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunDropdownInLoop {
	
	WebDriver driver;
	
	@BeforeTest
	public void browserlaunch() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
	
	}
	
	
	
	@Test
	public void table() throws Exception
	{
		Thread.sleep(1000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Question Bank')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[contains(text(),'+ Create Question')]")).click();
	Thread.sleep(1000);
	WebElement tax=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[5]/div[1]/select[1]"));
	
	Select taxselect=new Select(tax);
	WebElement subtax=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[6]/div[1]/select[1]"));
	Select subtaxselect=new Select(subtax);
	List<WebElement> alloptions=taxselect.getOptions();
	for(WebElement str: alloptions)
	{
//		if(str.getText().contains("Remember"))
//		{
//			str.click();
//		}
		taxselect.selectByVisibleText(str.getText());
		Thread.sleep(1000);
		//System.out.println(str.getSize());
	//	System.out.println(str.getText());
		
		Thread.sleep(2000);
		
		List<WebElement> sualloptions=subtaxselect.getOptions();
		
		for(WebElement sub:sualloptions)
		{
			subtaxselect.selectByVisibleText(sub.getText());
			Thread.sleep(1000);
		}
	
		
		
		
	}

	
	

	
	
	
	
	}

}
