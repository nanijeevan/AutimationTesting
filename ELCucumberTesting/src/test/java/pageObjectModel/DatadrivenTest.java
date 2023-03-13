package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class DatadrivenTest {
	WebDriver driver;
	public JavascriptExecutor js;
	public DatadrivenTest(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		 this.js = (JavascriptExecutor) this.driver; 
	}
	@FindBy (how=How.XPATH, using ="//input[@type=\"email\"]") WebElement Email;
	@FindBy (how=How.XPATH, using ="//input[@type=\"password\"]") WebElement Password;	
	@FindBy (how=How.XPATH, using ="//button[contains(text(),'Sign In')]") WebElement signIn;
	@FindBy (how=How.XPATH, using ="//p[contains(text(),'Family Invitations')]") WebElement FamilyDashboard;
	

	
	
	
	public void enterdata(String email,String password) throws Exception
	{
		Email.sendKeys(email);
		Thread.sleep(1000);
		Password.sendKeys(password);
	}
	
	public void ClickonSignIn() throws Exception
	{
		Thread.sleep(1000);		
		signIn.click();
	}
	
	public void familydashboard() throws Exception
	{
		Thread.sleep(4000);	
		FamilyDashboard.isDisplayed();
	}
	
	
	
}

