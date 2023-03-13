package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how=How.XPATH, using ="//span[contains(text(),'Sign Up')]") WebElement signuplink;
	@FindBy (how=How.XPATH, using ="//p[contains(text(),'Create an account on Elderly Life')]") WebElement signuppage;
	
	@FindBy (how=How.XPATH, using ="//span[contains(text(),'Already have an account? Login here')]") WebElement Alreadyhaveanaccount;
	@FindBy (how=How.XPATH, using ="//input[@name='firstname']") WebElement firstname;
	@FindBy (how=How.XPATH, using ="//input[@Name='lastname']") WebElement lastname;
	@FindBy (how=How.XPATH, using ="//input[@Name='email']") WebElement email;
	@FindBy (how=How.XPATH, using ="//input[@name='password']") WebElement password;
	@FindBy (how=How.XPATH, using ="//input[@name='confirmPassword']") WebElement confirmPassword;
	@FindBy (how=How.XPATH, using ="//button[contains(text(),'Sign Up')]") WebElement SignUpButton;
	@FindBy (how=How.XPATH, using ="//span[contains(text(),'Hurray!! Your Elderly Life account has been succes')]") WebElement SignUpcreated;
	
	
	
	@FindBy (how=How.XPATH, using ="//li[contains(text(),'Terms and conditions')]") WebElement Termsandconditions;
	@FindBy (how=How.XPATH, using ="//li[contains(text(),'Privacy policy')]") WebElement Privacypolicy;
	@FindBy (how=How.XPATH, using ="//div[contains(text(),'Email is already taken, Please use another email')]") WebElement Emailalreadytaken;
	@FindBy (how=How.XPATH, using ="//div[contains(text(),'Please enter a valid password')]") WebElement entervalidpassword;
	
	@FindBy (how=How.XPATH, using ="//div[contains(text(),\"Please enter the same password you've entered befo\")]") WebElement passwordandconfirmpasswordshouldbesame;
	@FindBy (how=How.XPATH, using ="//div[contains(text(),'This is not a valid email format !')]") WebElement Emailformat;
	
	@FindBy (how=How.XPATH, using ="//div[contains(text(),'Please enter the required fields')]") WebElement Enterrequiredfields;
	@FindBy (how=How.XPATH, using ="//p[contains(text(),'Sign into Elderly Life Account')]") WebElement SignInPage;
	@FindBy (how=How.XPATH, using ="//span[contains(text(),'Already have an account? Login here')]") WebElement SignInlink;
	
	public void  clickonsignuplink()
	{
		signuplink.click();
	}
	
	
	public void signupPage() throws Exception
	{
		Thread.sleep(2000);
		signuppage.isDisplayed();
	}
	
	public void enterthedatainsidethefields(String fname, String lname, String emailid, String pass, String Confpass) throws Exception
	{
		Thread.sleep(2000);
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(emailid);
		password.sendKeys(pass);
		confirmPassword.sendKeys(Confpass);
		
		
	}
	public void clickonSignUpbutton() throws Exception
	{
		Thread.sleep(2000);
		SignUpButton.click();	
	}
	
	public void SignUpsuccess() throws Exception
	{
		Thread.sleep(2000);
		SignUpcreated.isDisplayed();
	}
	
	public void close()
	{
		driver.close();
	}
	
	public void emailalreadytaken() throws Exception
	{
		Thread.sleep(2000);
		Emailalreadytaken.isDisplayed();
	}
	
	
	public void entervalidpassword() throws Exception
	{
		Thread.sleep(2000);
		entervalidpassword.isDisplayed();
	}
	
	public void confirmpassword() throws Exception
	{
		Thread.sleep(2000);
		passwordandconfirmpasswordshouldbesame.isDisplayed();
	}
	
	public void Invalidemailformat() throws Exception
	{
		Thread.sleep(3000);
		Emailformat.isDisplayed();
	}
	
	public void EnterRequireddata() throws Exception
	{
		Thread.sleep(2000);
		Enterrequiredfields.isDisplayed();
	}
	
	public void clickonSignInlink() throws Exception
	{
		Thread.sleep(2000);
		SignInlink.click();
	}
	
	public void navigatetoSignInPage() throws Exception
	{
		Thread.sleep(2000);
		SignInPage.isDisplayed();
	}
	
	public void datawithoutpassword(String fname, String lname, String emailid) throws Exception
	{
		Thread.sleep(2000);
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(emailid);
	}
	
	
	public void datawithoutEmail(String fname, String lname, String pass, String Confpass) throws Exception
	{
		Thread.sleep(2000);
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		password.sendKeys(pass);
		confirmPassword.sendKeys(Confpass);
		
	}
}
