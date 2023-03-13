package familyDashboard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InviteManagement {
	WebDriver driver;
	JavascriptExecutor executor;
	
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Add Main User')]") WebElement AddMainUserButton ;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Invite an Main user')]") WebElement AddMainUserPopUp;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Invite an Main user')]") WebElement CloseAddMainUserPopUp;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/input[1]") WebElement FirstName;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/input[2]") WebElement LastName;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/input[3]") WebElement Email;
	@FindBy (how=How.XPATH, using="//strong[contains(text(),'Admin and Main user')]") WebElement UserAUPU;	
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Send Invite')]") WebElement SendInvitebutton;
	@FindBy (how=How.XPATH, using="/html/body/div[4]/div/div/div[2]/div/button") WebElement AddMySelfasPU;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]/img[1]") WebElement PU3dotsClick;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Remove User')]") WebElement PURemoveUser;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Revoke Invite')]") WebElement PURevokeInvite;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Seat history')]") WebElement PUSeatHistoryLink;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/p[2]") WebElement PUUserSupportingYou;
	
	//Supoort User

	@FindBy (how=How.XPATH, using="//span[contains(text(),'Add Support User')]") WebElement AddSupportUserbutton;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Invite Support User')]") WebElement AddSupportUserPopUp;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/button[1]") WebElement CloseSupportUserPopUp;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]/div[4]/div[2]/div[1]/button[1]/img[1]") WebElement SU3dots;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'View Details')]") WebElement SUViewDetails;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Remove User')]") WebElement SURemoveUser;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Remove this user as SU')]") WebElement SURemovethisUserAsSU;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/p[3]") WebElement SUUserSupportingYou;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/p[1]/a[1]") WebElement SUSeatHistorylink;	
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Invite history')]") WebElement SUInviteHistorylink;	
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Main Users')]") WebElement MainUsersText;
	@FindBy (how=How.XPATH, using="//span[contains(text(),'Support Users')]") WebElement SupportUsersText;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Seat History')]") WebElement SeatHistoryPage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Support Users Invite History')]") WebElement InviteHistoryPage;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Firstname')]") WebElement FirstnameColour;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'User already invited into the Family with AU role')]") WebElement ResendInviteError;	
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Assign myself as SU')]") WebElement AssignMySelfasSU;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[1]/div[1]/h3[1]") WebElement RemoveUserPopUp;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Cancel')]") WebElement CancelRemoveUserPopUp;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Yes')]") WebElement YESRemoveUserPopUp;	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[3]/span[1]/img[1]") WebElement SupportUserAssignedtoPrimary;
	@FindBy (how=How.XPATH, using="//p[contains(text(),'Main users assigned to this support user')]") WebElement SUViewDetailsPage;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[2]/p[1]") WebElement NoPUsInSUViewDetailsPage;	
	@FindBy (how=How.XPATH, using="//strong[contains(text(),'Admin')]") WebElement AdminDashboardPage;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Status')]") WebElement PuInviteHistoryStatus;
	@FindBy (how=How.XPATH, using="//button[@id='uncontrolled-tab-example-tab-primary_users']") WebElement PuInviteHistorydetails;
	@FindBy (how=How.XPATH, using="//*[contains(text(),'Add Support User')]") WebElement AddSUButton2;	
	@FindBy (how=How.XPATH, using="//li[contains(text(),'Choose existing Support Users')]") WebElement ChooseexistingSupportUsers;
	@FindBy (how=How.XPATH, using="//li[contains(text(),'Invite a new Support User')]") WebElement InviteanewSupportUser;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Add Support Users')]") WebElement ChooseexistingSupportUsersPOPUP;
	@FindBy (how=How.XPATH, using="//body/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/label[1]/span[1]/input[1]") WebElement SelectChooseexistingSupportUsersPOPUP;
	@FindBy (how=How.XPATH, using="//*[contains(text(),'Send Invite')]") WebElement SendInviteChooseexistingSupportUsers;	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'User already exists in Family with SU role')]") WebElement SUAlreadyExist;	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]/div[2]/div[1]/div[1]") WebElement SUlisting;	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[5]/div[1]") WebElement SUStatus;
	
	
	/////////////////Family Invitations////////////////////
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]") WebElement InvitationList;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Accept')]") WebElement AcceptInvitation;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Reject')]") WebElement RejectInvitation;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Congratulations !!')]") WebElement InvitationAccepted;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Visit your Family page')]") WebElement VisitYouFamily;
	
	

	InviteManagement(WebDriver driver)
	 {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		
		 this.executor = (JavascriptExecutor) this.driver; 
	 }
	
	
	public void TC001() throws Exception
	{
		AddMainUserButton.click();
		Thread.sleep(1000);
		AddMainUserPopUp.isDisplayed();
	}
	
	public void TC002() throws Exception
	{
		AddMainUserButton.click();
		Thread.sleep(1000);
		FirstName.sendKeys("test");
		LastName.sendKeys("user");
		Email.sendKeys("testuser@gmail.com");
		Thread.sleep(1000);
		SendInvitebutton.click();
	}
	public void TC003() throws Exception
	{
		AddMainUserButton.click();
		Thread.sleep(1000);
		AddMySelfasPU.click();
		Thread.sleep(4000);
		UserAUPU.isDisplayed();
		
		
	}
	
	public void TC005() throws Exception
	{

		AddMainUserButton.click();
		Thread.sleep(1000);
		SendInvitebutton.click();
		
		
		String s = FirstnameColour.getCssValue("color");
		String c = Color.fromString(s).asHex();

	      System.out.println("Color is :" + s);
	      System.out.println("Hex code for color:" + c);
	      String fail="rgba(255, 33, 33, 1)";
	      if(s.equalsIgnoreCase(fail))
	      {
	    	  System.out.println("Please enter the details inside the field");
	      }
	      else
	      {
	    	  System.out.println("User invited into the family");
	      }
	      
	      //getting color attribute with getCssValue()
//	      String colr = 
//	    		  FirstnameColour.getCssValue("color");
//	      //getting background color attribute with getCssValue()
//	      String bckgclr = FirstnameColour.getCssValue("background-color");
//	      System.out.println(colr);
//	      System.out.println(bckgclr);
	}
	
	public void TC009() throws Exception
	{
		AddMainUserButton.click();
		Thread.sleep(1000);
		FirstName.sendKeys("test");
		LastName.sendKeys("user");
		Email.sendKeys("testuser@gmail.com");
		Thread.sleep(1000);
		SendInvitebutton.click();
		ResendInviteError.isDisplayed();
		Thread.sleep(4000);

		
	}
	
	public void TC010() throws Exception
	{
	
		PU3dotsClick.click();
		Thread.sleep(1000);
		PURemoveUser.isDisplayed();
		AssignMySelfasSU.isDisplayed();
	}
	
	public void TC011() throws Exception
	{
	
		PU3dotsClick.click();
		Thread.sleep(1000);
		PURemoveUser.click();
		Thread.sleep(1000);
		RemoveUserPopUp.isDisplayed();
		
		
	}
	

	public void TC012() throws Exception
	{
	
		PU3dotsClick.click();
		Thread.sleep(1000);
		PURemoveUser.click();
		Thread.sleep(1000);
		YESRemoveUserPopUp.click();
		
		
		
	}
	
	public void TC013() throws Exception
	{
	
		PU3dotsClick.click();
		Thread.sleep(1000);
		PURemoveUser.click();
		Thread.sleep(1000);
		CancelRemoveUserPopUp.click();

	}
	
	public void TC014() throws Exception
	{
	
		PU3dotsClick.click();
		Thread.sleep(1000);
		AssignMySelfasSU.click();	
		Thread.sleep(4000);
		SupportUserAssignedtoPrimary.isDisplayed();
	}
	public void TC015() throws Exception
	{
		SU3dots.click();
		Thread.sleep(1000);
		SUViewDetails.isDisplayed();
		SURemoveUser.isDisplayed();
	}
	public void TC016() throws Exception
	{
		SU3dots.click();
		Thread.sleep(1000);
		SURemoveUser.click();
		RemoveUserPopUp.isDisplayed();
		
	}
	
	public void TC017() throws Exception
	{
		SU3dots.click();
		Thread.sleep(1000);
		SURemoveUser.click();
		Thread.sleep(1000);
		YESRemoveUserPopUp.click();
		
	}
	public void TC018() throws Exception
	{
		SU3dots.click();
		Thread.sleep(1000);
		SURemoveUser.click();
		Thread.sleep(1000);
		CancelRemoveUserPopUp.click();	
	}
	
	public void TC019() throws Exception
	{
		SU3dots.click();
		Thread.sleep(1000);
		SUViewDetails.click();
		Thread.sleep(1000);
		SUViewDetailsPage.isDisplayed();
	}
	public void TC020() throws Exception
	{
		SU3dots.click();
		Thread.sleep(1000);
		SUViewDetails.click();
		Thread.sleep(1000);
		NoPUsInSUViewDetailsPage.isDisplayed();
	}
	
	
	
														///////////////AO UserDashboard/////////////

	public void TC021() throws Exception
	{
		AdminDashboardPage.isDisplayed();
	}

	
	public void TC022() throws Exception
	{
		PUSeatHistoryLink.click();
		Thread.sleep(3000);
		SeatHistoryPage.isDisplayed();
	}
	
	
	
	public void TC023() throws Exception
	{
		PUSeatHistoryLink.click();
		Thread.sleep(3000);
		SeatHistoryPage.isDisplayed();
		PuInviteHistorydetails.isDisplayed();
		PuInviteHistoryStatus.isDisplayed();
	}
	
	
	
	
	public void TC024() throws Exception
	{
		SUInviteHistorylink.click();
		Thread.sleep(2000);
		InviteHistoryPage.isDisplayed();		
	}

	public void TC025() throws Exception
	{
		SUInviteHistorylink.click();
		Thread.sleep(2000);
		InviteHistoryPage.isDisplayed();
		PuInviteHistoryStatus.isDisplayed();
	
	}
	
	//////////////////Support User Management//////////////////
	
	
	
	public void TC01() throws Exception
	{
		AddSUButton2.click();
		Thread.sleep(1000);
		ChooseexistingSupportUsers.isDisplayed();
		InviteanewSupportUser.isDisplayed();
	
	}
	
	public void TC02() throws Exception
	{
		AddSUButton2.click();
		Thread.sleep(1000);
		ChooseexistingSupportUsers.click();
		Thread.sleep(1000);
		ChooseexistingSupportUsersPOPUP.isDisplayed();
		
		
	}
	
	public void TC03() throws Exception
	{
		AddSUButton2.click();
		Thread.sleep(1000);
		ChooseexistingSupportUsers.click();
		Thread.sleep(1000);
		SelectChooseexistingSupportUsersPOPUP.click();
		Thread.sleep(1000);
		SendInviteChooseexistingSupportUsers.click();
		
		
		
	}
	
	
	public void TC04() throws Exception
	{
		AddSUButton2.click();
		Thread.sleep(1000);	
		InviteanewSupportUser.click();
		Thread.sleep(1000);	
		AddSupportUserPopUp.isDisplayed();

	}
	
	public void TC05() throws Exception
	{
		AddSUButton2.click();
		Thread.sleep(1000);	
		InviteanewSupportUser.click();
		Thread.sleep(1000);	
		FirstName.sendKeys("testinguser");
		LastName.sendKeys("demo");
		Email.sendKeys("demotestinguser@gmail.com");
		SendInvitebutton.click();
	}
	
	public void TC06() throws Exception
	{
		AddSUButton2.click();
		Thread.sleep(1000);	
		InviteanewSupportUser.click();
		Thread.sleep(1000);			
		SendInvitebutton.click();
		
		
		String s = FirstnameColour.getCssValue("color");
		String c = Color.fromString(s).asHex();

	      System.out.println("Color is :" + s);
	      System.out.println("Hex code for color:" + c);
	      String fail="rgba(255, 33, 33, 1)";
	      if(s.equalsIgnoreCase(fail))
	      {
	    	  System.out.println("Please enter the details inside the field");
	      }
	      else
	      {
	    	  System.out.println("User invited into the family");
	      }

	}
	public void TC07() throws Exception
	{
		AddSUButton2.click();
		Thread.sleep(1000);	
		InviteanewSupportUser.click();
		Thread.sleep(1000);	
		FirstName.sendKeys("testinguser");
		LastName.sendKeys("demo");
		Email.sendKeys("demotestinguser@gmail.com");
		SendInvitebutton.click();
		SUAlreadyExist.isDisplayed();
		
	}
	public void TC08() throws Exception
	{
		SUlisting.isDisplayed();
	}
	
	public void TC09() throws Exception
	{
		SUInviteHistorylink.click();
		Thread.sleep(1000);	
		InviteHistoryPage.isDisplayed();		
	}
	
	public void TC10() throws Exception
	{
		SUInviteHistorylink.click();
		Thread.sleep(1000);	
		SUStatus.isDisplayed();
	
	}
	
	
//////////Accepting and Rejecting the User Invitation//////////////////
	public void TC0001() throws Exception
	{
		InvitationList.isDisplayed();
		AcceptInvitation.isDisplayed();
		RejectInvitation.isDisplayed();
		
	     
	}
	
	public void TC0002() throws Exception
	{
				AcceptInvitation.click();
				Thread.sleep(3000);	
				InvitationAccepted.isDisplayed();	     
	}
	
	public void TC0003() throws Exception
	{
				AcceptInvitation.click();
				Thread.sleep(3000);	
				VisitYouFamily.click();   
	}
	
	
}
