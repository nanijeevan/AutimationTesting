package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://google.com");
		
	}

}
