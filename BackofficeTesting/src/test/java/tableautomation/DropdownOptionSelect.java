package tableautomation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownOptionSelect {
	WebDriver driver;
	@Test
	public void test() throws Exception
	{
//		   try {
//		        FileWriter writer = new FileWriter("csv.txt");
//
//		        String table = null;
//				Document doc = Jsoup.parseBodyFragment(table);
//		        Elements rows = doc.getElementsByTag("tr");
//
//		        for (Element row : rows) {
//		            Elements cells = row.getElementsByTag("td");
//		            for (Element cell : cells) {
//		                writer.write(cell.text().concat(", "));
//		            }
//		            writer.write("\n");
//		        }
//		        writer.close();
//		    } catch (IOException e) {
//		        e.getStackTrace();
//		    }
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://udyamregistration.gov.in/searchregistration.aspx");
	
	
		Select selectstate=new  Select(driver.findElement(By.xpath("//select[@name=\"ctl00$ContentPlaceHolder1$ddlPState\"]")));
		List<WebElement> s1=selectstate.getOptions();
	
		
		for (WebElement option : s1)
			{
		  //  if (option.getText().contains("TELANGANA")) 
			String expected="tELanGa";
		    	 // if (option.getText().toLowerCase().contains("Telangana".toLowerCase())) 
			
				if (option.getText().toLowerCase().contains(expected.toLowerCase())) 
					{
					option.click();
					break;
					}
			}
		
		
		
		
//		List<WebElement> s1=selectstate.getOptions();
//		for(WebElement text:s1)
//		{
//		
//		System.out.println(text.getText());
//		
//		String sh=text.getText();
//		 String str = "GeeksforGeeks:A Computer Science Portal";
//	        String[] arrOfStr = sh.split("."+"/");
//	  
//	        for (String a : arrOfStr)
//	           System.out.println(a);	
//		}
//		Thread.sleep(2000);
//		//selectstate.selectByValue("36");
//		selectstate.selectByVisibleText("33. TELANGANA / तेलंगाना");
//		Thread.sleep(2000);
//	
//		Select selectdist=new  Select(driver.findElement(By.xpath("//select[@name=\"ctl00$ContentPlaceHolder1$ddlPDistrict\"]")));
//		List<WebElement> s2=selectdist.getOptions();
//		for(WebElement text1:s2)
//		{
//		
//		System.out.println(text1.getText());
//		
//			//System.out.println(text1.getAttribute("value"));
//		}
//		Thread.sleep(2000);
//		selectdist.selectByVisibleText("25. RANGA REDDI / रंगा रेड्डी");
//		
//		Thread.sleep(2000);
//		WebElement search=driver.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtsearchNic\"]"));
//		search.sendKeys("cement");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$btnSearch\"]")).click();
		    
		

	
	
	}	
	

}
