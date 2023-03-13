package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FamilyCreation {
	
	WebDriver ldriver;
	
	public FamilyCreation(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	

	@FindBy (how=How.XPATH,using="//button[@id='dropdown-basic']" ) WebElement profiledrop;
	
	@FindBy (how=How.XPATH,using="//a[contains(text(),'Create New Family')]" ) WebElement Createfamilylink;
	
	@FindBy (how=How.XPATH,using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]/button[1]" ) WebElement ChooseFamilypack;
	@FindBy (how=How.XPATH,using="//input[@name='familyName']" ) WebElement Enterfamilyname;
	@FindBy (how=How.XPATH,using="//button[contains(text(),'Proceed to Payment')]" ) WebElement ProceedtoPayment;
	@FindBy (how=How.XPATH,using="//button[@class='button outline mediumbtn']" ) WebElement AddNewCardButton;
	
	@FindBy (how=How.XPATH,using="/html/body/div[4]/div/div/div[2]/form/div[1]/div/iframe" ) WebElement Cardframe;
	@FindBy (how=How.XPATH,using="//input[@name='cardnumber']" ) WebElement EnterCardNumber;
	@FindBy (how=How.XPATH,using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/input[2]" ) WebElement Address1;
	
	@FindBy (how=How.XPATH,using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]" ) WebElement Address2;
	@FindBy (how=How.XPATH,using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]" ) WebElement Address3;
	@FindBy (how=How.XPATH,using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]" ) WebElement Address4;
	@FindBy (how=How.XPATH,using="//button[contains(text(),'Proceed to Payment')]" ) WebElement Payment;
	
	
	
	
	
	
	
	
	public void NavigatetoCreateaccountPage() throws Exception
	{
		Thread.sleep(3000);
		profiledrop.click();
		Createfamilylink.click();
		
	}
	
	public void familyCreate() throws Exception
	{
		Thread.sleep(3000);
		ChooseFamilypack.click();
		Thread.sleep(1000);
		Enterfamilyname.sendKeys("TestFamily");
		Thread.sleep(2000);
		ProceedtoPayment.click();
		Thread.sleep(3000);
		AddNewCardButton.click();
		Thread.sleep(3000);
		ldriver.switchTo().frame(Cardframe);
		Thread.sleep(3000);
		EnterCardNumber.sendKeys("305693000902000445758478962");
		Thread.sleep(2000);
		ldriver.switchTo().defaultContent();
		Address1.sendKeys("ufwe");
		Thread.sleep(1000);
		Address2.sendKeys("hreg");
		Thread.sleep(1000);
		Address3.sendKeys("ufwe");
		Thread.sleep(1000);
		Address4.sendKeys("hreg");
		Thread.sleep(1000);
		Payment.click();
		
		
		
	}
	
	
	
	
	
	
}
