package backoffice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TestCreation {
	
	WebDriver driver;
	JavascriptExecutor executor;
	
	
	
	@FindBy (how=How.XPATH, using="//small[contains(text(),'Enter the price value for which you have purchased')]") WebElement CreateWarrantError4;
	@FindBy (how=How.XPATH, using="//li[contains(text(),'Terms and conditions')]") WebElement Termsandconditions;
	@FindBy (how=How.XPATH, using="//li[contains(text(),'Privacy policy')]")  WebElement Privacypolicy;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[1]/p[1]")  WebElement copyright;
	@FindBy (how=How.XPATH, using="//body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")  WebElement DashboardPage;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")  WebElement StatsTitle;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Outgoings')]")  WebElement OutgoingStats;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Warranties')]")  WebElement WarrantiesStats;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Vouchers and Gift Cards')]")  WebElement VoucherandGiftCardsStats;
	@FindBy (how=How.XPATH, using="//div[contains(text(),\"To Do's\")]")  WebElement ToDoStats;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/small[1]")  WebElement OutgoingTotalCost;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/small[1]")  WebElement WarrantyTotalCost;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/small[1]")  WebElement GiftcardTotalCost;
	@FindBy (how=How.XPATH, using="//small[contains(text(),\"Total To Do's completed\")]")  WebElement TotalToDocompleted ;
	
	
	
	

	
	
	
	
	
	Login_TestCreation(WebDriver driver)
	 {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
		 this.executor = (JavascriptExecutor) this.driver; 
	 }




	@BeforeMethod
	public void browserlaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev-admin.elderlylife.co.uk/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@el.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")));
	}

	
	
	
	
	
	
	
	
	
}
