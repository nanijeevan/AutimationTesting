package com.jenkins.DEMOJenking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trailtest {
	
	WebDriver driver;
	@Test(priority=1)
	public void login() throws Exception
	{	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mca.gov.in/content/mca/global/en/data-and-reports/company-llp-info/incorporated-closed-month.html");
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,300)");
		//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/img[1]")).click();
		
		WebElement searchTextBox= driver.findElement(By.xpath("//p[contains(text(),'Incorporated Or Closed During The Month')]"));

		// retrieving html attribute value using getAttribute() method
		String typeValue=searchTextBox.getAttribute("style");
		System.out.println("Value of type attribute: "+typeValue);
	}

}
