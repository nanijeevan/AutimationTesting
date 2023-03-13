package giftcardvouchers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GiftcardVoucherTestCreation {

	
	
	WebDriver driver;
	JavascriptExecutor executor;
	
	
	
	
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Voucher details')]") WebElement VocherdetailsPage ;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Cancel Reminder')]") WebElement CancelReminderPopUp ;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Yes')]") WebElement CancelReminderYES;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Cancel')]") WebElement CancelReminderCANCEL;
	
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Delete Voucher')]") WebElement DeleteReminderPopUp ;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Yes')]") WebElement DeleteReminderYES ;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Cancel')]") WebElement DeleteReminderCancel ;
	
	
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[1]/div[1]/div[1]") WebElement GiftcardVocherdetails ;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Vouchers & Gift cards')]") WebElement GiftcardVocher ;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'My Vouchers & Gift Cards')]") WebElement MyGiftcardVocherpage ;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'+ Add New Vouchers & Gift Cards')]") WebElement AddNewGiftcard ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Vouchers')]") WebElement VoucherKPI ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Gift Cards')]") WebElement GiftcardKPI ;
	
	
	
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Totals')]") WebElement TotalKPI ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/input[1]") WebElement searchfield ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/button[1]/img[1]") WebElement searchclose ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Filter by :')]") WebElement filterby ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Sort by :')]") WebElement sortby ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]") WebElement filterbyclick ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]") WebElement sortbyclick ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Expired')]\"") WebElement filterExpired ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'All')]\"") WebElement filterALL ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Active')]\"") WebElement filterActive ;
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Created')]") WebElement SortCreated ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Updated')]") WebElement SortUpdated ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Expiry Date')]") WebElement SortExpiryDate ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Total Amount')]") WebElement SortTotalAmount ;
	
	@FindBy (how=How.XPATH, using="Total Amount") WebElement Type ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[3]/small[1]") WebElement supplier ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[4]/small[1]") WebElement Totalamount ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[5]/small[1]") WebElement UsedAmount ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[6]/small[1]") WebElement Remainingamount ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[7]/small[1]") WebElement ExpiresON ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[8]/small[1]") WebElement Reminder ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[8]/p[1]/label[1]/div[1]") WebElement ReminderOFF ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[8]/p[1]/label[1]/div[1]") WebElement ReminderON ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[9]/span[1]/img[1]") WebElement EditIcon ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[9]/span[1]/img[2]") WebElement DeleteIcon ;
	
	
	
	//Add New GiftCard//
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Add a New Voucher & Gift card')]") WebElement AddNewGiftVoucherPage ;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Supplier')]") WebElement AddSupplier ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[1]/span[1]/a[1]/p[1]") WebElement BacktoMyGiftVoucherPage ;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Edit Voucher')]") WebElement EditVoucherPage ;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement AddType ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement TypeField ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Gift Card')]") WebElement GiftcardSelect ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement SupplierField ;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Zomato')]") WebElement SupplierSelect ;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Total Amount')]") WebElement AddTotalAmount ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]") WebElement TotalAmountField ;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Used Amount ( optional )')]") WebElement AddUsedAmount ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]") WebElement UsedAmountField ;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Expiry Date')]") WebElement AddExpiryDate ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]") WebElement ExpiryDateField ;
	@FindBy (how=How.XPATH, using="//p[contains(text(),'Reminder on')]") WebElement ReminderONStatus ;
	@FindBy (how=How.XPATH, using="//input[@id='custom-switch']") WebElement AddReminderOFF ;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Add Gift Card')]") WebElement AddGiftCardButton ;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Add Voucher')]") WebElement AddVoucherButton ;
	
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Update Voucher')]") WebElement UpdateVoucherButton ;
	
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Back to Family Dashboard')]") WebElement BacktoFamilyDashboard ;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/p[1]") WebElement FamilyDashboardPage ;
	
	
	//UI of Boxes
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[2]/small[1]") WebElement BoxType ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[3]/small[1]") WebElement BoxSupplier ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[4]/small[1]") WebElement BoxTotalAmount ;
	
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[5]/small[1]") WebElement BoxUsedAmount ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[6]/small[1]") WebElement BoxRemainingAmount ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[7]/small[1]") WebElement BoxExpiresON ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[8]/small[1]") WebElement BoxReminder ;
	@FindBy (how=How.XPATH, using="//*[@id='surface1']") WebElement BoxDOCUMENT ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[9]/span[1]/img[1]") WebElement BoxEdit ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[9]/span[1]/img[2]") WebElement BoxDelete ;
	                                                                                                                                           
	                                                                                                                                             
	                                                                                                                                             
	                                                                                                                                             
	                                                                                                                                             
	

	GiftcardVoucherTestCreation(WebDriver driver)
	 {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		
		 this.executor = (JavascriptExecutor) this.driver; 
	 }	

	public void TC001()
	{
		GiftcardVocher.isDisplayed();
	}
	
	public void TC002() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		MyGiftcardVocherpage.isDisplayed();
	}
	
	public void TC003() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		MyGiftcardVocherpage.isDisplayed();
		VoucherKPI.isDisplayed();
		GiftcardKPI.isDisplayed();
		TotalKPI.isDisplayed();
		searchfield.isDisplayed();
		filterby.isDisplayed();
		sortby.isDisplayed();
		
	}
	public void TC004() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(2000);
		
		
		
	}
	
	public void TC005() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(2000);
		AddNewGiftcard.click();
		Thread.sleep(2000);
		AddNewGiftVoucherPage.isDisplayed();
	
	}
	public void TC006() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		AddNewGiftcard.click();
		Thread.sleep(2000);
		AddNewGiftVoucherPage.isDisplayed();
		AddSupplier.isDisplayed();
		AddType.isDisplayed();
		AddTotalAmount.isDisplayed();
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		AddExpiryDate.isDisplayed();
		AddUsedAmount.isDisplayed();
		AddVoucherButton.isDisplayed();
		Thread.sleep(2000);
	}

	public void TC007() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		AddNewGiftcard.click();
		Thread.sleep(2000);
		SupplierField.click();
		Thread.sleep(1000);
		SupplierSelect.click();
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		TotalAmountField.sendKeys("255");
		ExpiryDateField.click();
		ExpiryDateField.sendKeys(Keys.ENTER);
		AddVoucherButton.click();
	
	}
	
	public void TC008() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		AddNewGiftcard.click();
		Thread.sleep(2000);
//		SupplierField.click();
//		Thread.sleep(1000);
//		SupplierSelect.click();
		executor.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
//		TotalAmountField.sendKeys("255");
//		ExpiryDateField.click();
//		ExpiryDateField.sendKeys(Keys.ENTER);
		AddVoucherButton.click();
	
	}
	
	public void TC009() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		AddNewGiftcard.click();
		Thread.sleep(2000);
		BacktoMyGiftVoucherPage.click();
	
	
	}
	public void TC010() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		GiftcardVocherdetails.click();
		Thread.sleep(2000);
		VocherdetailsPage.isDisplayed();
	}
	
	public void TC011() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		EditIcon.click();
		Thread.sleep(2000);
		EditVoucherPage.isDisplayed();
	}
	
	public void TC012() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		EditIcon.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		TotalAmountField.clear();
		TotalAmountField.sendKeys("300");
		UpdateVoucherButton.click();
		
	}
	public void TC013() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		DeleteIcon.click();
		Thread.sleep(1000);
		DeleteReminderPopUp.isDisplayed();
	
		
	}
	
	public void TC014() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		DeleteIcon.click();
		Thread.sleep(1000);
		DeleteReminderCancel.click();
		
		
	}
	public void TC015() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		DeleteIcon.click();
		Thread.sleep(1000);
		DeleteReminderYES.click();
	
	}
	
	
	
	
	public void TC016() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		
		searchfield.sendKeys("test");
		searchfield.sendKeys(Keys.ENTER);
	
	}
	public void TC017() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		
		searchfield.sendKeys("test");
		searchfield.sendKeys(Keys.ENTER);
		searchfield.clear();
	
	}
	
	
	
	public void TC018() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		filterbyclick.click();
		Thread.sleep(1000);
		filterActive.click();
	}
	public void TC019() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		sortbyclick.click();
		Thread.sleep(1000);
		SortCreated.click();
		
	}

	public void TC020() throws Exception
	{
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		BacktoFamilyDashboard.click();
		Thread.sleep(2000);
		FamilyDashboardPage.isDisplayed();
		
	}
	public void TC021() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		ReminderOFF.click();
		Thread.sleep(2000);
		CancelReminderPopUp.isDisplayed();
		
		
	}
	
	
	public void TC022() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		ReminderOFF.click();
		Thread.sleep(2000);
		CancelReminderYES.click();
		
		
	}

	public void TC023() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		ReminderOFF.click();
		Thread.sleep(2000);
		CancelReminderCANCEL.click();
		
		
	}
	
	
	public void TC024() throws Exception
	{
		
		Thread.sleep(2000);
		GiftcardVocher.click();
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		  BoxType.isDisplayed();
          BoxSupplier.isDisplayed();
          BoxTotalAmount.isDisplayed();
          BoxUsedAmount.isDisplayed();
          BoxRemainingAmount.isDisplayed();
          BoxExpiresON.isDisplayed();
          BoxReminder.isDisplayed();
          BoxEdit.isDisplayed();
          BoxDelete.isDisplayed();
		
		
	
	
	}
	

	
}
