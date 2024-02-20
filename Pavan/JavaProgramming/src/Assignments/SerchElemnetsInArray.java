package Assignments;

import java.util.Scanner;

public class SerchElemnetsInArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array");
		for(int i=0;i<5;i++) 
		{
		arr[i]=sc.nextInt();
		}
		
		int searchElement;
		System.out.println("Enter the number to search");
		searchElement=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<5;i++) {
			if(arr[i]==searchElement) {
				System.out.println("Searched Element Found");
				flag=true;
				break;
			}
			
		}
		
		if(flag==false)
			System.out.println("Element not found");
		
	}

}
