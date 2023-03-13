package JavaPractice.testing;

public class TwoDArray3 {
	
	
	public void text(String a,String b,String c,String d)
	{
		
		  Object[][] subjects = {
		            { "Data Structures & Algorithms",
		              "Programming & Logic", "Software Engineering",
		              "Theory of Computation" },                       // row 1
		  
		            { "Thermodynamics", "Metallurgy",
		              "Machine Drawing",
		              "Fluid Mechanics" },                             // row2
		  
		            { "Signals and Systems", "Digital Electronics",
		              "Power Electronics" }                            // row3
		        };
		  
		        System.out.println(
		            "Fundamental Subject in Computer Engineering: "
		            + subjects[0][0]);
		        System.out.println(
		            "Fundamental Subject in Mechanical Engineering: "
		            + subjects[1][3]);
		        System.out.println(
		            "Fundamental Subject in Electronics Engineering: "
		            + subjects[2][1]);
		    }

	
	public static void main(String[] args) {
		TwoDArray3 obj=new TwoDArray3();
	
	}

}
