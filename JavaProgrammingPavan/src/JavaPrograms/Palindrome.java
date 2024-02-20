package JavaPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		//Palindrome check
		/*
		 * System.out.println("Enter the number");
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,i=0,j=0;
		a=n;
		while(a>0) 
		{
		i=i%10;
		j=(j*10)+i;
		a=a/10;
		}
		if(n==j)
		{
			System.out.println("The number "+n+" is Palindrome");
			}
		else
		{
			System.out.println("The number "+n+" is not palindrome");
		}
		*/
		//Palindrome no:s between 1 to 10000
		
		
		//a=1;
		for (int n=1;n<1000;n++)
		{ int a,i=0,j=0;
			a=n;
			while(a>0) 
			{
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if(n==j)
			{
				System.out.println(j);
				}
			
			
		}
	}

}
