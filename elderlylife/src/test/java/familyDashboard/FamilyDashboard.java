package familyDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;





//AU+PU
public class FamilyDashboard {
WebDriver driver;

	
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Outgoings')]") WebElement outgoing;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Warranties')]") WebElement warranties;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Benefits')]") WebElement benefits;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Compare & Save')]") WebElement Compare;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Vouchers & Gift cards')]") WebElement Gifts;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'ToDos')]") WebElement todos;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Change Family Name')]") WebElement Changefamilyname;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Manage Account Plan')]") WebElement manageaccountplan;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[3]/p[1]/a[1]") WebElement viewallNotifications;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Reminder Settings')]") WebElement Remindersettings;
	@FindBy (how=How.XPATH, using="//button[@class='button-CopyToClipboard1']") WebElement copyFamilyID;
	
	
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'My Outgoings')]") WebElement myoutgoingspage ;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'My Warranties')]") WebElement mywarrantiespage ;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'My Benefits')]") WebElement mybenefitspage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Compare and Save')]") WebElement compareandsavepage ;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'My Vouchers & Gift Cards')]") WebElement Giftspage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'My ToDos')]") WebElement todospage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Update Family Name')]") WebElement updatefamilymodalpage;
	@FindBy (how=How.XPATH, using="//p[contains(text(),'Manage Subscription')]") WebElement managesubscriptonpage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Notifications')]") WebElement notificationspage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Reminder Settings')]") WebElement remindersettings;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Family Id Copied')]") WebElement familyidcopied;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/p[1]/a[1]") WebElement PUSeatHistory;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/p[1]/a[1]") WebElement SUSeatHistory;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Invite history')]") WebElement SUInviteHistory;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'+ Invite a new user')]") WebElement InviteNewUser;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]/button[1]") WebElement SUBoxAddNewSUCTA;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]/h2[1]/button[1]") WebElement AddNewSUSupportUserForYou;
	
	
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Invite History')]") WebElement PUInviteHistoryPage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Invite History')]") WebElement SUSeatHistoryPage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Support Users Invite History')]") WebElement SUInviteHistoryPage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Invite an Primary users')]") WebElement InviteNewUserModalpage;
//	@FindBy (how=How.XPATH, using="//h3[contains(text(),'+ Invite a new user')]") WebElement InviteNewUser;
	// (how=How.XPATH, using="//h3[contains(text(),'+ Invite a new user')]") WebElement InviteNewUser;
	

	FamilyDashboard(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	 public void testcase12() throws Exception
	
	 {
		 
		 PUSeatHistory.click();
			if(PUInviteHistoryPage.isDisplayed())
			{
				String s1=PUInviteHistoryPage.getText();
				System.out.println("Navigated to "+s1+" page");
			}
	 }
	 
	 public void testcase13() throws Exception
	 {
		 
		 SUSeatHistory.click();
		 if(SUSeatHistoryPage.isDisplayed())
			{
				String s1=SUSeatHistoryPage.getText();
				System.out.println("Navigated to "+s1+" page");
			}
	 }
	 public void testcase14() throws Exception
	 {
		 SUInviteHistory.click();
		 if(SUInviteHistoryPage.isDisplayed())
			{
				String s1=SUInviteHistoryPage.getText();
				System.out.println("Navigated to "+s1+" page");
			}
		 
	 }
	 public void testcase15() throws Exception
	 {
		 InviteNewUser.click();
		 if(InviteNewUserModalpage.isDisplayed())
			{
				String s1=InviteNewUserModalpage.getText();
				System.out.println("Navigated to "+s1+" page");
			}
		 
	 }
	 public void testcase16() throws Exception
	 {
		 
		 SUBoxAddNewSUCTA.click();
		 if(PUInviteHistoryPage.isDisplayed())
			{
				String s1=PUInviteHistoryPage.getText();
				System.out.println("Navigated to "+s1+" page");
			}
	 }
	 public void testcase17() throws Exception
	 {
		 
		 AddNewSUSupportUserForYou.click();
		 if(PUInviteHistoryPage.isDisplayed())
			{
				String s1=PUInviteHistoryPage.getText();
				System.out.println("Navigated to "+s1+" page");
			}
	 }
	
//	public void testcase1() throws Exception
//	{
//		outgoing.click();
//		Thread.sleep(2000);
//		if(myoutgoingspage.isDisplayed())
//		{
//			String s1=myoutgoingspage.getText();
//			System.out.println("Navigated to "+s1);
//		}
//		
//		
//		
//	}
//	public void testcase2() throws Exception
//	{
//		warranties.click();
//		Thread.sleep(2000);
//		if(mywarrantiespage.isDisplayed())
//		{
//			String s1=mywarrantiespage.getText();
//			System.out.println("Navigated to "+s1+" page");
//		}
//	}
//	public void testcase3() throws Exception
//	{
//		benefits.click();
//		Thread.sleep(2000);
//		if(mybenefitspage.isDisplayed())
//		{
//			String s1=mybenefitspage.getText();
//			System.out.println("Navigated to "+s1+" page");
//		}
//	}
//	public void testcase4() throws Exception
//	{
//		Compare.click();
//		Thread.sleep(2000);
//		if(compareandsavepage.isDisplayed())
//		{
//			String s1=compareandsavepage.getText();
//			System.out.println("Navigated to "+s1+" page");
//		}
//	}
//	public void testcase5() throws Exception
//	{
//		Gifts.click();
//		Thread.sleep(2000);
//		if(Giftspage.isDisplayed())
//		{
//			String s1=Giftspage.getText();
//			System.out.println("Navigated to "+s1+" page");
//		}
//	}
//	public void testcase6() throws Exception
//	{
//		todos.click();
//		Thread.sleep(2000);
//		if(todospage.isDisplayed())
//		{
//			String s1=todospage.getText();
//			System.out.println("Navigated to "+s1+" page");
//		}
//	}
//	public void testcase7() throws Exception
//	{
//		Changefamilyname.click();
//		Thread.sleep(2000);
//		if(updatefamilymodalpage.isDisplayed())
//		{
//			String s1=updatefamilymodalpage.getText();
//			System.out.println("Navigated to "+s1+" Modal page");
//		}
//	}
//	public void testcase8() throws Exception
//	{
//		manageaccountplan.click();
//		Thread.sleep(2000);
//		if(managesubscriptonpage.isDisplayed())
//		{
//			String s1=managesubscriptonpage.getText();
//			System.out.println("Navigated to "+s1+" page");
//		}
//	}
//	
//	public void testcase9() throws Exception
//	{
//		viewallNotifications.click();
//		Thread.sleep(2000);
//		if(notificationspage.isDisplayed())
//		{
//			String s1=notificationspage.getText();
//			System.out.println("Navigated to "+s1+" page");
//		}
//	}
//	
//	public void testcase10() throws InterruptedException
//	{
//		copyFamilyID.click();
//		Thread.sleep(4000);
//		if(remindersettings.isDisplayed())
//		{
//			String s1=remindersettings.getText();
//			System.out.println("Navigated to "+s1+" page");
//		}
//	}
//	
//	
//	 public void testcase11() throws Exception
//	 {
//		 Remindersettings.click();
//		
//		 if(familyidcopied.isDisplayed())
//			{
//				String s1=familyidcopied.getText();
//				System.out.println("Displayed the  "+s1+" toast message");
//			}
//	 }
	 


}
