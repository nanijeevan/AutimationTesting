package eLBOTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintCategoryandSubCategory {
	WebDriver driver;
	String s5;
	
	@Test
	public void launchbrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev-admin.elderlylife.co.uk/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@el.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[1]/div/form/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(3000);
	
		List<WebElement> category =driver.findElements(By.xpath("//*[@id=\"panel-0\"]/div/div[2]/div/div/div/div/div/div/div/div/h5"));		
		List<WebElement> subcategory =driver.findElements(By.xpath("//*[@id=\"panel-0\"]/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div"));
		
		int csize=category.size();		
		int ssize=subcategory.size();
		
		for(int i=1;i<=csize;i++)
		{
			String s1=driver.findElement(By.xpath("//*[@id=\"panel-0\"]/div/div[2]/div/div/div/div/div/div["+i+"]/div/div/h5")).getText();
			System.out.println("Category Name: "+s1);		
				String s2=driver.findElement(By.xpath("//*[@id=\"panel-0\"]/div/div[2]/div/div/div/div/div/div["+i+"]/div/div/div[1]")).getText();
				System.out.println("Sub-Category Name: "+s2);							
		}

		
//		String s5;		
//		for(WebElement c1:category)
//		{
//			System.out.println("Category name: "+c1.getText());		
//		
//			for(WebElement s1:subcategory)
//			{
//				System.out.println("SubCategory name: "+s1.getText());		
//			
//			}
//			
//		}
//	
	
	driver.close();
	}
	

}
