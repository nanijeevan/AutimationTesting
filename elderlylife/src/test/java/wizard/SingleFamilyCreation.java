package wizard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class SingleFamilyCreation {
	
	
	WebDriver driver;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[3]/button[1]") WebElement chooseplan;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'New Family')]") WebElement NewFamilyPopup;
	@FindBy (how=How.XPATH, using="/html/body/div[4]/div/div/div[2]/form/div[1]/input") WebElement EnterFamilyname;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/p[2]/a[1]") WebElement Chooseanotherplan;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Proceed to Payment')]") WebElement proceedtopaymentbutton;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/button[1]") WebElement NewFamilycloseIcon;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Elderly Life Account Plans')]") WebElement ELPlanAccounts;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Choose a payment method')]") WebElement Choosepaymentmethodpopup;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/input[1]") WebElement ChooseExistingCard;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Proceed to Payment')]") WebElement proceedtopaymentbuttoninpaymethod;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/button[1]") WebElement ChoosepaymentmethodcloseIcon;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/button[1]") WebElement Confirmationpage;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/button[1]") WebElement LetsbeginButton;	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Main users')]") WebElement MainUserstab;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Skip this step')]") WebElement skipthisstep;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/button[1]") WebElement HaveyoupurchasedthisforyouYES;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/button[2]") WebElement HaveyoupurchasedthisforyouNO;
	
	
	
	
	
	
	SingleFamilyCreation(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	public void test1() throws Exception
	{
		chooseplan.click();
		Thread.sleep(2000);
		
		if(NewFamilyPopup.isDisplayed())
		{
			String s1=NewFamilyPopup.getText();
			System.out.println(s1);
		}
	}
	
	
	public void test2() throws Exception
	{
		chooseplan.click();
		Thread.sleep(2000);
		EnterFamilyname.sendKeys("Test Automation");
		proceedtopaymentbutton.click();
		Thread.sleep(2000);
		if(Choosepaymentmethodpopup.isDisplayed())
		{
			String s3=Choosepaymentmethodpopup.getText();
			System.out.println(s3);
		}
		
	}
	
	public void test3() throws Exception
	{
		chooseplan.click();
		Thread.sleep(2000);
		NewFamilycloseIcon.click();
		Thread.sleep(2000);
		if(ELPlanAccounts.isDisplayed())
		{
			String s2=ELPlanAccounts.getText();
			System.out.println(s2);
		}
		
	}
	
	public void test4() throws Exception
	{
		chooseplan.click();
		Thread.sleep(2000);
		Chooseanotherplan.click();
		Thread.sleep(2000);
		if(ELPlanAccounts.isDisplayed())
		{
			String s2=ELPlanAccounts.getText();
			System.out.println(s2);
		}
		
	}
	
	public void test5() throws Exception
	{
		chooseplan.click();
		Thread.sleep(2000);
		EnterFamilyname.sendKeys("Test Automation");
		Thread.sleep(2000);
		proceedtopaymentbutton.click();
		Thread.sleep(2000);
		ChoosepaymentmethodcloseIcon.click();
		Thread.sleep(2000);
		
	}
	
	public void test6() throws Exception
	{
		chooseplan.click();
		Thread.sleep(2000);
		EnterFamilyname.sendKeys("Test Automation");
		Thread.sleep(2000);
		proceedtopaymentbutton.click();
		Thread.sleep(2000);
		ChooseExistingCard.click();
		Thread.sleep(2000);
		proceedtopaymentbuttoninpaymethod.click();
		Thread.sleep(2000);
		if(Confirmationpage.isDisplayed())
		{
			String s4=Confirmationpage.getText();
			System.out.println(s4);
		}
		
	}
	
	
	
	
	
	
	
	
}
