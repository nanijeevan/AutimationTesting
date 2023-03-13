package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void BrowsersetUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "D:\\\\Drivers\\\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("Edge"))
			
		{
			System.setProperty("webdriver.edge.driver", "D:\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
	}
	
	
	@Test(groups = {"smoke"} )
	
	public void demo()
	{
		driver.get("http://google.com");
	}
	
	
	
	
@Test(groups="smoke")
	
	public void demo1()
	{
		driver.get("http://gleecus.com");
	}
	
	
	
	
	
	
	
	
	}
	

