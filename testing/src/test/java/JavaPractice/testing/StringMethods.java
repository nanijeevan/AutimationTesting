package JavaPractice.testing;

import java.util.Locale;

import org.testng.annotations.Test;

public class StringMethods {
	
	
	
	//char charAt(int index)	
	@Test
	public void test1()
	{
		String s1="Hyderabad";
		char ch;
		
		System.out.println(	s1.charAt(0));
		
	}

	
	//int length()
	@Test
	public void method2()
	{
		String s2="Secundrabad";		
		int size=s2.length();
		System.out.println("Length of the string is "+size);
	}
	
	//boolean contains(CharSequence s)
	@Test
	public void test3()
	
	{
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
	}
	
	//boolean equals(Object another)
	@Test
	public void test4()
	{
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
	}
	
	//boolean isEmpty()
	
	@Test
	public void test5()
	{
		String s1="";  
		String s2="javatpoint";  
		  
		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty());  
	}
	
	//String concat(String str)
	
	@Test
	public void test6()
	{
		String s1="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		s1.concat("is immutable");    
		System.out.println(s1);    
		s1=s1.concat(" is immutable so assign it explicitly");    
		System.out.println(s1);    
	}
	
	
	//String replace(char old, char new)
	@Test
	public void test7()
	{
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString);     
	}
	
	
	
	//String replace(CharSequence old, CharSequence new)
		@Test
		public void test8()
		{
			
			String s1="my name is khan my name is java";  
			String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"  
			System.out.println(replaceString);
			   
		}
		

	//static String equalsIgnoreCase(String another)
		
		@Test
		public void test9()
		{
			
			String s1="javatpoint";  
			String s2="javatpoint";  
			String s3="JAVATPOINT";  
			String s4="python";  
			System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
			System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
			System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
			   
		}
	
	//String[] split(String regex)
		
		@Test
		public void test10()
		{
			
			String s1="java string split method by javatpoint";  
			String[] words=s1.split("\\s");//splits the string based on whitespace  
			//using java foreach loop to print elements of string array  
			for(String w:words){  
			System.out.println(w);  
			} 
			   
		}
		
		//String intern()

		@Test
		public void test11()
		{
			
			String s1=new String("hello");  
			String s2="hello";  
			String s3=s1.intern();//returns string from pool, now it will be same as s2  
			System.out.println(s1==s2);//false because reference variables are pointing to different instance  
			System.out.println(s2==s3);//true because reference variables are pointing to same instance  
			   
		}
		
		
		//String[] split(String regex, int limit)
		@Test
		public void test12()
		{
			
			   String str = "Javatpointtt";  
		        System.out.println("Returning words:");  
		        String[] arr = str.split("t", 0);  
		        for (String w : arr) {  
		            System.out.println(w);  
		        }  
		        System.out.println("Split array length: "+arr.length);  
		    } 
		
		
		
		//int indexOf(int ch)
		@Test
		public void test13()
		{
			
			String s1="this is index of example";  
			//passing substring  
			int index1=s1.indexOf("is");//returns the index of is substring  
			int index2=s1.indexOf("index");//returns the index of index substring  
			System.out.println(index1+"  "+index2);//2 8  
			  
			//passing substring with from index  
			int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
			System.out.println(index3);//5 i.e. the index of another is  
			  
			//passing char value  
			int index4=s1.indexOf('s');//returns the index of s char value  
			System.out.println(index4);//3    
		    }
		
		//int indexOf(int ch, int fromIndex)
		
		@Test
		public void test14()
		{
			
			  String s1 = "This is indexOf method";         
		        // Passing substring and index  
		        int index = s1.indexOf("method", 10); //Returns the index of this substring  
		        System.out.println("index of substring "+index);  
		        index = s1.indexOf("method", 20); // It returns -1 if substring does not found  
		        System.out.println("index of substring "+index); 
		}
		
		
	
		
		//int indexOf(int ch)
		
		@Test
		public void test15()
		{
			String s1="this is index of example";  
			//passing substring  
			int index1=s1.indexOf("is");//returns the index of is substring  
			int index2=s1.indexOf("index");//returns the index of index substring  
			System.out.println(index1+"  "+index2);//2 8  
			  
			//passing substring with from index  
			int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
			System.out.println(index3);//5 i.e. the index of another is  
			  
			//passing char value  
			int index4=s1.indexOf('s');//returns the index of s char value  
			System.out.println(index4);//3  
		}
			
		//int indexOf(int ch, int fromIndex)

		@Test
		public void test16()
		{
			
		    String s1 = "This is indexOf method";         
	        // Passing substring and index  
	        int index = s1.indexOf("method", 10); //Returns the index of this substring  
	        System.out.println("index of substring "+index);  
	        index = s1.indexOf("method", 20); // It returns -1 if substring does not found  
	        System.out.println("index of substring "+index);  
		}
		
	//String toLowerCase()
		@Test
		public void test17()
		{
			String s1="JAVATPOINT HELLO stRIng";  
			String s1lower=s1.toLowerCase();  
			System.out.println(s1lower);  
		}
		
		
		
		//String toLowerCase(Locale l)
		@Test
		public void test18()
		{
		     String s = "JAVATPOINT HELLO stRIng";    
		        String eng = s.toLowerCase(Locale.ENGLISH);  
		        System.out.println(eng);  
		        String turkish = s.toLowerCase(Locale.forLanguageTag("tr")); // It shows i without dot  
		        System.out.println(turkish);   
		}
		
		//String toUpperCase()
		@Test
		public void test19()
		{
			String s1="hello string";  
			String s1upper=s1.toUpperCase();  
			System.out.println(s1upper);  
			 
		}
		
		
		//String toUpperCase(Locale l)
		@Test
		public void test20()
		{
		     String s = "hello string";    
		        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  
		        String english = s.toUpperCase(Locale.forLanguageTag("en"));  
		        System.out.println(turkish);//will print I with dot on upper side  
		        System.out.println(english); 
			 
		}
		
		//Java String trim()		
		@Test
		public void test21()
		{
			String s1="  hello string   ";  
			System.out.println(s1+"javatpoint");//without trim()  
			System.out.println(s1.trim()+"javatpoint");//with trim()  
		}	 
	
		//static String valueOf(int value)
		@Test
		public void test22()
		{
			int value=30;  
			String s1=String.valueOf(value);  
			System.out.println(s1+10);//concatenating string with 10   
		}
		
		
	
	
		}
      
	

