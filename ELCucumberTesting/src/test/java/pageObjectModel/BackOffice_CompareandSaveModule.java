package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class BackOffice_CompareandSaveModule {
	
	public WebDriver driver;
	JavascriptExecutor js;
//	Screen s=new Screen();
	
	
	public BackOffice_CompareandSaveModule(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.js=(JavascriptExecutor)this.driver;		
		
		
	}

	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement CompareandSavepage;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]") WebElement CompareandSaveLink;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Add New')]") WebElement AddNewButton;
	@FindBy (how=How.XPATH, using="//h5[contains(text(),'Compare and Save')]") WebElement AddNewModalPage;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'×')]") WebElement AddNewModalPageCloseButton;
	@FindBy (how=How.XPATH, using="//input[@id='name']") WebElement CategoryName;
	@FindBy (how=How.XPATH, using="//input[@id='externalLink']") WebElement ExternalLink;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Submit')]") WebElement SubmitButton;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Cancel')]") WebElement CancelButton;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Add')]") WebElement ADDButton;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]") WebElement SearchField;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Template')]") WebElement TemplateButton;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]") WebElement ImportButton;
	@FindBy (how=How.XPATH, using="//button[@id='38']") WebElement ViewDetailsButton;
	@FindBy (how=How.XPATH, using="//h5[contains(text(),'Compare and Save')]") WebElement ViewDetailsPage;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Import')]") WebElement ImportPage;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Choose file')]") WebElement ChooseFilebutton;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'×')]") WebElement ImportClose;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Download')]") WebElement DownloadButton;
	@FindBy (how=How.XPATH, using="//input[@id='email']") WebElement email;
	@FindBy (how=How.XPATH, using="//input[@id='password']") WebElement password;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]") WebElement SignIn;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]") WebElement PrimaryDataManagementoption;
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'SaveAndComapres created successfully')]") WebElement ComparesavecreatetedsuccessPopUp;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Please enter all required fields')]") WebElement ErrorMessageforCreation;
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'SaveCompare was updated successfully.')]") WebElement UpdateSuccessToastMessage;
	
	@FindBy (how=How.XPATH, using="//html") WebElement downloaded;
	@FindBy (how=How.XPATH, using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]") WebElement DuplicateEntries;
	
	
	@FindBy (how=How.XPATH, using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]") WebElement EmptyFileError;
	@FindBy (how=How.XPATH, using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]") WebElement KeysDontMatch;
	
	
	
	
	public void EmptyFileError() throws Exception
	{
		Thread.sleep(1000);
		EmptyFileError.isDisplayed();
	}
	
	public void DuplicateError() throws Exception
	{
		Thread.sleep(1000);
		DuplicateEntries.isDisplayed();
	}
	public void KeysDontMatch() throws Exception
	{
		Thread.sleep(1000);
		KeysDontMatch.isDisplayed();
	}
	
	public void login() throws Exception
	{
		email.sendKeys("admin@el.com");
		Thread.sleep(1000);
		password.sendKeys("Admin@1234");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		SignIn.click();
		Thread.sleep(3000);
	}
	
	public void primarydatamanagementlinkClick() throws Exception
	{
		PrimaryDataManagementoption.click();
		Thread.sleep(1000);
		CompareandSaveLink.isDisplayed();
	}
	
	
	
	public void CompareandSaveLinkValidation() throws Exception
	{
	
		CompareandSaveLink.isDisplayed();
	}
	
	public void CompareandSaveLinkclick() throws Exception
	{
	
		CompareandSaveLink.click();
		Thread.sleep(1000);
	}
	

	public void CompareandSavePage() throws Exception
	{
		Thread.sleep(1000);
		CompareandSavepage.isDisplayed();
	}
	
	public void AddNewButtonClick() throws Exception
	{
	
		AddNewButton.click();
		Thread.sleep(1000);
	}
	public void AddNewModalaPage() throws Exception
	{
		Thread.sleep(1000);
	
		AddNewModalPage.isDisplayed();
	}
	
	public void createcompareandsave() throws Exception
	{
		CategoryName.sendKeys("Demo categoryUser test");
		Thread.sleep(1000);
		ExternalLink.sendKeys("http://google.com/");
		Thread.sleep(1000);
		SubmitButton.click();
		Thread.sleep(1000);
	}
	
	public void compareandsaveCreatedSuccessfully() throws Exception
	{
	
		Thread.sleep(1000);
		ComparesavecreatetedsuccessPopUp.isDisplayed();
	}
	
	
	public void submitbutton() throws Exception
	{
		Thread.sleep(1000);
		SubmitButton.click();
	}
	
	public void CreatecomparesaveError() throws Exception
	{
		Thread.sleep(1000);
		ErrorMessageforCreation.isDisplayed();
	}
	
	public void ViewdetailsClick()
	{
		ViewDetailsButton.click();
	}
	public void ViewDetailsPage()
	{
		ViewDetailsPage.isDisplayed();
	}
	
	
	public void editCompareandSave() throws Exception
	{
		Thread.sleep(1000);
		CategoryName.clear();
		Thread.sleep(1000);
		CategoryName.sendKeys("User Demo testing");
		Thread.sleep(1000);
		SubmitButton.click();
		Thread.sleep(1000);
	}
	
	public void UpdateSuccess() throws Exception
	{
		Thread.sleep(1000);
		UpdateSuccessToastMessage.isDisplayed();
	}
	public void TemplatebuttonClick() throws Exception
	{
		TemplateButton.click();
		Thread.sleep(1000);
		
	}
	
	public void TemplateMenu() throws Exception
	{
		Thread.sleep(1000);
		ImportButton.isDisplayed();
		DownloadButton.isDisplayed();
		
	}
	
	public void clickonDownload() throws Exception
	{
		Thread.sleep(1000);
		DownloadButton.click();
	}
	
	
	public void clickonImport() throws Exception
	{
		Thread.sleep(1000);
		ImportButton.click();
		Thread.sleep(1000);
	}
	
	public void ImportModalPage() throws Exception
	{
		Thread.sleep(1000);
		ImportPage.isDisplayed();
		Thread.sleep(1000);
	}
	
	
//	public void filedownloaded() throws Exception
//	{
//		s.find("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\downloaded.PNG");
//	}
	
	public void UploadDocument() throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Choose file')]")).sendKeys("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\categoriesCompare&Save.csv");
	
	}
	
	
	public void uploaddocument() throws Exception
	{
		Thread.sleep(1000);
		downloaded.isDisplayed();
	}
	
	
	public void uploadDuplicateEntriesfile() throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Choose file')]")).sendKeys("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\categoriesCompare&Save.csv");
		
		
	}
	
	
	public void UploadDifferentModuleDOCUMENT() throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Choose file')]")).sendKeys("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\categoriesOutgoings.csv");

	}
	public void UploadEmptyDOCUMENT() throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Choose file')]")).sendKeys("C:\\Users\\TOSHIBA\\Desktop\\sikulitest\\categoriesCompare&Save (17).csv");
	
	}
	
	
	
}
