package wizard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WizardSingleFamilyCreation {
	WebDriver driver;
	JavascriptExecutor executor;
	
	///Main Users tab Elements////
	
	@FindBy (how=How.XPATH, using="//b[contains(text(),'Let’s begin')]") WebElement LetsBegin;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Main users')]") WebElement MainUsersPage;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Have you purchased this for yourself?')]") WebElement HaveyouPurchasedForYou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]") WebElement YESHaveyouPurchasedForYou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[2]") WebElement NOHaveyouPurchasedForYou;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Next: Add Support Users')]") WebElement ManageSupportUserButton;
	@FindBy (how=How.XPATH, using="//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[3]/div/div[3]/form/div/input") WebElement PUemailField;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Add Main user')]") WebElement AddMainUserButton;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/img[1]") WebElement RemovePUButton;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Skip this step')]") WebElement SkipThisStepLink;
	
	
	///Support Users tab Elements////
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Support users')]") WebElement SupportUsersPage;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Go to previous step')]") WebElement GotoPreviousStep;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Will you need a support user to assist you?')]") WebElement Willyouneedasupportusertoassistyou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]") WebElement YESWillyouneedasupportusertoassistyou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/button[2]") WebElement NOWillyouneedasupportusertoassistyou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/form[1]/input[1]") WebElement SUemailField;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Add Support User')]") WebElement AddSupportUserButton;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/img[1]") WebElement RemoveSUButton;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Proceed further')]") WebElement ProceedFurtherButton;
	
	
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Would you like to be a Support user yourself?')]") WebElement WouldyouliketobeaSupportuseRyourself;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]") WebElement YESWouldyouliketobeaSupportuseRyourself;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/button[2]") WebElement NOWouldyouliketobeaSupportuseRyourself;
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Select the Main users listed below that you would ')]") WebElement SelecttheMainuserslistedbelowthatyouwould;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]") WebElement PULIST;
	@FindBy (how=How.XPATH, using="//input[@id='keyValue']") WebElement PUCheckbox;
	
	///OnboardUsers////
	@FindBy (how=How.XPATH, using="//h3[contains(text(),\"You're all set !!!\")]") WebElement Youreallset;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Add Users and Launch Platform')]") WebElement AddUsersandLaunchELPlatform;	
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Reset the selection')]") WebElement Resettheselection;
	
	

	WizardSingleFamilyCreation(WebDriver driver)
	 {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
		 this.executor = (JavascriptExecutor) this.driver;
	 }
	
	
	
	
	public void test1() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		if(MainUsersPage.isDisplayed())
		{
			String s1=MainUsersPage.getText();
			System.out.println(s1);
		}
	}
	
	public void test2() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		if(ManageSupportUserButton.isDisplayed())
		{
			String s1=ManageSupportUserButton.getText();
			System.out.println(s1);
		}
		
	}
	public void test3() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		if(GotoPreviousStep.isDisplayed())
		{
			String s1=GotoPreviousStep.getText();
			System.out.println(s1);
		}
		if(Willyouneedasupportusertoassistyou.isDisplayed())
		{
			String s1=Willyouneedasupportusertoassistyou.getText();
			System.out.println(s1);
		}
		
	}
	public void test4() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		GotoPreviousStep.click();
		Thread.sleep(1000);
		if(MainUsersPage.isDisplayed())
		{
			String s1=MainUsersPage.getText();
			System.out.println(s1);
		}
			
	}
	
	
	public void test5() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		if(PUemailField.isDisplayed())
		{
			String s1=PUemailField.getText();
			System.out.println(s1);
		}
		
		if(AddMainUserButton.isDisplayed())
		{
			String s2=AddMainUserButton.getText();
			System.out.println(s2);
		}
	}
	
	public void test6() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		if(ManageSupportUserButton.isDisplayed())
		{
			String s1=ManageSupportUserButton.getText();
			System.out.println(s1);
		}	
	}
	
	public void test7() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(2000);
		
		 executor.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(4000);
		ManageSupportUserButton.click();
		Thread.sleep(3000);	
		if(SupportUsersPage.isDisplayed())
		{
			String s1=SupportUsersPage.getText();
			System.out.println(s1);
		}	
		
		if(WouldyouliketobeaSupportuseRyourself.isDisplayed())
		{
			String s2=WouldyouliketobeaSupportuseRyourself.getText();
			System.out.println(s2);
		}	
	}
	public void test8() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(2000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(2000);
		AddMainUserButton.click();
		Thread.sleep(2000);
		RemovePUButton.click();
		Thread.sleep(3000);
		if(PUemailField.isDisplayed())
		{
			String s2=PUemailField.getText();
			System.out.println(s2);
		}
		if(AddMainUserButton.isDisplayed())
		{
			String s1=AddMainUserButton.getText();
			System.out.println(s1);
		}			
	}
	public void test10() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		Thread.sleep(4000);	
		SkipThisStepLink.click();
	}
	public void test11() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
	 executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(4000);	
		SkipThisStepLink.click();
	}
	public void test12() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		if(SUemailField.isDisplayed())
		{
			String s2=SUemailField.getText();
			System.out.println(s2);
		}
		if(AddSupportUserButton.isDisplayed())
		{
			String s1=AddSupportUserButton.getText();
			System.out.println(s1);
		}	
		
	}
	
	public void test13() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.click();
		SUemailField.sendKeys("test2@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
	
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}		
	}
	
	public void test14() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
	
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}		
	}
	public void test15() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.click();
		SUemailField.sendKeys("test2@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		RemoveSUButton.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.isEnabled();
	  
			
	}
	
	public void test16() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
	
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);	
		NOWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}	
	}
	public void test17() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);	
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		if(SelecttheMainuserslistedbelowthatyouwould.isDisplayed())
		{
			String s1=SelecttheMainuserslistedbelowthatyouwould.getText();
			System.out.println(s1);
		}	
	}
	public void test18() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);	
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		PUCheckbox.click();
		Thread.sleep(1000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}	
	}
	public void test19() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);	
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		PUCheckbox.click();
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}	
		Thread.sleep(1000);
		PUCheckbox.click();
		
	
		
	}
	public void test20() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);	
		executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		PUCheckbox.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(1000);
		if(Youreallset.isDisplayed())
		{
			String s1=Youreallset.getText();
			System.out.println(s1);
		}	
		
	}
	public void test21() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);	
		NOWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(1000);
		if(Youreallset.isDisplayed())
		{
			String s1=Youreallset.getText();
			System.out.println(s1);
		}	
		
	}
	
	public void test22() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.click();
		SUemailField.sendKeys("test2@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		ProceedFurtherButton.click();
		if(Youreallset.isDisplayed())
		{
			String s1=Youreallset.getText();
			System.out.println(s1);
		}	
	
	}
	public void test23() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		if(Youreallset.isDisplayed())
		{
			String s1=Youreallset.getText();
			System.out.println(s1);
		}	
	
	}
	public void test24() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(2000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);	
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		PUCheckbox.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(1000);		
		Resettheselection.click();
		Thread.sleep(1000);
		if(MainUsersPage.isDisplayed())
		{
			String s1=MainUsersPage.getText();
			System.out.println(s1);
		}	
	}
	
	public void test26() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);	
		NOWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(1000);		
		AddUsersandLaunchELPlatform.click();
		Thread.sleep(1000);
			
	}
	
	
	public void test25() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(2000);
		PUemailField.sendKeys("test@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
			 Thread.sleep(2000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);	
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		PUCheckbox.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(1000);		
		AddUsersandLaunchELPlatform.click();
		Thread.sleep(1000);
			
	}
	public void test27() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.click();
		SUemailField.sendKeys("test2@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(2000);
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(1000);		
		AddUsersandLaunchELPlatform.click();
		Thread.sleep(1000);
	
	}
	public void test28() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(2000);	
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(1000);		
		AddUsersandLaunchELPlatform.click();
		Thread.sleep(1000);
			
	
	}
//	@BeforeMethod
//	public void setup() throws Exception {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\elderlylife\\chromedriver\\chromedriver.exe");
//		driver=new ChromeDriver();
//			
//		driver.get("https://dev-app.elderlylife.co.uk/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		driver.findElement(By.name("email")).sendKeys("nanijeevangoud686@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("12345678");	
//		Thread.sleep(1000);		
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(2000);	
//		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
//		Thread.sleep(2000);	
//		driver.findElement(By.xpath("//a[contains(text(),'Create New Family')]")).click();
//		Thread.sleep(2000);	
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[3]/button[1]")).click();
//		Thread.sleep(2000);	
//		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("SingleWizard");
//		Thread.sleep(2000);	
//		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
//		Thread.sleep(3000);	
//		driver.findElement(By.xpath("//p[contains(text(),'Jeevan Goud')]")).click();
//		Thread.sleep(2000);	
//		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
//		Thread.sleep(2000);	
//	
//	}
	
//	public void verifyPageURL() throws Exception
//	{
//		Thread.sleep(3000);	
//	String actulURL=	driver.getCurrentUrl();
//	String ExpectedURL="https://dev-app.elderlylife.co.uk/confirmation";
//	Assert.assertEquals(actulURL, ExpectedURL);			
//	}
	
//public void FunctionalityOfLetsBeginButton() throws Exception
//{
//		Thread.sleep(4000);	
//
//	driver.findElement(By.xpath("//b[contains(text(),'Let’s begin')]")).click();
//	WebElement e1=driver.findElement(By.xpath("//div[contains(text(),'Main users')]"));
//	if(e1.isDisplayed())
//	{
//		String s1=e1.getText();
//		System.out.println(s1);
//	}	
//}
//
//public void singlecase1() throws Exception
//{
//	Thread.sleep(4000);	
//	driver.findElement(By.xpath("//b[contains(text(),'Let’s begin')]")).click();
//	Thread.sleep(2000);	
//	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]")).click();
//	WebElement e2=driver.findElement(By.xpath("//button[contains(text(),'Manage Support users')]"));
//	if(e2.isDisplayed())
//	{
//		System.out.println("singlecase1 passed");
//	}
//
//}
//
//public void singlecase2() throws Exception
//{
//	Thread.sleep(4000);	
//	driver.findElement(By.xpath("//b[contains(text(),'Let’s begin')]")).click();
//	Thread.sleep(2000);	
//	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]")).click();
//	Thread.sleep(2000);	
//	driver.findElement(By.xpath("//button[contains(text(),'Manage Support users')]")).click();
//	WebElement e2=driver.findElement(By.xpath("//div[contains(text(),'Support users')]"));
//	if(e2.isDisplayed())
//	{
//		
//		System.out.println("singlecase2 passed");
//	}
//	WebElement e3=driver.findElement(By.xpath("//div[contains(text(),'Go to previous step')]"));
//	if(e3.isDisplayed())
//	{
//		String s3=e3.getText();
//		System.out.println(s3);
//	
//	}
//	WebElement e4=driver.findElement(By.xpath("//div[contains(text(),'Will you need a support user to assist you?')]"));
//	if(e4.isDisplayed())
//	{
//		String s4=e4.getText();
//		System.out.println(s4);
//	
//	}
//}
//
//
//
//public void singlecase3() throws Exception
//{
//	Thread.sleep(4000);	
//	driver.findElement(By.xpath("//b[contains(text(),'Let’s begin')]")).click();
//	Thread.sleep(2000);	
//	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]")).click();
//	Thread.sleep(2000);	
//	driver.findElement(By.xpath("//button[contains(text(),'Manage Support users')]")).click();
//	Thread.sleep(2000);	
//	driver.findElement(By.xpath("//div[contains(text(),'Go to previous step')]")).click();
//	Thread.sleep(2000);	
//	WebElement e4=driver.findElement(By.xpath("//div[contains(text(),'Main users')]"));
//	if(e4.isDisplayed())
//	{
//		String s4=e4.getText();
//		System.out.println("Page navigated to "+s4+" tab");
//	
//	}
//	
//	WebElement e5=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
//	WebElement e6=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[2]"));
//	WebElement e7=driver.findElement(By.xpath("//div[contains(text(),'Have you purchased this for you?')]"));
//	WebElement e8=driver.findElement(By.xpath("//button[contains(text(),'Manage Support users')]"));
//	Assert.assertFalse(e5.isEnabled());
//	Assert.assertTrue(e6.isEnabled());
//	Assert.assertTrue(e7.isDisplayed());
//	Assert.assertTrue(e8.isDisplayed());
//	
//	
//}
	
	

}
