package filehandling;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextandWrite {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {

			   
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
			String s1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]")).getText();
			
			try {

		        FileWriter myWriter = new FileWriter("E:\\AutomationScreenshot\\filename.txt");	        
		        // \n is used to write the text in the next line.
		        myWriter.write(s1);
		     //   myWriter.write("Hello" + '\n' + "World"+ '\n');
		      //  myWriter.write("Files in Java might be tricky but it is fun enough!");
		        myWriter.close();
		        System.out.println("Successfully wrote to the file.");
		        
		      } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		    }

		}