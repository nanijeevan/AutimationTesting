package testexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcreation.POM;

public class TestExecution {
	
	
	WebDriver driver;
	POM obj;
	
	JavascriptExecutor js;
	//Screen s;
	@BeforeMethod
	public void browsersetup() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Primary data management")).click();
		Thread.sleep(2000);
		js=(JavascriptExecutor)driver;
	
	//s=new Screen();
	obj=new POM(driver);
	}
	
	
	@Test
	public void test1() throws Exception
	{

		obj.trail();
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,700)");
		js.executeScript("window.scrollBy(0,700)");
		//clicking on the Choose file button

//			s.click("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\s1.PNG");
//		Thread.sleep(2000);
//		//Inside the Filename Input bix we are typying the the location of the file with name
//		s.type("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\ntype.PNG", "C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\open.PNG");
//		Thread.sleep(2000);
//		//Clicking on the open button
//		s.click("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\open.PNG");
//		Thread.sleep(2000);
//			driver.findElement(By.xpath("//textarea[@id='exampleText']")).sendKeys("Hyperbolic Equations");
//			Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
	}

}
