package practice1;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String : ");
		Scanner scan=new Scanner(System.in);
		char[] str=scan.nextLine().toCharArray();
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]);
		}
		

	}

}
