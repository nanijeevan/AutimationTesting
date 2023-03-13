package practice1;

import java.util.Scanner;

public class MultiplicationofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Number : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" "+" = "+""+n*i);
		}
	}

}
