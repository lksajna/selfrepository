package JavaPrograms;

import java.util.Scanner;

/*public class FactorialOfANumber {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		n=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("The factorial of number "+n+" is "+factorial);
	}

}*/
public class FactorialOfANumber{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int n=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of number "+n+"  is "+factorial);
		
	}
} 
