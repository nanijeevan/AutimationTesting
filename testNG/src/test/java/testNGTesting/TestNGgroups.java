package testNGTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGgroups {
	WebDriver driver;
	 @Test(groups="smoke")
     public void FirefoxTest() {	 
         //Initializing the firefox driver (Gecko)
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();  
	    driver.get("https://www.demoqa.com"); 
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	    driver.quit();
      }

     @Test(groups="smoke")
	public void ChromeTest()
	{ 
	  //Initialize the chrome driver
		 WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.demoqa.com"); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  driver.quit();
	}
}
