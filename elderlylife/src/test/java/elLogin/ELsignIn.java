package elLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ELsignIn {
	WebDriver driver;
	WebElement ele1;
	
	
	@Test(dataProvider="create")
	public void login(String Email,String password) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\elderlylife\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert sassert=new SoftAssert();
		driver.get("https://dev-app.elderlylife.co.uk/");
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		 ele1=driver.findElement(By.id("dropdown-basic"));
		
		sassert.assertTrue(ele1.isDisplayed());
		
		
		sassert.assertAll();
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

	
	@DataProvider(name="create")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
			//valid email and password
				{"yipebew843@moenode.com", "sy51N27NGAerx8dc"},
				//Invalid email and password
				{"nanijeevangoud686@gmail.com", "Jeeva"},
				//valid email and Invalid password
				{"nanijeevand68699@gmail.com", "Jeeva"},
				//Invalid email and valid password
				{"nanijegoud689996@gmail.com", "Jeeva"},
				//only email
				{"nanijegoud689996@gmail.com", ""},
				//only password
				{"", "Jeeva"},
				{"",""},
				
			
				};
	}

}
