package testcreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class POM {
	WebDriver driver;
	
	
	public POM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy (how = How.XPATH, using="//a[contains(text(),'Chapters, Topics')]") WebElement chapter;

@FindBy (how = How.XPATH, using="//span[contains(text(),'+Create New Chapter')]") WebElement newchapter;





public void trail() throws Exception
{
	chapter.click();
	Thread.sleep(2000);
	newchapter.click();
}
}
