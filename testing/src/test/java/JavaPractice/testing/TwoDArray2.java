package JavaPractice.testing;

public class TwoDArray2 {

	public static void main(String[] args) {
	
		
		Object a[][]=new Object[3][2];
		a[0][0]= 112;
		a[0][1]= "jhsaccvjd";
		a[1][0]= true;
		a[1][1]= 's';
		a[2][0]= 3156.22;
		a[2][1]= 6;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				System.out.print(" "+a[i][j]);
			} 
			System.out.println();
		}
	}

	}


