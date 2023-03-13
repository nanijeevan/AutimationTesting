package practice1;

import java.util.Scanner;

public class InputTextUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		
		System.out.println("Enter the value of b");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println(c);
		
		

	}

}
