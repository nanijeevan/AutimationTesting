package sikuliTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
	     String filepath = "C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\";
	        String inputFilePath = "C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\";
	        Screen s = new Screen();
	        Pattern fileInputTextBox = new Pattern(filepath + "type.PNG");
	        Pattern openButton = new Pattern(filepath + "open.PNG");
	        WebDriver driver;

	        // Open Chrome browser    
	        driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/image_upload/index.php");
	        Thread.sleep(3000);
	        // Click on Browse button and handle windows pop up using Sikuli
//	        Actions action =new Actions(driver);
//	        action.moveToElement(driver.findElement(By.xpath("//input[@id='photoimg']"))).perform();
	        s.click("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\click1.PNG");
	        s.wait(fileInputTextBox, 20);
	        //s.type(fileInputTextBox, inputFilePath + "Capture.PNG");
	        s.type("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\type.PNG", "C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\Capture.PNG");
	        s.click(openButton);

	        // Close the browser
	       // driver.close();

	}

}
