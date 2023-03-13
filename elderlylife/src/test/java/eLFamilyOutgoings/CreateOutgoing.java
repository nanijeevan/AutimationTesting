package eLFamilyOutgoings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOutgoing {
	
	WebDriver driver;
	
	

	@BeforeMethod
	public void setup() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Documents\\Bandicam\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");	
		Thread.sleep(3000);		
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);	
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[1]")).click();

	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Outgoings')]")).click();		
	}

	
	
	
	
	
	@Test
	public void test1() throws Exception
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'+ Add New Outgoings')]")).click();
		
		Thread.sleep(2000);
		//Category Selection
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(2000);
	String s1=	driver.findElement(By.xpath("//*[@id=\"react-select-2-listbox\"]")).getText();
	System.out.println(s1);
		
	}
	
	
	
	
	
//	@Test(priority=1)
//	public void FunctionalityOfAddingNewOutGoing() throws Exception
//	
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'+ Add New Outgoings')]")).click();
//		
//		Thread.sleep(2000);
//		//Category Selection
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
//		Thread.sleep(2000);
//		
//		////////////////////////////Dropdown selection//////////////////////////////////////
//		
//		WebElement e1=driver.findElement(By.xpath("//div[contains(text(),'Investment')]"));
//		e1.click();
////		Actions action=new Actions(driver);
////		action.moveToElement(e1).click();
////		List<WebElement> myElements = driver.findElements(By.xpath("//*[@id=\"react-select-2-listbox\"]"));
////		for(WebElement e : myElements) {
////		  System.out.println(e.getText());
//		//Product Type Selection
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[contains(text(),'Gold')]")).click();
//		Thread.sleep(2000);
//		//Type Product Name
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Demo test");
//		Thread.sleep(2000);
//		//Supplier selection
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//div[contains(text(),'Jewellery')]")).click();
//		Thread.sleep(2000);
//		//Filling Additional Details
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/textarea[1]")).sendKeys("Demo testing");
//		Thread.sleep(2000);
//		//Patment Details
//		//Amount
//		driver.findElement(By.xpath("//input[@id='formBasicEmail']")).sendKeys("100");
//		Thread.sleep(2000);
//		//Billing
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[contains(text(),'Monthly')]")).click();
//		Thread.sleep(2000);
//		//Calendar Start Date Selection
//		WebElement e3=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]"));
//		e3.click();
//		Thread.sleep(2000);
//		e3.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);		
//		Thread.sleep(2000);
//		//Calendar End Date Selection
//		WebElement e4=	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input[1]"));
//		e4.click();
//		Thread.sleep(2000);
//		e4.sendKeys(Keys.ENTER);	
//		Thread.sleep(2000);
//		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript("window.scrollBy(0,700)");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/button")).click();	
//	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	}


