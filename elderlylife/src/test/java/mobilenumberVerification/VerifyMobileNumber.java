package mobilenumberVerification;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VerifyMobileNumber {
	WebDriver driver;
	JavascriptExecutor executor;
	


	@FindBy (how=How.XPATH, using="//button[@id='dropdown-basic']") WebElement ProfileDropdown ;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Profile')]") WebElement ProfileOption ;

	
	
	

	
	
	
	
	
	VerifyMobileNumber(WebDriver driver)
	 {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		
		 this.executor = (JavascriptExecutor) this.driver; 
	 }	
	
}
