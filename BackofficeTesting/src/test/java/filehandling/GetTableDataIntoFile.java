package filehandling;

import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTableDataIntoFile {

   	WebDriver driver;
   	FileWriter myWriter;
	
	
	@Test
	public void test1() throws Exception
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
				driver.findElement(By.xpath("//a[contains(text(),'Chapters, Topics')]")).click();
				Thread.sleep(2000);	
				
				List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div"));
				List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div"));
				
				int s1=rows.size();
				int s2=columns.size();
				 myWriter = new FileWriter("E:\\AutomationScreenshot\\newfilewrite5.csv");	
				String newLine = System.getProperty("line.separator");
				for (int i=1;i<=s1;i++)
				{
					for(int j=1;j<=s2;j++)
					{
						String sr=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[2]/div[1]/div/section/div/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div["+j+"]")).getText();
						System.out.print(sr);
						myWriter.write(sr );					  
						myWriter.write(",");				        
					    }						
					myWriter.write(newLine);	 
					    // \n is used to write the text in the next line.
						//  myWriter.write("sadvfbgjk dssvf");
					System.out.println();
					}					
					 myWriter.close();
				}
	
	
	
}

