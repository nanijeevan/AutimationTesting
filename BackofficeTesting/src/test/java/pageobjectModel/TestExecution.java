package pageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExecution {
	WebDriver driver;
	Test1 obj;
	

	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.browserstack.com/");
	}

	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted() {
		obj = new Test1(driver);
		obj.veryHeader();	
	}

	@Test(priority = 2)
	public void enter_userDetails() {
		obj = new Test1(driver);
		obj.veryHeader();
		obj.enterFullName("TestUser");
		obj.enterBusinessEmail("TestUser@gmail.com");
		obj.enterPasswrod("TestUserPassword");
	}
}
