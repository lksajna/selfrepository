package Assignments;

import java.util.Scanner;

public class MissingNumberinArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int sum1=0;int sum2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array(Array should not be in sorted order and the values should not have duplicates in the array)");
	    for(int i=0;i<5;i++) 
	    {
	    	arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	    	sum1=sum1+arr[i];
	    }	  
	    System.out.println("Sum of array "+sum1);
	    for(int i=0;i<=arr.length;i++)
	    {
	    	sum2=sum2+i;
	    	 System.out.println("test----->"+sum2+"="+sum2+"+"+i);
	    }
	    System.out.println("Sum of range "+sum2);
	    int miss_num=sum1-sum2;
	    System.out.println("The missing number is "+miss_num);
	

	}

}
