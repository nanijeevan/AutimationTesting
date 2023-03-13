package sikuliTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
		driver.findElement(By.xpath("//a[contains(text(),'Chapters, Topics')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'+Create New Chapter')]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Hyperbolic Equations");
//		Thread.sleep(2000);
//	WebElement grade=	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/span[1]/select[1]"));
//	Select select = new Select(grade);
//	select.selectByIndex(1);
//	Thread.sleep(2000);
//	WebElement subject=	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[3]/span[1]/select[1]"));
//	Select select1 = new Select(subject);
//	select1.selectByIndex(1);
//	Thread.sleep(2000);

		
			Screen s=new Screen();	
			//clicking on the Choose file button
			
				s.click("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\s1.PNG");
			Thread.sleep(2000);
			//Inside the Filename Input bix we are typying the the location of the file with name
			s.type("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\ntype.PNG", "C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\open.PNG");
			Thread.sleep(2000);
			//Clicking on the open button
			s.click("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\open.PNG");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@id='exampleText']")).sendKeys("Hyperbolic Equations");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		

	}

}
