package Assignments;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a=6,b=4,c=3;
		if(a==b && a==c)
		{
			System.out.println("All the three numbers are equal");
		}
		else if(a<=b && a<=c) 
		{
			System.out.println("The smallest number is"+a);
		}
		else if(b<=a&&b<=c)
		{	
			System.out.println("The smallest number is"+b);
	
		}
		else
			System.out.println("The smallest number is "+c);
	}

}
