package Assignments;

import java.util.Scanner;

public class SortingElementsUsingForLoop {

	public static void main(String[] args) {
		int a[]=new int[5];
		int n=a.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements to be Sorted");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++) {
			if(a[j]>a[j+1]) {
				int temp =a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			else {
				continue;
			}
		}}
		System.out.println("After Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
