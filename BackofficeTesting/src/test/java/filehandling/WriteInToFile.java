package filehandling;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteInToFile {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
	   
		
		
		try {

	        FileWriter myWriter = new FileWriter("E:\\AutomationScreenshot\\filename0012345.txt");	        
	        // \n is used to write the text in the next line.
	   
	        myWriter.write("Hello" + '\n' + "World"+ '\n');
	      //  myWriter.write("Files in Java might be tricky but it is fun enough!");
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	        
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    }

	}


