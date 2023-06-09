package com.demotest.demotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateMultiSelectMCQ {
	
	

	WebDriver driver;

	@Test(priority = 1)
	public void login() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://bo-dev.nslsdev.com/");
		driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
		driver.findElement(By.id("password")).sendKeys("AdminOne@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String Pagetitle = driver.getTitle();
		System.out.println(Pagetitle);

		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	
	//MULTI SELECT MCQ QUESTION
	@Test(priority = 2)
	public void createstate() throws Exception {
		//click on Primary Datamanagemet
		driver.findElement(By.linkText("Primary data management")).click();
		Thread.sleep(2000);
		//click on QuestionBank
		driver.findElement(By.xpath("//a[contains(text(),'Question bank')]")).click();
		Thread.sleep(2000);
		//click on create Question
		driver.findElement(By.xpath("//span[contains(text(),'+ Create Question')]")).click();
		Thread.sleep(2000);
		//select Grade
		WebElement grade = driver.findElement(By.xpath(
				"//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[1]/div[1]/select[1]"));
		Thread.sleep(2000);
		Select select = new Select(grade);
		select.selectByIndex(1);
		//select Subject
		WebElement subject = driver.findElement(By.xpath(
				"//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[2]/div[1]/select[1]"));
		Select select1 = new Select(subject);
		select1.selectByIndex(1);
		Thread.sleep(2000);
		//select Chapter
		WebElement chapter = driver.findElement(By.xpath(
				"//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[3]/div[1]/select[1]"));
		Select select2 = new Select(chapter);
		select2.selectByIndex(1);
		Thread.sleep(2000);
		//select Topic
		driver.findElement(By.xpath("//input[@id='search_input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Hyperbolic Equations-1')]")).click();
		Thread.sleep(2000);
		//select Taxonomy
		WebElement taxonomy = 	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[5]/div[1]/select[1]"));
		Select select3 = new Select(taxonomy);
		select3.selectByIndex(1);
		Thread.sleep(2000);
		//select SubTaxonomy
		WebElement taxonomysub = 	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[6]/div[1]/select[1]"));
		Select select4 = new Select(taxonomysub);
		select4.selectByIndex(1);
		Thread.sleep(2000);
		//select QuestionType
		WebElement Questype =  driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[7]/div[1]/select[1]"));
		Select select5 = new Select(Questype);
		select5.selectByIndex(2);
		//select Question Category
		WebElement Quescategory =	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[8]/div[1]/select[1]"));
		Select select6 = new Select(Quescategory);
		select6.selectByIndex(1);
		Thread.sleep(2000);
		//select AverageTime
		WebElement Avgtime =driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[9]/div[1]/select[1]"));
		Select select7 = new Select(Avgtime);
		select7.selectByIndex(1);
		Thread.sleep(2000);
		//select Marks
		WebElement marks =driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[10]/div[1]/select[1]"));
		Select select8 = new Select(marks);
		select8.selectByIndex(1);
		Thread.sleep(2000);
		//select Difficulty Level
		WebElement difficulty =	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[11]/div[1]/select[1]"));
		Select select9 = new Select(difficulty);
		select9.selectByIndex(1);
		Thread.sleep(2000);
		//write Question
		driver.findElement(By.xpath("//textarea[@id='exampleEmail']")).sendKeys("Which is the formula of (a+b)2");
		Thread.sleep(2000);
		//write Answer1
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[14]/div[1]/textarea[1]")).sendKeys("a2+b2");
		Thread.sleep(2000);
		//write Answer2
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[15]/div[1]/textarea[1]")).sendKeys("a2+b2-2ab");
		Thread.sleep(2000);
		//write Answer3
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[16]/div[1]/textarea[1]")).sendKeys("a2-b2-2ab");
		Thread.sleep(2000);
		//write Answer4
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[17]/div[1]/textarea[1]")).sendKeys("a2+b2+2ab");
		Thread.sleep(2000);
		//Select RightAnswer
	WebElement radio1=	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[17]/div[1]/small[1]/div[1]/input[1]"));
	radio1.click();
	WebElement radio2=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[16]/div[1]/small[1]/div[1]/input[1]"));
	
	radio2.click();
		Thread.sleep(2000);
		//EnterReasoning for Right Answer
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[1]/div[18]/div[1]/textarea[1]")).sendKeys("The formula of (a+b)2 is a2+b2+2ab");
		Thread.sleep(2000);
		//Click on Preview & Add to Question Bank
		driver.findElement(By.xpath("//button[contains(text(),'Preview & Add to Question Bank')]")).click();
		Thread.sleep(7000);
		
	}
	
	@AfterTest
	public void terminate()
	{
		driver.close();
	}

}
