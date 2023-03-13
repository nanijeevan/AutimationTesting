package toDosModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDosTestCaseCreation {
	WebDriver driver;
	JavascriptExecutor executor;
	

	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[1]/ul[1]/li[6]/a[1]/img[1]") WebElement ToDos ;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),\"My To Do's\")]") WebElement MyToDosPage ;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]") WebElement SearchToDo;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'+ Add New To Do')]") WebElement AddNewToDo;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/img[1]") WebElement SearchClose;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Sort by :')]") WebElement sortbyFilter;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Filter by :')]") WebElement FilterBy;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]") WebElement sortbyClick;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Creation date')]") WebElement sortbySelectValue;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Activity Date')]") WebElement sortbySelectValue2;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]") WebElement FilterByClick;

	@FindBy (how=How.XPATH, using="//div[contains(text(),'Status')]") WebElement FilterBySelectValue;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Recurring status')]") WebElement FilterBySelectValue2;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Frequency')]") WebElement FilterBySelectValue3;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'All')]") WebElement FilterBySelectValue4;
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Filter by Values :')]") WebElement FilterByValues;
	
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]") WebElement FilterByValuesClick;
	
	//Filter Select By Value Status
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Active')]") WebElement FilterByValuesSelectValueActive;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Expired')]") WebElement FilterByValuesSelectValueExpired;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Completed')]") WebElement FilterByValuesSelectValueCompleted;
	
	//Filter Select By Value Recurring
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Recurring')]") WebElement FilterByValuesSelectValueRecurring;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Non-Recurring')]") WebElement FilterByValuesSelectValueNonRecurring;
	
	
	//Filter Select By Value Frequency	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Daily')]") WebElement FilterByValuesSelectValueDaily;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Weekly')]") WebElement FilterByValuesSelectValueWeekly;	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Monthly')]") WebElement FilterByValuesSelectValueMonthly;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Quarterly')]") WebElement FilterByValuesSelectValueQuarterly;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Bi-Annually')]") WebElement FilterByValuesSelectValueBiannualy;	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Yearly')]") WebElement FilterByValuesSelectValueYearly;
	
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/span[2]/img[1]") WebElement ToDoList;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]/span[2]/img[1]") WebElement ToDoList2;
                                            	///ToDo Details Page///
	
	@FindBy (how=How.XPATH, using="//h4[contains(text(),\"To Do's details\")]") WebElement ToDoDetailsPage;
	@FindBy (how=How.XPATH, using="//small[contains(text(),\"To Do's Name\")]") WebElement ToDoName;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'ETA')]") WebElement ToDoETA;
	@FindBy (how=How.XPATH, using="//small[contains(text(),\"To Do's Recurrance\")]") WebElement ToDoRecurrence;
	@FindBy (how=How.XPATH, using="//small[contains(text(),\"To Do's Frequency\")]") WebElement ToDoFrequency;
	
	@FindBy (how=How.XPATH, using="//h4[contains(text(),'Assigned to')]") WebElement AssignedTo;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/span[1]/p[1]") WebElement BacktoMyToDo;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Mark To Do as Complete')]") WebElement MarkToDoCompleted;
	@FindBy (how=How.XPATH, using="//button[@class='button primary mediumbtn']") WebElement EditToDo;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Delete')]") WebElement DeleteToDo;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Edit To Do')]") WebElement EditToDoPage;
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Delete To Do')]") WebElement DeleteToDoPopUp;
	@FindBy (how=How.XPATH, using="//button[@class='button info mediumbtn']") WebElement DeleteCancel;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Yes')]") WebElement DeleteYes;
	@FindBy (how=How.XPATH, using="//button[@class='btn-close']") WebElement DeleteClose;

	
	///Edit ToDo Page///
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[1]/span[1]/a[1]/p[1]") WebElement BacktoMyToDos;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Name')]") WebElement Name;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]") WebElement NameField;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Details')]") WebElement Details;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/textarea[1]") WebElement DetailsField;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Activity Date')]") WebElement ActivityDate;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]") WebElement ActivityDateField;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Activity Recurrence')]") WebElement ActivityRecurrence;
	@FindBy (how=How.XPATH, using="//input[@id='formBasicEmail']") WebElement ActivityRecurrenceToggle;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Activity Frequency')]") WebElement ActivityFrequency;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]") WebElement ActivityFrequencyField;
	@FindBy (how=How.XPATH, using="//label[contains(text(),'Assignee')]") WebElement Assignee;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement AssigneeField;
	
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Edit To Do')]") WebElement EditToDoButton;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]") WebElement ValidateSeachFilter;

	///Add New ToDo Page///
	@FindBy (how=How.XPATH, using="//h3[contains(text(),'Add a New To Do')]") WebElement AddNewToDoPage;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement AddToDoAssigneeField;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Daily')]") WebElement SelectActivityFrequency;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Self')]") WebElement SelectAssignee;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Add To Do')]") WebElement ADDToDoButton;
	
	
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Enter Name relevant to the activity')]") WebElement Error1;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Select the date on which you would like a reminder')]") WebElement Error2;
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Select the user who will be assigned this activity')]") WebElement Error3;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]") WebElement NoOfOcurrences;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'3')]") WebElement SelectNoOfOcurrences;
	
	
	ToDosTestCaseCreation(WebDriver driver)
	 {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		
		 this.executor = (JavascriptExecutor) this.driver; 
	 }	

	public void test1() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(1000);
		MyToDosPage.isDisplayed();
	}
	public void test2() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(2000);
		MyToDosPage.isDisplayed();
		ToDoList.isDisplayed();
		AddNewToDo.isDisplayed();
		SearchToDo.isDisplayed();
		sortbyFilter.isDisplayed();
		FilterBy.isDisplayed();
		Thread.sleep(1000);
	}
	
	
	public void test3() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(1000);
		SearchToDo.sendKeys("Renewal");
		SearchToDo.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ValidateSeachFilter.isDisplayed();
	
	}
	
	
	public void test4()throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(1000);
		SearchToDo.sendKeys("Renewal");
		SearchToDo.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		SearchClose.click();
	
	}

	public void test5() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(2000);
		ToDoList.click();
		Thread.sleep(2000);
		ToDoDetailsPage.click();
		
	}
	
	
	public void test6() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(2000);
		ToDoList.click();
		Thread.sleep(2000);
		ToDoDetailsPage.click();
		Thread.sleep(3000);
		ToDoName.isDisplayed();
		ToDoETA.isDisplayed();
		ToDoRecurrence.isDisplayed();
		ToDoFrequency.isDisplayed();
		AssignedTo.isDisplayed();
		BacktoMyToDo.isDisplayed();
		MarkToDoCompleted.isDisplayed();
		EditToDo.isDisplayed();
		DeleteToDo.isDisplayed();
		Thread.sleep(1000);
		
	}
	
	public void test7() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(3000);
		ToDoList.click();
		Thread.sleep(2000);
		EditToDo.click();
		Thread.sleep(2000);
		EditToDoPage.isDisplayed();
		Thread.sleep(2000);
	}
	
	 
	public void test8() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(3000);
		ToDoList.click();
		Thread.sleep(2000);
		DeleteToDo.click();
		Thread.sleep(2000);
		DeleteToDoPopUp.isDisplayed();
		Thread.sleep(1000);
		
	}
	
	
	public void test9() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(3000);
		ToDoList.click();
		Thread.sleep(2000);
		DeleteToDo.click();
		Thread.sleep(2000);
		DeleteYes.click();
		Thread.sleep(1000);
		
	}
	
	
	public void test10() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(3000);
		ToDoList2.click();
		Thread.sleep(2000);
		DeleteToDo.click();
		Thread.sleep(2000);
		DeleteCancel.click();
		Thread.sleep(2000);
		ToDoDetailsPage.isDisplayed();
		Thread.sleep(1000);
	}
	
	

	public void test11() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(3000);
		ToDoList2.click();
		Thread.sleep(2000);
		DeleteToDo.click();
		Thread.sleep(1000);
		DeleteClose.click();
		Thread.sleep(2000);
		ToDoDetailsPage.isDisplayed();
		Thread.sleep(1000);
	}
	
	
	
	

	public void test12() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(3000);
		ToDoList2.click();
		Thread.sleep(2000);
		MarkToDoCompleted.click();
		Thread.sleep(3000);
		MyToDosPage.isDisplayed();
		Thread.sleep(1000);
	}
	
	
	public void test13() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(3000);
		ToDoList2.click();
		Thread.sleep(2000);
		BacktoMyToDo.click();
		Thread.sleep(1000);
		MyToDosPage.isDisplayed();
		Thread.sleep(2000);
	}
	
	public void test14() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		AddNewToDo.click();
		Thread.sleep(3000);
		AddNewToDoPage.isDisplayed();
		Thread.sleep(1000);
	
	}
	public void test15() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(2000);
		AddNewToDo.click();
		Thread.sleep(2000);
		BacktoMyToDos.isDisplayed();
		Name.isDisplayed();
		Details.isDisplayed();
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		ActivityDate.isDisplayed();
		ActivityRecurrence.isDisplayed();
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		Assignee.isDisplayed();
		ADDToDoButton.isDisplayed();
		Thread.sleep(2000);
	}
	
	public void test16() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(2000);
		AddNewToDo.click();
		Thread.sleep(2000);
		NameField.sendKeys("To Do Testing");
		Thread.sleep(1000);
		DetailsField.sendKeys("To do Details Testing1");
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,600)");
		 Thread.sleep(1000);
		ActivityDateField.click();
		Thread.sleep(1000);
		ActivityDateField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		AssigneeField.click();
		Thread.sleep(1000);
		SelectAssignee.click();
		Thread.sleep(1000);
		ADDToDoButton.click();
		Thread.sleep(3000);
		MyToDosPage.isDisplayed();
		Thread.sleep(1000);
		
	}
	public void test17() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		AddNewToDo.click();
		Thread.sleep(2000);
		NameField.sendKeys("To Do Testing");
		Thread.sleep(1000);
		DetailsField.sendKeys("To do Details Testing");
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,600)");
		 Thread.sleep(1000);
		ActivityDateField.click();
		Thread.sleep(1000);
		ActivityDateField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ActivityRecurrenceToggle.click();
		Thread.sleep(1000);
		ActivityFrequencyField.click();
		Thread.sleep(1000);
		SelectActivityFrequency.click();
		Thread.sleep(1000);
		NoOfOcurrences.click();
		Thread.sleep(1000);
		SelectNoOfOcurrences.click();
		Thread.sleep(1000);
		AssigneeField.click();
		Thread.sleep(1000);
		SelectAssignee.click();
		Thread.sleep(1000);
		ADDToDoButton.click();
		Thread.sleep(6000);
		MyToDosPage.isDisplayed();
		Thread.sleep(1000);
		
	}
	public void test18() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		AddNewToDo.click();
		Thread.sleep(2000);
		 executor.executeScript("window.scrollBy(0,900)");
		 Thread.sleep(1000);
		ADDToDoButton.click();
		Thread.sleep(3000);
		Error3.isDisplayed();
		 executor.executeScript("window.scrollBy(0,-300)");
		 Thread.sleep(1000);
		Error2.isDisplayed();
		 executor.executeScript("window.scrollBy(0,-400)");
		 Thread.sleep(1000);
		Error1.isDisplayed();
		
	}
	
	public void test19() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		ToDoList2.click();
		Thread.sleep(2000);
		EditToDo.click();
		Thread.sleep(1000);
		BacktoMyToDos.isDisplayed();
		Name.isDisplayed();
		Details.isDisplayed();
		executor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		ActivityDate.isDisplayed();
		ActivityRecurrence.isDisplayed();
		Assignee.isDisplayed();
		EditToDoButton.isDisplayed();
		Thread.sleep(2000);	
	}
	
	public void test20() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		ToDoList2.click();
		Thread.sleep(2000);
		EditToDo.click();
		Thread.sleep(1000);
		NameField.clear();
		Thread.sleep(1000);
		NameField.sendKeys("Test123");
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(3000);
		EditToDoButton.click();
		Thread.sleep(3000);
		MyToDosPage.isDisplayed();
		Thread.sleep(1000);	
	}
	
	public void test21() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		ToDoList2.click();
		Thread.sleep(2000);
		EditToDo.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(3000);
		EditToDoButton.click();
		Thread.sleep(3000);
		MyToDosPage.isDisplayed();
		Thread.sleep(1000);	
	}
	public void test22() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		ToDoList2.click();
		Thread.sleep(2000);
		EditToDo.click();
		Thread.sleep(3000);
		NameField.clear();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,700)");
			Thread.sleep(3000);
		EditToDoButton.click();
		Thread.sleep(1000);
		 executor.executeScript("window.scrollBy(0,-700)");
		Thread.sleep(3000);
		Error1.isDisplayed();
		Thread.sleep(1000);	
	}
	public void test23() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		sortbyClick.click();
		Thread.sleep(2000);
		sortbySelectValue.click();
		Thread.sleep(1000);		
	}
	public void test24() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		sortbyClick.click();
		Thread.sleep(2000);
		sortbySelectValue2.click();
		Thread.sleep(1000);	
	}
	
	public void test25() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue.click();
		Thread.sleep(2000);	
		FilterByValuesClick.click();
		Thread.sleep(2000);	
		FilterByValuesSelectValueActive.click();
		Thread.sleep(1000);	
	}
	
	public void test26() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue.click();
		Thread.sleep(1000);	
		FilterByValuesClick.click();
		Thread.sleep(1000);	
		FilterByValuesSelectValueExpired.click();
		Thread.sleep(1000);	
	}
	
	
	public void test27() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue.click();
		Thread.sleep(1000);	
		FilterByValuesClick.click();
		Thread.sleep(1000);	
		FilterByValuesSelectValueCompleted.click();
		Thread.sleep(1000);	
	}
	
	public void test28() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue2.click();
		Thread.sleep(1000);
		FilterByValuesSelectValueRecurring.click();
		Thread.sleep(1000);
		
	}
	public void test29() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue2.click();
		Thread.sleep(1000);
		FilterByValuesClick.click();
		Thread.sleep(1000);	
		FilterByValuesSelectValueNonRecurring.click();
		Thread.sleep(1000);
		
	}
	public void test30() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue3.click();
		Thread.sleep(1000);
		FilterByValuesClick.click();
		Thread.sleep(1000);	
		FilterByValuesSelectValueDaily.click();
		Thread.sleep(1000);
		
	}
	public void test31() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue3.click();
		Thread.sleep(1000);
		FilterByValuesClick.click();
		Thread.sleep(1000);	
		FilterByValuesSelectValueWeekly.click();
		Thread.sleep(1000);
		
	}
	public void test32() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue3.click();
		Thread.sleep(1000);
		FilterByValuesClick.click();
		Thread.sleep(1000);	
		FilterByValuesSelectValueMonthly.click();
		Thread.sleep(1000);
		
	}
	public void test33() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue3.click();
		Thread.sleep(1000);
		FilterByValuesClick.click();
		Thread.sleep(1000);	
		FilterByValuesSelectValueQuarterly.click();
		Thread.sleep(1000);
		
	}
	public void test34() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(1000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue3.click();
		Thread.sleep(1000);
		FilterByValuesClick.click();
		Thread.sleep(1000);	
		FilterByValuesSelectValueBiannualy.click();
		Thread.sleep(1000);		
	}
	
	public void test35() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
		FilterBySelectValue3.click();
		Thread.sleep(1000);
		FilterByValuesClick.click();
		Thread.sleep(1000);	
		FilterByValuesSelectValueYearly.click();
		Thread.sleep(1000);
		
	}
	
	public void test36() throws Exception
	{
		Thread.sleep(2000);
		ToDos.click();	
		Thread.sleep(3000);
		FilterByClick.click();
		Thread.sleep(1000);
	
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'All')]")));
		FilterBySelectValue4.click();
		Thread.sleep(1000);
	}
	
	
	
}
