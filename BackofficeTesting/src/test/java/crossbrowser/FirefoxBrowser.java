package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","D:\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://google.com");
	}

}
