package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageRefresh {
	WebDriver driver;
	
	@Test
	public void test1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://bo-dev.nslsdev.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
	WebElement e1=	driver.findElement(By.xpath(""));
		Actions action =new Actions(driver);
		action.doubleClick(e1);
	}

}
