package JavaPrograms;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		//Check a number is Amstrong or not
		/*
		 * int a,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		a=n;
		while(a>0) 
		{
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if(n==j) 
		{
			System.out.println("The number "+n+" is an amstrong number");
		}
		else
		{ 
			System.out.println("The number "+n+" is not an amstrong number");
		}
		 */
		//Amstrong number between 1 to 1000
		for (int n=1;n<=1000;n++)
		{
		int a,i=0,j=0;
		a=n;
		while(a>0) 
		{
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if(n==j) 
		{
			System.out.println(n);
		}
		
		}
	}

}
