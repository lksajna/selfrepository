package day18;

import java.util.Scanner;

public class ExceptionalHandling {

	public static void main(String[] args) {
		
		System.out.println("Program started");
		Scanner sc=new Scanner(System.in);
		//Example1
		System.out.println("Enter a number");
		int num = sc.nextInt();
		try{
			
		System.out.println(100/num);
		
		}
		catch(ArithmeticException e){
			
			System.out.println("Invalid data provided");
			System.out.println(e.getMessage());
			
		}
		System.out.println("Program is completed");
		System.out.println("Program is exited2");
		
		
		//Example2
		/*int a[]=new int[5];
		System.out.println("Enter the position(0-4)");
		int pos = sc.nextInt();
		System.out.println("Enter a value");
		int value = sc.nextInt();
		a[pos]=value;
		System.out.println(a[pos]);
		System.out.println("Program Completed..");
		System.out.println("Program exited..");
		*/
		
		
		//Example3
		/*String s="welcome";//1234 
		int num=Integer.parseInt(s);
		System.out.println("num --->"+num);
		*/
	}

}
