package JavaPrograms;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,i=0,j=0;
		a=n;
		while(a>0) 
		{
			i=a%10;
			j=j+i;
			a=a/10;
		}
		System.out.println("Sum of digits is "+j);
	}

}
