package Assignments;

import java.util.Scanner;

public class ReadigDataFromArrys {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			System.out.println("Enter "+i+" value");
			 a[i]=sc.nextInt();
		}
		System.out.println("Printing values in array");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
