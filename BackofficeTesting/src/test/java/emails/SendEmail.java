package emails;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.testing.framework.EmailUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendEmail {
	WebDriver driver;
	@Test
	public void browserlaunch() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bo-dev.nslsdev.com/");
		//driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[2]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'States, Cities')]")).click();
		
		
	}
	
	@AfterSuite
	public void emailsend() throws Exception, Exception
	{
		EmailUtils emailUtils = new EmailUtils();
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\emailConfig\\emails.properties"));
		List<String> attachments = new ArrayList<String>();
		attachments.add("C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\test-output\\emailable-report.html");
		emailUtils.sendUsingGmail(prop, "Test Execution Results", "Hi Team, Execution is successful", attachments);
	}
	
}
