package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.DatadrivenTest;

public class DataDrivenTestStepDef {
WebDriver driver;
public DatadrivenTest obj;
	@Given("User should launch the browser and enter the URL")
	public void user_should_launch_the_browser_and_enter_the_url() {

		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://dev-app.elderlylife.co.uk/");
		 obj=new DatadrivenTest(driver);

	}

	@When("User Login with emial as {string} and password as {string}")
	public void user_login_with_emial_as_and_password_as(String emailadd, String passwordadd) throws Exception {
	
		obj.enterdata(emailadd, passwordadd);
	}

	@When("click on on login button")
	public void click_on_on_login_button() throws Exception {
	
		obj.ClickonSignIn();
	}

	@Then("It should navigate to the User dashboard")
	public void it_should_navigate_to_the_user_dashboard() throws Exception {
	
		obj.familydashboard();
	}
	

}
