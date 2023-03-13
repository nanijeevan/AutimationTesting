package backoffice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryTestCreation {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor executor;
	
	CategoryTestCreation(WebDriver driver)
	 {
		this.driver = driver;
		 PageFactory.initElements(driver, this);		
		 this.executor = (JavascriptExecutor) this.driver; 
		this. wait = new WebDriverWait(driver,10);
		
	 }
	
	
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]") WebElement PrimaryData;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]") WebElement Categories;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]") WebElement CompareandSave;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]") WebElement Discounts;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]") WebElement VoucherGiftcards;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]") WebElement Supplier;
	@FindBy (how=How.XPATH, using="//body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement Categorypage;
	@FindBy (how=How.XPATH, using="//div[@id=\"tab-0\"]") WebElement OutgoingTab;
	@FindBy (how=How.XPATH, using="//div[@id=\"tab-1\"]") WebElement WarrantyTab;
	@FindBy (how=How.XPATH, using="//*[@class=\"new-btn-icon-text\"]") WebElement AddNewCategorybutton;
	@FindBy (how=How.XPATH, using="//h5[contains(text(),'Category')]") WebElement AddNewCategoryModalPage;	
	@FindBy (how=How.XPATH, using="//span[contains(text(),'×')]") WebElement CloseAddNewCategoryModalPage;
	@FindBy (how=How.XPATH, using="//input[@id='name']") WebElement Namefield;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Outgoings')]") WebElement OutgoingsCheckbox;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Warranties')]") WebElement WarrantiesCheckbox;
	
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Cancel')]") WebElement CancelButton;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Submit')]") WebElement SubmitButton;
	@FindBy (how=How.XPATH, using="//*[@class=\"templateCSV btn btn-link\"]") WebElement templatebutton;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Download')]") WebElement Downloadbutton;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]") WebElement importbutton;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]") WebElement searchfield;
	
	@FindBy (how=How.XPATH, using="//*[@id=\"panel-0\"]/div/div[2]/div/div/div/div[1]/div/div") WebElement categoryBox;
	@FindBy (how=How.XPATH, using="//button[@id='19']") WebElement viewdetails;
	@FindBy (how=How.XPATH, using="//div[@id='19']") WebElement AddNewLinkSubcategory;
	@FindBy (how=How.XPATH, using="//h5[contains(text(),'Subcategories')]") WebElement SubCategoryModalPage;
	@FindBy (how=How.XPATH, using="//input[@id='subcategory']") WebElement SubcategoryField;
	@FindBy (how=How.XPATH, using="//input[@id='link']") WebElement linkField;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Close')]") WebElement closebutton;
	@FindBy (how=How.XPATH, using="//*[contains(text(),'Catgeory was updated successfully.')]") WebElement CategoryCreatedToast;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Please enter all required fields')]") WebElement Categoryerror;
	
	@FindBy (how=How.XPATH, using="/html/body/div[2]/div/div[1]/div/div") WebElement viewdetailsModal;
	
	
	@FindBy (how=How.XPATH, using="//*[@id=\"panel-1\"]") WebElement WarrantyPage;
	@FindBy (how=How.XPATH, using="//button[@id='34']") WebElement WarrantyViewDetails;
	@FindBy (how=How.XPATH, using="/html/body/div[2]/div/div[1]/div/div") WebElement WarrantyViewDetailsPage;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Import')]") WebElement importpage;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Choose file')]") WebElement choosefile;
	
	
	public void TC_001()
	{
		PrimaryData.click();
		
		Categories.isDisplayed();
		CompareandSave.isDisplayed();
		Discounts.isDisplayed();
		VoucherGiftcards.isDisplayed();
		Supplier.isDisplayed();
	}
	
	public void TC_002()
	{
		PrimaryData.click();
		Categories.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(Categorypage));
		Categorypage.isDisplayed();
		AddNewCategorybutton.isDisplayed();
		WarrantyTab.isDisplayed();
		OutgoingTab.isDisplayed();
	}
	
	
	public void TC_003()
	{
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();
		wait.until(ExpectedConditions.visibilityOf(Categorypage));
		AddNewCategorybutton.click();
		wait.until(ExpectedConditions.visibilityOf(AddNewCategoryModalPage));
		AddNewCategoryModalPage.isDisplayed();
		
	}
	
	
	public void TC_004() throws Exception
	
	{
		
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();
		//wait.until(ExpectedConditions.visibilityOf(Categorypage));
		Thread.sleep(2000);
		AddNewCategorybutton.click();
	//	wait.until(ExpectedConditions.visibilityOf(AddNewCategoryModalPage));
		Thread.sleep(2000);	
		Namefield.sendKeys("Demotesting45111");
		OutgoingsCheckbox.click();
		SubmitButton.click();
		//CategoryCreatedToast.isDisplayed();
		Thread.sleep(1000);
		System.out.println(CategoryCreatedToast.getText());
				
	}
	
	
	public void TC_005() throws Exception
	
	{
		
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();
		//wait.until(ExpectedConditions.visibilityOf(Categorypage));
		Thread.sleep(2000);
		AddNewCategorybutton.click();
	//	wait.until(ExpectedConditions.visibilityOf(AddNewCategoryModalPage));
		Thread.sleep(2000);	
		
		OutgoingsCheckbox.click();
		SubmitButton.click();
		//CategoryCreatedToast.isDisplayed();
		Thread.sleep(1000);
		Categoryerror.isDisplayed();
		System.out.println(Categoryerror.getText());
				
	}
	
	public void TC_006() throws Exception
	
	{
		
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();		
		Thread.sleep(2000);
		viewdetails.click();
		Thread.sleep(1000);
		viewdetailsModal.isDisplayed();
	}
	
	
	public void TC_007() throws Exception
	
	{
		
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();		
		Thread.sleep(2000);
		WarrantyTab.click();
		Thread.sleep(1000);
		WarrantyPage.isDisplayed();
	}
		
	
	public void TC_008() throws Exception
	
	{
		
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();		
		Thread.sleep(2000);
		WarrantyTab.click();
		Thread.sleep(1000);
		WarrantyViewDetails.click();
		Thread.sleep(1000);
		WarrantyViewDetailsPage.isDisplayed();
	}
		
	public void TC_009() throws Exception
	
	{
		
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();		
		Thread.sleep(2000);
		templatebutton.click();
		Thread.sleep(1000);
		importbutton.isDisplayed();
		Downloadbutton.isDisplayed();
	}
	
	
	
	public void TC_010() throws Exception
	
	{
		
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();		
		Thread.sleep(2000);
		templatebutton.click();
		Thread.sleep(1000);
		Downloadbutton.click();
	}
	
	
	public void TC_011() throws Exception
	
	{
		
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();		
		Thread.sleep(2000);
		templatebutton.click();
		Thread.sleep(1000);
		importbutton.click();
		Thread.sleep(1000);
		importpage.isDisplayed();
	}
	
	
	
	public void TC_012() throws Exception
	
	{
		
		PrimaryData.click();
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Categories.click();		
		Thread.sleep(2000);
		templatebutton.click();
		Thread.sleep(1000);
		importbutton.click();
		Thread.sleep(1000);
		choosefile.click();
		
	}
	
	
	

	
}
