package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.FamilyCreation;
import pageObjectModel.SignUpPage;

public class ELSignUpStepDef {

	WebDriver driver;
	public SignUpPage obj;
	public FamilyCreation obj2;
	public JavascriptExecutor js;


@Given("User launched chrome browser")
public void user_launched_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	obj=new SignUpPage(driver);
	obj2=new FamilyCreation(driver);
	driver.manage().window().maximize();
   
}

@When("user opens signIn url {string}")
public void user_opens_sign_in_url(String url) {
	driver.get(url);
 
}

@When("click on signup link")
public void click_on_signup_link() {
	
	obj.clickonsignuplink();
    
}

@Then("It should open the create account page")
public void it_should_open_the_create_account_page() throws Exception {
  obj.signupPage();
}



@Then("User enter firstname as {string} lastname as {string} email as {string} password as {string} and confirmpassword as {string}")
public void user_enter_firstname_as_lastname_as_email_as_password_as_and_confirmpassword_as(String fname, String lname, String emailid, String pass, String confpass) throws Exception {
 obj.enterthedatainsidethefields(fname, lname, emailid, pass, confpass);
}

@Then("User click on Signup button")
public void user_click_on_signup_button() throws Exception {
obj.clickonSignUpbutton();
}

@Then("It should create the account and display the Hurray!! Your Elderly Life account has been successfully created modal page")
public void it_should_create_the_account_and_display_the_hurray_your_elderly_life_account_has_been_successfully_created_modal_page() throws Exception {
  obj.SignUpsuccess();
}

@Then("Close the browser")
public void close_the_browser() {
  driver.close();
}


@Then("It should display an error message as Email is already taken, Please use another emai")
public void it_should_display_an_error_message_as_email_is_already_taken_please_use_another_emai() throws Exception {
	obj.emailalreadytaken();
   
}

@Then("It should display an error message as Please enter a valid password")
public void it_should_display_an_error_message_as_please_enter_a_valid_password() throws Exception {
	obj.entervalidpassword();
  
}
@Then("It should display an error message as Please enter the same password you've entered before")
public void it_should_display_an_error_message_as_please_enter_the_same_password_you_ve_entered_before() throws Exception {
 obj.confirmpassword();  
}

@Then("It should display an error message as This is not a valid email format !")
public void it_should_display_an_error_message_as_this_is_not_a_valid_email_format() throws Exception {
	obj.Invalidemailformat();

}

@Then("It should display an error message as Please enter the required fields")
public void it_should_display_an_error_message_as_please_enter_the_required_fields() throws Exception {
	
  obj.EnterRequireddata();
}
@Then("User enter firstname as {string} lastname as {string}  password as {string} and confirmpassword as {string}")
public void user_enter_firstname_as_lastname_as_password_as_and_confirmpassword_as(String fname, String lname, String pass, String Confpass) throws Exception {
  obj.datawithoutEmail(fname, lname, pass, Confpass);
}

@Then("User enter firstname as {string} lastname as {string} email as {string}")
public void user_enter_firstname_as_lastname_as_email_as(String fname, String lname, String emailid) throws Exception {
	obj.datawithoutpassword(fname, lname, emailid);

}

@Then("User clicks on the the Already have an account? Login here link")
public void user_clicks_on_the_the_already_have_an_account_login_here_link() throws Exception {
	obj.clickonSignInlink();
  
}
@Then("It should navigate to the SignIn page")
public void it_should_navigate_to_the_sign_in_page() throws Exception {
	obj.navigatetoSignInPage();
 
}











////Family Creation



@When("login to the application")
public void login_to_the_application() throws Exception {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gleecustest1@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();

}
@Then("Navigate to the create account plan page")
public void navigate_to_the_create_account_plan_page() throws Exception {
	
  obj2.NavigatetoCreateaccountPage();
}
@Then("Create the family")
public void create_the_family() throws Exception {
   obj2.familyCreate();
}












}
