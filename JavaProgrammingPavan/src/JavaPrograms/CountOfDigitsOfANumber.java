package JavaPrograms;

import java.util.Scanner;

public class CountOfDigitsOfANumber {

	public static void main(String[] args) {
		int n,i=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<=0) {System.out.println("Entered number is either 0 or less than 0");}
		else {
		while(n>0) 
		{
			n=n/10;
			i++;
		}
		System.out.println("No: of digits present is "+i);
	}
	}
}
