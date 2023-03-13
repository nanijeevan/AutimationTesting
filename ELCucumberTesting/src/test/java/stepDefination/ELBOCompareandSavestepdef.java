package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.BackOffice_CompareandSaveModule;

public class ELBOCompareandSavestepdef {
	public WebDriver driver;
	public BackOffice_CompareandSaveModule obj;
	//public Screen screen;
	
	@Given("User should login to the EL Backoffice")
	public void user_should_login_to_the_el_backoffice() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		obj=new BackOffice_CompareandSaveModule(driver);
		driver.manage().window().maximize();
		driver.get("https://dev-admin.elderlylife.co.uk/login");
		obj.login();
	  
	}
	@When("Click on the Primary Management menu")
	public void click_on_the_primary_management_menu() throws Exception {
	  obj.primarydatamanagementlinkClick();
	}
	@Then("It should display the menu options that also includes Compare and Save")
	public void it_should_display_the_menu_options_that_also_includes_compare_and_save() throws Exception {
	obj.CompareandSaveLinkValidation();
	}

	@When("Click on the Compare and Save button")
	public void click_on_the_compare_and_save_button() throws Exception {
	 obj.CompareandSaveLinkclick();
	}
	@Then("It shuould navigate to the Compare and Save page")
	public void it_shuould_navigate_to_the_compare_and_save_page() throws Exception {
	  obj.CompareandSavePage();
	}
	

	@When("Click on the Add New button")
	public void click_on_the_add_new_button() throws Exception {
	 obj.AddNewButtonClick();
	}
	@Then("It should display the Add New Modal page")
	public void it_should_display_the_add_new_modal_page() throws Exception {
	  obj.AddNewModalaPage();
	}
	
	
	@When("Enter the details inside the fields and click on submit button")
	public void enter_the_details_inside_the_fields_and_click_on_submit_button() throws Exception {
	   obj.createcompareandsave();
	}
	@Then("It should create new Compare and Save category and display the success message")
	public void it_should_create_new_compare_and_save_category_and_display_the_success_message() throws Exception {
	
		obj.compareandsaveCreatedSuccessfully();
	}
	
	@When("Without entering the details click on submit button")
	public void without_entering_the_details_click_on_submit_button() throws Exception {
	obj.submitbutton();
	}
	@Then("It should an error messages under the fields")
	public void it_should_an_error_messages_under_the_fields() throws Exception {
	  obj.CreatecomparesaveError();
	}
	@When("Click on View Deatils button")
	public void click_on_view_deatils_button() {
	    obj.ViewdetailsClick();
	}
	@Then("It should display the category respective category")
	public void it_should_display_the_category_respective_category() {
	obj.ViewDetailsPage();
	}
	
	@When("Change the details and click on submit button")
	public void change_the_details_and_click_on_submit_button() throws Exception {
	  obj.editCompareandSave();
	}
	@Then("It should display the Update Success toast message")
	public void it_should_display_the_update_success_toast_message() throws Exception {
	   obj.UpdateSuccess();
	}

	@When("Click on the Template button")
	public void click_on_the_template_button() throws Exception {
	 obj.TemplatebuttonClick();
	}
	@Then("It should display as Download and Import options")
	public void it_should_display_as_download_and_import_options() throws Exception {
	   obj.TemplateMenu();
	}
	
	
	@When("Click on the Download button")
	public void click_on_the_download_button() throws Exception {
	obj.clickonDownload();

	}
	
	@Then("It should download the document")
	public void it_should_download_the_document() {
	   
	}

	@When("click on Import button")
	public void click_on_import_button() throws Exception {
	  obj.clickonImport();
	}
	@Then("It should display the Import modal page")
	public void it_should_display_the_import_modal_page() throws Exception {
	   obj.ImportModalPage();
	}


	@When("Upload the document")
	public void upload_the_document() throws Exception {
	 obj.UploadDocument();
	}
	@Then("It should the listing")
	public void it_should_the_listing() throws Exception {
		obj.uploaddocument();
	}	

//	@When("Upload the document with dulicate entries")
//	public void upload_the_document_with_dulicate_entries() throws Exception {
//	obj.filedownloaded();
//	}
	
	
	@When("Upload the document of different module")
	public void upload_the_document_of_different_module() throws Exception 
	{
	    obj.UploadDifferentModuleDOCUMENT();
	}

	
	@Then("It should display an error message as duplicate entries")
	public void it_should_display_an_error_message_as_duplicate_entries() throws Exception {
	  obj.DuplicateError();
	}


@Then("It should display an error message as keys dont match")
public void it_should_display_an_error_message_as_keys_dont_match() throws Exception {
	obj.KeysDontMatch();
   
}

@When("Upload the empty default document")
public void upload_the_empty_default_document() throws Exception {
	obj.UploadEmptyDOCUMENT();
   
}
@Then("It should display an error message as empty file")
public void it_should_display_an_error_message_as_empty_file() throws Exception {
	obj.EmptyFileError();
 
}

























	@Then("Close the Browser")
	public void close_the_browser() {
	   driver.close();
	}


}
