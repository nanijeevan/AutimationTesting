package windowHandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
WebDriver driver;

@Test
public void test1()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
      
      //navigate to url
      driver.get("https://dev-app.elderlylife.co.uk/");
      
     //Take the screenshot
      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      
      //Copy the file to a location and use try catch block to handle exception
      try {
          FileUtils.copyFile(screenshot, new File("E:\\AutomationScreenshot\\homePageScreenshot.png"));
      } catch (IOException e) {
          System.out.println(e.getMessage());
      }
      
      //closing the webdriver
      driver.close();
  }
}

