package practice1;

import java.util.Scanner;

public class SumOfDigitsOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=scan.nextInt();
		int sum=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;sum=sum+n%10;
			
			n=n/10;
			
		}

	}

}
//int sum = 0;
//while (n != 0) {
//    sum += n % 10;
//    n /= 10;