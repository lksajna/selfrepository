package JavaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String original, reverseString="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		original=sc.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverseString=reverseString+original.charAt(i);
			
		}
		System.out.println("Reversed String ----> "+reverseString);
		if (original.equals(reverseString))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		

	}

}
