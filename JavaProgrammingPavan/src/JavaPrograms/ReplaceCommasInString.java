package JavaPrograms;

import java.util.Scanner;

public class ReplaceCommasInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string with commas");
		String str=sc.nextLine();
		String str1=str.replace(",", "");
		System.out.println("New String ====> "+str1);
	}

}
