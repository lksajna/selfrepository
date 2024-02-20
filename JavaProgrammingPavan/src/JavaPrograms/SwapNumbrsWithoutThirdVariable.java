package JavaPrograms;

import java.util.Scanner;

public class SwapNumbrsWithoutThirdVariable {

	public static void main(String[] args) {

		System.out.println("Enter the numbers to be swapped");
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The entered numbers are "+a+"  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped numbers are "+a+"  "+b);
	}

}
