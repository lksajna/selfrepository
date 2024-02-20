package JavaPrograms;

import java.util.Scanner;

public class SwapNumbersUsingAThirdVariable {

	public static void main(String[] args) {
		
		System.out.println("Enter the numbers to be swapped");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The entered numbers are "+a+"  "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("The swapped numbers are "+a+"  "+b);
	}

}
