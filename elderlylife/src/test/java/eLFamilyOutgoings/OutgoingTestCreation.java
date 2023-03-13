package eLFamilyOutgoings;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OutgoingTestCreation {	
	
	WebDriver driver;
	JavascriptExecutor executor;
	
	
	@FindBy (how=How.XPATH, using="//*[contains(text(),'Authorization Issue (Auth Issue)') and @class=' css-1dimb5e-singleValue']") WebElement wer;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Outgoings')]") WebElement Outgoingslink;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'My Outgoings')]") WebElement MyOutgoingsPage;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'+ Add New Outgoings')]") WebElement AddNewOutgoingButton;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Add a New Outgoings')]") WebElement AddNewOutgoingPage;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[1]/span[1]/a[1]/p[1]") WebElement BacktoMyOutgoingsbutton;
	
	//My Outgoings
	
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Costs by billing frequency')]") WebElement CostingByBillingFrequency;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Total cost breakdown')]") WebElement Totalcostbreakdown;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/input[1]") WebElement SearchField;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Filter by :')]") WebElement FilterBy;
	
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Monthly')]") WebElement SelectFilterBy;
	
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/*[1]") WebElement FilterByField;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/*[1]") WebElement SortByField;
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Updated')]") WebElement SelectSortBy;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Sort by :')]") WebElement SortBy;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/small[1]") WebElement ProductName;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/small[1]") WebElement SupplierName;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/small[1]") WebElement Billing;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/small[1]") WebElement Cost;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/small[1]") WebElement EndDate;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/small[1]") WebElement Reminder;

	
	
	
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/span[1]/div[1]/*[1]") WebElement ViewDocument;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/span[1]/img[1]") WebElement EditIcon;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/span[1]/img[2]") WebElement DeleteIcon;
	
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Delete Outgoing')]") WebElement DeletePopUp;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Cancel')]") WebElement CancelDelete;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Yes')]") WebElement DeleteYES;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/button[1]") WebElement DeleteClose;
	
	
	
	@FindBy (how=How.XPATH, using="//*[@id=\"root\"]/div[2]/div[2]/div/div[6]/div/div/div[1]/div") WebElement ViewOutgoing;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'View Document')]") WebElement ViewDocumentPage;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Download')]") WebElement DownloadDocument;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/button[1]") WebElement CloseDocument;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Cancel Reminder')]") WebElement CancelReminderPopUp;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Cancel')]") WebElement ReminderOFFCancel;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Yes')]") WebElement ReminderOffYES;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/button[1]") WebElement CloseCancelReminder;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/p[1]/label[1]/div[1]") WebElement ReminderOFF;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/div[7]/p[1]/label[1]/div[1]") WebElement ReminderON;
	
	
	//ViewOutgoing
	
	
	@FindBy (how=How.XPATH, using="//h4[contains(text(),'Outgoing details')]") WebElement OutgoingsDetailsPage;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/span[1]/p[1]/a[1]") WebElement BackToMyOutgoingsButton;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Category')]") WebElement CategoryOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Amount')]") WebElement AmountOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Product Name')]") WebElement ProductNameOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Billing')]") WebElement BillingOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Product Type')]") WebElement ProductTypeOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Contract Start Date')]") WebElement ContractStartDateOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Supplier')]") WebElement SupplierOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Contract End Date')]") WebElement ContractEndDateOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Additional Details')]") WebElement AdditionalDetailsOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Document')]") WebElement DocumentOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Reminder on')]") WebElement ReminderonrOutgoingsDetails;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Edit Outgoing')]") WebElement EditOutgoingButtonOutgoingsDetails;
	
	
	
	
	
	//EDIT OUTGOING
	
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Edit Outgoing')]") WebElement EditOutgoingPage;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Update Outgoing')]") WebElement UpdateOutgoingButton;
	
	
	
	//Add New Outgoing
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Entertainment')]") WebElement SelectCategoryAddOutgoing;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Music')]") WebElement SelectProductAddOutgoing;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Others')]") WebElement SelectSupplierAddOutgoing;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Monthly')]") WebElement SelectBillingAddOutgoing;
	
	//div[contains(text(),'Investment')]
	
	
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Category')]") WebElement CategoryAddOutgoing;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Product Type')]") WebElement ProductTypeAddOutgoing;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Product Name')]") WebElement ProductNameAddOutgoing;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Supplier')]") WebElement SupplierAddOutgoing;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Additional Details ( Optional )')]") WebElement AdditionalDetailsAddOutgoing;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Amount')]") WebElement AmountAddOutgoing;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Billing')]") WebElement BillingAddOutgoing;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Start Date')]") WebElement StartDateAddOutgoing;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'End Date')]") WebElement EndDateAddOutgoing;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/label[1]") WebElement DocumentuploadAddOutgoing;
	@FindBy (how=How.XPATH, using="//input[@id='custom-switch']") WebElement ReminderOFFAddOutgoing;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Add Outgoing')]") WebElement ADDoutGoingButton;
	@FindBy (how=How.XPATH, using="//input[@id='keyValue']") WebElement NoEndDateCheckBox;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement SelectaCategory;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement SelectProductType;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]") WebElement ProductNameField;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement SupplierField;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/textarea[1]") WebElement AdditionalDetails;
	@FindBy (how=How.XPATH, using="//input[@id='formBasicEmail']") WebElement AmountField;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement BillingField;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]") WebElement StartDateField;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input[1]") WebElement EndDateField;
	@FindBy (how=How.XPATH, using="//body[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[3]/div[2]/label[1]") WebElement BrowseButton;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[1]/span[1]/a[1]/p[1]") WebElement BackToMyOutgouingsAddNewOutgoing;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Back to Family Dashboard')]") WebElement BackToFamilyDshboardButton;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/p[1]") WebElement FamilyDashboardPage;

	@FindBy (how=How.XPATH, using="//input[@id='keyValue']") WebElement Checkbox;

	
	
	OutgoingTestCreation(WebDriver driver)
	 {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
		 this.executor = (JavascriptExecutor) this.driver; 
	 }	
	
	
	
	public void TC001() throws Exception
	{
		Thread.sleep(2000);
		Outgoingslink.isDisplayed();
		
	}
	public void TC002() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		MyOutgoingsPage.isDisplayed();
		
	}
	public void TC003() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		CostingByBillingFrequency.isDisplayed();
		Totalcostbreakdown.isDisplayed();
		SearchField.isDisplayed();
		FilterBy.isDisplayed();
		FilterByField.isDisplayed();
		SortBy.isDisplayed();
		AddNewOutgoingButton.isDisplayed();
	
	}
	public void TC004() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		ProductName.isDisplayed();
		SupplierName.isDisplayed();
		Billing.isDisplayed();
		Cost.isDisplayed();
		EndDate.isDisplayed();
		Reminder.isDisplayed();
		ViewDocument.isDisplayed();
		EditIcon.isDisplayed();
		DeleteIcon.isDisplayed();
		
	}
	public void TC005() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		//executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		AddNewOutgoingButton.click();
		Thread.sleep(2000);
		AddNewOutgoingPage.isDisplayed();
		
	}
	public void TC006() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		AddNewOutgoingButton.click();
		Thread.sleep(2000);
		CategoryAddOutgoing.isDisplayed();
		ProductTypeAddOutgoing.isDisplayed();
		ProductNameAddOutgoing.isDisplayed();
		SupplierAddOutgoing.isDisplayed();
		executor.executeScript("window.scrollBy(0,600)");
		AdditionalDetailsAddOutgoing.isDisplayed();
		AmountAddOutgoing.isDisplayed();
		BillingAddOutgoing.isDisplayed();
		StartDateAddOutgoing.isDisplayed();
		EndDateAddOutgoing.isDisplayed();
		DocumentuploadAddOutgoing.isDisplayed();
		ReminderOFFAddOutgoing.isDisplayed();
		ADDoutGoingButton.isDisplayed();
		
	}
	public void TC007() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		
		AddNewOutgoingButton.click();
		Thread.sleep(2000);
		SelectaCategory.click();
		Thread.sleep(2000);
		SelectCategoryAddOutgoing.click();
		
		SelectProductType.click();
		Thread.sleep(2000);
		SelectProductAddOutgoing.click();
		ProductNameField.sendKeys("Demo testing");
		SupplierField.click();
		Thread.sleep(2000);
		SelectSupplierAddOutgoing.click();
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		AdditionalDetails.sendKeys("Demo user testing outgoings");
		AmountField.sendKeys("266");
		BillingField.click();
		SelectBillingAddOutgoing.click();
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		StartDateField.click();
		StartDateField.sendKeys(Keys.ENTER);
		EndDateField.click();
		EndDateField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ADDoutGoingButton.click();
	}
	public void TC008() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
	
		AddNewOutgoingButton.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		
//		SelectaCategory.click();
//		SelectCategoryAddOutgoing.click();
//		SelectProductType.click();
//		SelectProductAddOutgoing.click();
//		ProductNameField.sendKeys("Demo testing");
//		SupplierField.click();
//		SelectSupplierAddOutgoing.click();
//		AdditionalDetails.sendKeys("Demo user testing outgoings");
//		AmountField.sendKeys("266");
//		BillingField.click();
//		SelectBillingAddOutgoing.click();
//		StartDateField.click();
//		StartDateField.sendKeys(Keys.ENTER);
//		EndDateField.click();
//		EndDateField.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
		ADDoutGoingButton.click();
	}
	
	public void TC009() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		
		AddNewOutgoingButton.click();
		Thread.sleep(2000);
		BackToMyOutgouingsAddNewOutgoing.click();
		Thread.sleep(2000);
		MyOutgoingsPage.isDisplayed();
		
	}
	public void TC010() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		ViewOutgoing.click();
		Thread.sleep(2000);
		OutgoingsDetailsPage.isDisplayed();
	}
	public void TC011() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		ViewOutgoing.click();
		Thread.sleep(2000);
		BackToMyOutgoingsButton.isDisplayed();
		CategoryOutgoingsDetails.isDisplayed();
		AmountOutgoingsDetails.isDisplayed();
		ProductNameOutgoingsDetails.isDisplayed();
		BillingOutgoingsDetails.isDisplayed();
		ProductTypeOutgoingsDetails.isDisplayed();
		ContractStartDateOutgoingsDetails.isDisplayed();
		SupplierOutgoingsDetails.isDisplayed();
		ContractEndDateOutgoingsDetails.isDisplayed();
		AdditionalDetailsOutgoingsDetails.isDisplayed();
		DocumentOutgoingsDetails.isDisplayed();
		ReminderonrOutgoingsDetails.isDisplayed();
		EditOutgoingButtonOutgoingsDetails.isDisplayed();
		
	}
	public void TC012() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		ReminderOFF.click();
		Thread.sleep(1000);
		CancelReminderPopUp.isDisplayed();
	}
	public void TC013() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		ReminderOFF.click();
		Thread.sleep(1000);
		ReminderOffYES.click();
		Thread.sleep(2000);
		MyOutgoingsPage.isDisplayed();
	}
	public void TC014() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		ReminderOFF.click();
		Thread.sleep(1000);
		ReminderOFFCancel.click();
		Thread.sleep(2000);
		MyOutgoingsPage.isDisplayed();
	}
	
	
	
	public void TC015() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		EditIcon.click();
		Thread.sleep(2000);
		EditOutgoingPage.isDisplayed();
		
		
	}
	
	public void TC016() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		EditIcon.click();
		Thread.sleep(2000);
		CategoryAddOutgoing.isDisplayed();
		ProductTypeAddOutgoing.isDisplayed();
		ProductNameAddOutgoing.isDisplayed();
		SupplierAddOutgoing.isDisplayed();
		AdditionalDetailsAddOutgoing.isDisplayed();
		executor.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		AmountAddOutgoing.isDisplayed();
		BillingAddOutgoing.isDisplayed();
		StartDateAddOutgoing.isDisplayed();
		EndDateAddOutgoing.isDisplayed();
		DocumentuploadAddOutgoing.isDisplayed();
		ReminderOFFAddOutgoing.isDisplayed();
		UpdateOutgoingButton.isDisplayed();
	}
	
	public void TC017() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		EditIcon.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		UpdateOutgoingButton.click();
		Thread.sleep(6000);
		MyOutgoingsPage.isDisplayed();
	}
	
	public void TC018() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		DeleteIcon.click();
		Thread.sleep(1000);
		DeletePopUp.isDisplayed();
		
	}
	
	public void TC019() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		DeleteIcon.click();
		Thread.sleep(1000);
		CancelDelete.click();
		Thread.sleep(2000);
		MyOutgoingsPage.isDisplayed();
	}
	
	public void TC020() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		DeleteIcon.click();
		Thread.sleep(1000);
		DeleteYES.click();
		Thread.sleep(2000);
		MyOutgoingsPage.isDisplayed();
	}
	
	public void TC021() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		SearchField.sendKeys("test");
		Thread.sleep(1000);
		SearchField.sendKeys(Keys.ENTER);
	}
	
	public void TC022() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		SearchField.sendKeys("test");
		Thread.sleep(1000);
		SearchField.sendKeys(Keys.ENTER);
		SearchField.clear();
	}
	public void TC023() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
	
		FilterByField.click();
		Thread.sleep(1000);
		SelectFilterBy.click();
	}
	public void TC024() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
//		executor.executeScript("window.scrollBy(0,400)");
//		Thread.sleep(1000);
		SortByField.click();
		Thread.sleep(1000);
		SelectSortBy.click();
		
	}
	public void TC025() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
//		executor.executeScript("window.scrollBy(0,400)");
//		Thread.sleep(1000);
		BackToFamilyDshboardButton.click();
		Thread.sleep(2000);
		FamilyDashboardPage.isDisplayed();
		
	}
	
	public void TC026() throws Exception
	{
		Outgoingslink.click();
		Thread.sleep(2000);
		
		AddNewOutgoingButton.click();
		Thread.sleep(2000);
		SelectaCategory.click();
		Thread.sleep(2000);
		SelectCategoryAddOutgoing.click();
		
		SelectProductType.click();
		Thread.sleep(2000);
		SelectProductAddOutgoing.click();
		ProductNameField.sendKeys("Demo testing");
		SupplierField.click();
		Thread.sleep(2000);
		SelectSupplierAddOutgoing.click();
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		AdditionalDetails.sendKeys("Demo user testing outgoings");
		AmountField.sendKeys("266");
		BillingField.click();
		SelectBillingAddOutgoing.click();
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		Checkbox.click();
		StartDateField.click();
		StartDateField.sendKeys(Keys.ENTER);
//		EndDateField.click();
//		EndDateField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ADDoutGoingButton.click();
		
	}
	
	
	
	
}
