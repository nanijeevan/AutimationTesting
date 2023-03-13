package datadrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertyfile {
//
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//	    Properties prop = readPropertiesFile("credentials.properties");
//	      System.out.println("username: "+ prop.getProperty("username"));
//	      System.out.println("password: "+ prop.getProperty("password"));
//	}
//	
	
	
	@Test
	public void test1() throws Exception
	{
//		   FileInputStream fis = null;
//		      Properties prop = null;
		    
		      FileInputStream      fis = new FileInputStream("C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\credentials.properties");
		      Properties     prop = new Properties();
		         prop.load(fis);
		         System.out.println("username: "+ prop.getProperty("username"));
			      System.out.println("password: "+ prop.getProperty("password"));
			     // prop.setProperty("username1", "nanijeevan");
			      String outputPath="C:\\Users\\TOSHIBA\\eclipse-workspace\\BackofficeTesting\\credentials.properties";
			      prop.put("username1", "nanijeevan");
			      FileOutputStream outputStrem = new FileOutputStream(outputPath);
			      prop.store(outputStrem, outputPath);
			    //  prop.store(outputStrem, "This is a sample properties file");
			      prop.put("username1", "nanijeevan");
	}
			
		//	public static Properties readPropertiesFile(String fileName) throws IOException {
		//	      FileInputStream fis = null;
		//	      Properties prop = null;
		//	    
		//	         fis = new FileInputStream(fileName);
		//	         prop = new Properties();
		//	         prop.load(fis);
		//			return prop;
		//	
		//	   
		//	}
	
	
}
