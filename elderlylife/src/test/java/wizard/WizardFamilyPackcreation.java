package wizard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WizardFamilyPackcreation {
	WebDriver driver;
	JavascriptExecutor executor;
	
	///Main Users tab Elements////
	
	@FindBy (how=How.XPATH, using="//b[contains(text(),'Let’s begin')]") WebElement LetsBegin;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Main users')]") WebElement MainUsersPage;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Have you purchased this for yourself?')]") WebElement HaveyouPurchasedForYou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]") WebElement YESHaveyouPurchasedForYou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[2]") WebElement NOHaveyouPurchasedForYou;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Next: Add Support Users')]") WebElement ManageSupportUserButton;
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Would you like to add another Main User?')]") WebElement WouldyouliketoaddanotherMainUser;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/button[1]") WebElement YESWouldyouliketoaddanotherMainUser;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/button[2]") WebElement NOWouldyouliketoaddanotherMainUser;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/form[1]/input[1]") WebElement PUemailField;
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
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Would you need another Support user to assist you?')]") WebElement WouldyouneedanotherSupportusertoassistyou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/button[1]") WebElement YESWouldyouneedanotherSupportusertoassistyou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/button[2]") WebElement NOWouldyouneedanotherSupportusertoassistyou;
	
	
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
	
	

	WizardFamilyPackcreation(WebDriver driver)
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
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		if(ManageSupportUserButton.isDisplayed())
		{
			String s1=ManageSupportUserButton.getText();
			System.out.println(s1);
		}
		
			if(WouldyouliketoaddanotherMainUser.isDisplayed())
			{
				String s2=WouldyouliketoaddanotherMainUser.getText();
				System.out.println(s2);
			}
	}
	
	
	
	public void test3() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
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
	
	
	public void test4() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
			if(WouldyouliketoaddanotherMainUser.isDisplayed())
			{
				String s1=WouldyouliketoaddanotherMainUser.getText();
				System.out.println(s1);
			}	
	}
	public void test5() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		
			if(ManageSupportUserButton.isDisplayed())
			{
				String s1=ManageSupportUserButton.getText();
				System.out.println(s1);
			}	
			
			
	}
	
	
	public void test6() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		if(SupportUsersPage.isDisplayed())
		{
			String s1=SupportUsersPage.getText();
			System.out.println(s1);
		}
		
		if(Willyouneedasupportusertoassistyou.isDisplayed())
		{
			String s2=Willyouneedasupportusertoassistyou.getText();
			System.out.println(s2);
		}	
	}
	public void test7() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		GotoPreviousStep.click();
		if(MainUsersPage.isDisplayed())
		{
			String s1=MainUsersPage.getText();
			System.out.println(s1);
		}
		
	}
	public void test8() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		if(SUemailField.isDisplayed())
		{
			String s1=SUemailField.getText();
			System.out.println(s1);
		}
		if(AddSupportUserButton.isDisplayed())
		{
			String s2=AddSupportUserButton.getText();
			System.out.println(s2);
		}
		
	}
	public void test9() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		if(WouldyouneedanotherSupportusertoassistyou.isDisplayed())
		{
			String s1=WouldyouneedanotherSupportusertoassistyou.getText();
			System.out.println(s1);
		}
	
		
	}
	public void test10() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		if(WouldyouliketobeaSupportuseRyourself.isDisplayed())
		{
			String s1=WouldyouliketobeaSupportuseRyourself.getText();
			System.out.println(s1);
		}
	
		
	}
	public void test11() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		NOWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}
	
	}
	public void test12() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		NOWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		if(SelecttheMainuserslistedbelowthatyouwould.isDisplayed())
		{
			String s1=SelecttheMainuserslistedbelowthatyouwould.getText();
			System.out.println(s1);
		}
	
	}
	
	public void test13() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail32@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemai55l@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail87@gmail.com");
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
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail32@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemai55l@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		NOWillyouneedasupportusertoassistyou.click();
		
		Thread.sleep(1000);
		if(WouldyouliketobeaSupportuseRyourself.isDisplayed())
		{
			String s1=WouldyouliketobeaSupportuseRyourself.getText();
			System.out.println(s1);
		}
		
		
	}
	public void test15() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail32@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemai55l@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		NOWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}
		
		
	}
	public void test16() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail32@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemai55l@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		
		if(SelecttheMainuserslistedbelowthatyouwould.isDisplayed())
		{
			String s1=SelecttheMainuserslistedbelowthatyouwould.getText();
			System.out.println(s1);
		}	
	}
	public void test17() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail32@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemai55l@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
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
	public void test18() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);		
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail32@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemai55l@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemai525l@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
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
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);		
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}
}
	public void test20() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);		
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail32@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemai55l@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}	
	}
	
	public void test21() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		if(WouldyouliketobeaSupportuseRyourself.isDisplayed())
		{
			String s1=WouldyouliketobeaSupportuseRyourself.getText();
			System.out.println(s1);
		}
	
	}
	public void test22() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		if(SelecttheMainuserslistedbelowthatyouwould.isDisplayed())
		{
			String s1=SelecttheMainuserslistedbelowthatyouwould.getText();
			System.out.println(s1);
		}
	
	}
	public void test23() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		NOWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}
	
	}
	public void test24() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin99123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testi7n123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin9123@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(2000);
		NOWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
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
	
	public void test25() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
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
	
	
	public void test26() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("ajhs@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		if(WouldyouliketoaddanotherMainUser.isDisplayed())
		{
			String s1=WouldyouliketoaddanotherMainUser.getText();
			System.out.println(s1);
		}
	}

	public void test27() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("ajhs@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		if(SupportUsersPage.isDisplayed())
		{
			String s1=SupportUsersPage.getText();
			System.out.println(s1);
		}
		if(WouldyouliketobeaSupportuseRyourself.isDisplayed())
		{
			String s1=WouldyouliketobeaSupportuseRyourself.getText();
			System.out.println(s1);
		}
	}

	public void test28() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("ajhs@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		if(ProceedFurtherButton.isDisplayed())
		{
			String s1=ProceedFurtherButton.getText();
			System.out.println(s1);
		}
	}
	public void test29() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("ajhs@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		if(SelecttheMainuserslistedbelowthatyouwould.isDisplayed())
		{
			String s1=SelecttheMainuserslistedbelowthatyouwould.getText();
			System.out.println(s1);
		}
	}
	public void test30() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("ajhs@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
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
	
	public void test31() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("ajhs@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
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
	
	public void test32() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		PUCheckbox.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(1000);
		Resettheselection.click();
		Thread.sleep(2000);
		if(Youreallset.isDisplayed())
		{
			String s1=Youreallset.getText();
			System.out.println(s1);
		}		
	}
	
	
	public void test33() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		PUCheckbox.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(1000);
		AddUsersandLaunchELPlatform.click();
		Thread.sleep(2000);
		
	}
	
	public void test34() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		YESHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWillyouneedasupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouneedanotherSupportusertoassistyou.click();
		Thread.sleep(1000);
		SUemailField.sendKeys("suemail12@gmail.com");
		Thread.sleep(1000);
		AddSupportUserButton.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(2000);
		AddUsersandLaunchELPlatform.click();
		Thread.sleep(2000);
		
	}
	public void test35() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("ajhs@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketobeaSupportuseRyourself.click();
		Thread.sleep(1000);
		PUCheckbox.click();
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(2000);
		AddUsersandLaunchELPlatform.click();
		Thread.sleep(2000);
	}
	public void test36() throws Exception
	{
		Thread.sleep(4000);	
		LetsBegin.click();
		Thread.sleep(3000);
		NOHaveyouPurchasedForYou.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("ajhs@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		YESWouldyouliketoaddanotherMainUser.click();
		Thread.sleep(1000);
		PUemailField.sendKeys("testin1523@gmail.com");
		Thread.sleep(1000);
		AddMainUserButton.click();
		Thread.sleep(1000);
		ManageSupportUserButton.click();
		Thread.sleep(1000);
		NOWouldyouliketobeaSupportuseRyourself.click();	
		Thread.sleep(1000);
		ProceedFurtherButton.click();
		Thread.sleep(2000);
		AddUsersandLaunchELPlatform.click();
		Thread.sleep(2000);
	}
}