package eLWarranties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Warranties {
	WebDriver driver;
	JavascriptExecutor executor;
	

	@FindBy (how=How.XPATH, using="//h3[contains(text(),'My Warranties')]") WebElement mywarranties ;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'+ Add New Warranty')]") WebElement AddNewWarranty;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'In Warranty')]") WebElement InWarranty;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]") WebElement OutofWarranty;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]") WebElement Total;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/small[1]") WebElement ProductType;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/small[1]") WebElement supplier;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/small[1]") WebElement frequency;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/small[1]") WebElement price;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/small[1]") WebElement expires;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/small[1]") WebElement warrantystatus;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/small[1]") WebElement reminder;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/span[1]/img[1]") WebElement editicon;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/span[1]/img[2]") WebElement deleteicon;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]") WebElement warrantysearch;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Filter by :')]") WebElement Warrantyfilter;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]") WebElement WarrantyfilterSelect;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/button[1]/img[1]") WebElement searchclose;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Filter by values:')]") WebElement filtervalues;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]") WebElement filtervaluesselect;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]") WebElement openwarranty;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/p[1]/label[1]/div[1]") WebElement reminderON;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/p[1]/label[1]/div[1]") WebElement reminderOFF;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Delete Warranty')]") WebElement Deletewarraantypopup;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Cancel')]") WebElement DeleteCancel;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Yes')]") WebElement DeleteYES;
	@FindBy (how=How.XPATH, using="//button[@class='btn-close']") WebElement DeleteClose;
	
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Cancel Reminder')]") WebElement ReminderCancelPopUp;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Cancel')]") WebElement ReminderCancelbutton;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Yes')]") WebElement ReminderCancelYES;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/button[1]") WebElement ReminderCancelClose;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Add a New Warranty')]") WebElement AddNewWarrantyPage;
	@FindBy (how=How.XPATH, using="//h4[contains(text(),'Warranty details')]") WebElement WarrantyDetailsPage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Edit Warranty')]") WebElement EditWarrantyPage;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Expiration time')]") WebElement selectfilter1;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Warranty status')]") WebElement selectfilter2;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'In Warranty')]") WebElement selectfiltervalue1;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Out of Warranty')]") WebElement selectfiltervalue2;
	
	
	
	
	//Create Warranty Page
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Category')]") WebElement category;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Product Type')]") WebElement productType;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Supplier')]") WebElement supplierincreateWarranty;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Additional Details ( Optional )')]") WebElement additionalDetails;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Price of the product')]") WebElement priceoftheroduct;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Purchase Date')]") WebElement purchasedate;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Warranty End Date')]") WebElement endDate;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Item Code ( Optional )')]") WebElement ItemCode;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Serial Number ( Optional )')]") WebElement serialNumber;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/label[1]") WebElement InvoiceDocument;

	

	
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement Fcategory;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Electronics')]") WebElement Fcategoryselect;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Online_Delivery')]") WebElement Fcategoryselect2;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement FproductType;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Laptops')]") WebElement FproductTypeSelect;
@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement FsupplierincreateWarranty;
@FindBy (how=How.XPATH, using="//div[contains(text(),'Lenovo')]") WebElement FsupplierincreateWarrantySelect;
@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/textarea[1]") WebElement FadditionalDetails;
	@FindBy (how=How.XPATH, using="//input[@id='formBasicEmail']") WebElement Fpriceoftheroduct;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]") WebElement Fpurchasedate;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement FendDate;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'6 months')]") WebElement FendDateSelect;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/input[1]") WebElement FItemCode;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[3]/div[2]/div[1]/input[1]") WebElement FserialNumber;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/label[1]") WebElement FInvoiceDocument;
	@FindBy (how=How.XPATH, using="//input[@id='custom-switch']") WebElement FReminderON;
	@FindBy (how=How.XPATH, using="//button[@class='button primary mediumbtn']") WebElement AddWarrantyButton;

	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[1]/span[1]/p[1]/a[1]") WebElement BacktoMyWarrantiesPage;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Select a specific category that is applicable to t')]") WebElement CreateWarrantError1;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Select a specific product type that is applicable ')]") WebElement CreateWarrantError2;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Select the supplier of the warranty. Select others')]") WebElement CreateWarrantError3;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Enter the price value for which you have purchased')]") WebElement CreateWarrantError4;

	
	Warranties(WebDriver driver)
	 {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
		 this.executor = (JavascriptExecutor) this.driver; 
	 }	
	public void test24() throws Exception
	{
		Thread.sleep(2000);
		editicon.click();
		Thread.sleep(3000);
		EditWarrantyPage.isDisplayed();
	}
	
	public void test25() throws Exception
	{
		Thread.sleep(2000);
		editicon.click();
		Thread.sleep(3000);
		EditWarrantyPage.isDisplayed();
		 Thread.sleep(3000);
			category.isDisplayed();
			productType.isDisplayed();
			supplierincreateWarranty.isDisplayed();
			additionalDetails.isDisplayed();
			 executor.executeScript("window.scrollBy(0,800)");
			 Thread.sleep(2000);
			priceoftheroduct.isDisplayed();
			purchasedate.isDisplayed();
			endDate.isDisplayed();
			serialNumber.isDisplayed();
			InvoiceDocument.isDisplayed();
			FReminderON.isDisplayed();
			AddWarrantyButton.isDisplayed();	
			Thread.sleep(2000);
		
		
	}
	
	public void test26() throws Exception
	{
		Thread.sleep(2000);
		editicon.click();
		Thread.sleep(3000);	
		Fcategory.click();
		Thread.sleep(1000);
		Fcategoryselect.click();
		Thread.sleep(3000);
		FproductType.click();
		Thread.sleep(1000);
		FproductTypeSelect.click();
		Thread.sleep(1000);
		FsupplierincreateWarranty.click();
		Thread.sleep(1000);
		FsupplierincreateWarrantySelect.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,100)");
		 Thread.sleep(1000);
		FadditionalDetails.sendKeys("Warranty Testing");
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,300)");
		 Fpriceoftheroduct.clear();
		 Thread.sleep(1000);
		Fpriceoftheroduct.sendKeys("2200");
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		Fpurchasedate.click();
		Thread.sleep(1000);
		
		Fpurchasedate.sendKeys(Keys.ENTER);
		FItemCode.clear();
		Thread.sleep(1000);
		FItemCode.sendKeys("1234755");
		Thread.sleep(1000);
		FendDate.click();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,300)");
		FendDateSelect.click();
		Thread.sleep(1000);
		FserialNumber.clear();
		Thread.sleep(1000);
		FserialNumber.sendKeys("5477321");
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,300)");
		 Thread.sleep(1000);
		AddWarrantyButton.click();
		Thread.sleep(4000);
		mywarranties.isDisplayed();
		Thread.sleep(1000);
		
		
	}
	
	
	public void test27() throws Exception
	{
		Thread.sleep(2000);
		editicon.click();
		Thread.sleep(3000);	
		Fcategory.click();
		 Thread.sleep(1000);
		Fcategoryselect2.click();
		Thread.sleep(3000);
		 executor.executeScript("window.scrollBy(0,900)");
		 Thread.sleep(1000);
		AddWarrantyButton.click();
		Thread.sleep(4000);
		 executor.executeScript("window.scrollBy(0,-300)");
		 
		 Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,-400)");
		 Thread.sleep(2000);
		 CreateWarrantError1.isDisplayed();
		 CreateWarrantError2.isDisplayed();
	}
	public void test19() throws Exception
	{
		Thread.sleep(2000);
		AddNewWarranty.click();
		Thread.sleep(3000);
		category.isDisplayed();
		productType.isDisplayed();
		supplierincreateWarranty.isDisplayed();
		additionalDetails.isDisplayed();
		 executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		priceoftheroduct.isDisplayed();
		purchasedate.isDisplayed();
		endDate.isDisplayed();
		serialNumber.isDisplayed();
		InvoiceDocument.isDisplayed();
		FReminderON.isDisplayed();
		AddWarrantyButton.isDisplayed();		
	}
	public void test20() throws Exception
	{
		Thread.sleep(2000);
	    AddNewWarranty.click();
		Thread.sleep(2000);
		Fcategory.click();
		Thread.sleep(1000);
		Fcategoryselect.click();
		Thread.sleep(3000);
		FproductType.click();
		Thread.sleep(1000);
		FproductTypeSelect.click();
		Thread.sleep(1000);
		FsupplierincreateWarranty.click();
		Thread.sleep(1000);
		FsupplierincreateWarrantySelect.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,100)");
		 Thread.sleep(1000);
		FadditionalDetails.sendKeys("Warranty Testing");
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,300)");
		Fpriceoftheroduct.sendKeys("100");
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		Fpurchasedate.click();
		Thread.sleep(1000);
		
		Fpurchasedate.sendKeys(Keys.ENTER);
		FItemCode.sendKeys("12345");
		Thread.sleep(1000);
		FendDate.click();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,300)");
		FendDateSelect.click();
		Thread.sleep(1000);
		FserialNumber.sendKeys("54321");
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,300)");
		 Thread.sleep(1000);
		AddWarrantyButton.click();
		Thread.sleep(4000);
		mywarranties.isDisplayed();
		Thread.sleep(1000);
	}
	
	
	public void test21() throws Exception
	{
		Thread.sleep(2000);
	    AddNewWarranty.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		AddWarrantyButton.click();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,-300)");
		CreateWarrantError1.isDisplayed();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,-400)");
		CreateWarrantError2.isDisplayed();
		CreateWarrantError3.isDisplayed();
		CreateWarrantError4.isDisplayed();
		Thread.sleep(1000);
	
	}
	
	public void test22() throws Exception
	{
		
		Thread.sleep(2000);
	    AddNewWarranty.click();
		Thread.sleep(2000);
		Fcategory.click();
		Thread.sleep(1000);
		Fcategoryselect.click();
		Thread.sleep(3000);
		FproductType.click();
		Thread.sleep(1000);
		FproductTypeSelect.click();
		Thread.sleep(1000);
		FsupplierincreateWarranty.click();
		Thread.sleep(1000);
		FsupplierincreateWarrantySelect.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);		
		FadditionalDetails.sendKeys("Warranty Testing");
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,200)");
		Fpriceoftheroduct.sendKeys("100");
		Thread.sleep(2000);
		 executor.executeScript("window.scrollBy(0,100)");
		Fpurchasedate.click();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,300)");
		Fpurchasedate.sendKeys(Keys.ENTER);
		FItemCode.sendKeys("12345");
		Thread.sleep(1000);
		FendDate.click();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,300)");
		FendDateSelect.click();
		Thread.sleep(1000);
		FserialNumber.sendKeys("54321");
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,300)");
			Thread.sleep(1000);
		FReminderON.click();
		Thread.sleep(1000);
		AddWarrantyButton.click();
		Thread.sleep(4000);
		mywarranties.isDisplayed();
		Thread.sleep(1000);
		
	}

	public void test23() throws Exception
	{
		Thread.sleep(2000);
	    AddNewWarranty.click();
		Thread.sleep(3000);
		BacktoMyWarrantiesPage.click();
		Thread.sleep(3000);
		mywarranties.isDisplayed();
		
	}
	
	
	
	
	
	
	
	
	
	
	public void test2() throws Exception
	{
		
		Thread.sleep(2000);
		 mywarranties.isDisplayed();
		AddNewWarranty.isDisplayed();
		InWarranty.isDisplayed();
		OutofWarranty.isDisplayed();
		Total.isDisplayed();
		ProductType.isDisplayed();
		supplier.isDisplayed();
		frequency.isDisplayed();
		price.isDisplayed();
		expires.isDisplayed();
		warrantystatus.isDisplayed();
		reminder.isDisplayed();
		editicon.isDisplayed();
		deleteicon.isDisplayed();
		warrantysearch.isDisplayed();
		Warrantyfilter.isDisplayed();
		
	}
	
	
	public void test3() throws Exception
	{
		Thread.sleep(2000);
		AddNewWarranty.click();
		Thread.sleep(2000);
		if(AddNewWarrantyPage.isDisplayed()) 
		{
			String s1=AddNewWarrantyPage.getText();
			System.out.println(s1);
		}
		
	}
	
	
	
	public void test4() throws Exception
	{
		Thread.sleep(2000);
		
		openwarranty.click();
		Thread.sleep(2000);
		if(WarrantyDetailsPage.isDisplayed()) 
		{
			String s1=WarrantyDetailsPage.getText();
			System.out.println(s1);
		}
		
	}
	
	
	public void test5() throws Exception
	{
		Thread.sleep(2000);
		
		reminderOFF.click();
		Thread.sleep(2000);
		if(ReminderCancelPopUp.isDisplayed()) 
		{
			String s1=ReminderCancelPopUp.getText();
			System.out.println(s1);
		}
		
	}
	
	public void test6() throws Exception
	{
		Thread.sleep(2000);
		
		reminderOFF.click();
		Thread.sleep(2000);
		ReminderCancelbutton.click();
		Thread.sleep(2000);
		mywarranties.isDisplayed();
		
	}
	
	public void test7() throws Exception
	{
		Thread.sleep(2000);
		
		reminderOFF.click();
		Thread.sleep(2000);
		ReminderCancelYES.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		mywarranties.isDisplayed();
	}
	
	
	public void test8() throws Exception
	{
		Thread.sleep(2000);
		
		reminderON.click();
		Thread.sleep(2000);
		
		
	}
	
	
	public void test9() throws Exception
	{
		Thread.sleep(2000);
		
		editicon.click();
		Thread.sleep(2000);
		if(EditWarrantyPage.isDisplayed()) 
		{
			String s1=EditWarrantyPage.getText();
			System.out.println(s1);
		}
		
	}
	public void test10() throws Exception
	{
		Thread.sleep(2000);
		
		deleteicon.click();
		Thread.sleep(2000);
		if(Deletewarraantypopup.isDisplayed()) 
		{
			String s1=Deletewarraantypopup.getText();
			System.out.println(s1);
		}
		
	}
	
	public void test11() throws Exception
	{
		Thread.sleep(2000);
		
		deleteicon.click();
		Thread.sleep(2000);
		DeleteCancel.click();
		if(mywarranties.isDisplayed()) 
		{
			String s1=mywarranties.getText();
			System.out.println(s1);
		}
		
	}
	
	public void test12() throws Exception
	{
		Thread.sleep(2000);
		
		deleteicon.click();
		Thread.sleep(2000);
		DeleteYES.click();
		if(mywarranties.isDisplayed()) 
		{
			String s1=mywarranties.getText();
			System.out.println(s1);
		}
		
	}
	
	public void test13() throws Exception
	{
		Thread.sleep(2000);
		
		deleteicon.click();
		Thread.sleep(3000);
		DeleteClose.click();
		if(mywarranties.isDisplayed()) 
		{
			String s1=mywarranties.getText();
			System.out.println(s1);
		}
		
	}
		
	public void test15() throws Exception
	{
		Thread.sleep(2000);
		warrantysearch.sendKeys("land");
		Thread.sleep(1000);
		warrantysearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	
	public void test16() throws Exception
	{
		Thread.sleep(2000);
		warrantysearch.sendKeys("land");
		Thread.sleep(1000);
		warrantysearch.sendKeys(Keys.ENTER);
		searchclose.click();
		Thread.sleep(2000);
	}
	
	public void test17() throws Exception
	{
		Thread.sleep(2000);
		WarrantyfilterSelect.click();
		Thread.sleep(2000);
		selectfilter1.click();
		
	}
	

	public void test18() throws Exception
	{
		Thread.sleep(2000);
		WarrantyfilterSelect.click();
		Thread.sleep(2000);
		selectfilter1.click();
		Thread.sleep(2000);
		selectfiltervalue1.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@BeforeMethod
//	public void setup() throws Exception {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Documents\\Bandicam\\driver\\chromedriver.exe");
//		driver=new ChromeDriver();
//			
//		driver.get("https://dev-app.elderlylife.co.uk/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Thread.sleep(3000);
//		driver.findElement(By.name("email")).sendKeys("gleecustest1@gmail.com");	
//		driver.findElement(By.name("password")).sendKeys("12345678");		
//		Thread.sleep(3000);	
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
//	    Thread.sleep(2000);	
//	}
//	
//	public void FunctionalityofWarrantyCTA() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//b[contains(text(),'Warranties')]")).click();
//		Thread.sleep(2000);
//		WebElement e1=driver.findElement(By.xpath("//h3[contains(text(),'My Warranties')]"));
//		Assert.assertTrue(e1.isDisplayed());
//	}
//
//	public void FunctionalityofAddNewWarrantybutton() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//b[contains(text(),'Warranties')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'+ Add New Warranty')]")).click();
//		Thread.sleep(2000);
//		WebElement e1=driver.findElement(By.xpath("//h3[contains(text(),'Add a New Warranty')]"));
//		Assert.assertTrue(e1.isDisplayed());
//		
//		
//	}
//	
//	public void FunctionalityofWarrantyViewDetails() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//b[contains(text(),'Warranties')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]")).click();
//		Thread.sleep(2000);
//	
//	}
//	
//	public void VerifyMyWarrantiesPagr() throws Exception
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//b[contains(text(),'Warranties')]")).click();
//		Thread.sleep(2000);
//		WebElement inwarranty=driver.findElement(By.xpath("//div[contains(text(),'In Warranty')]"));
//		WebElement outwarranty=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]"));
//		WebElement total=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement addnewwarrantyCTA=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement producttype=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement supplier=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement frequency=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement price=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement expiry=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement warrantystatus=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement reminder=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement editicon=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement deleteicon=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement searchfield=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		WebElement filter=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]"));
//		
//		
//	}
	
}
