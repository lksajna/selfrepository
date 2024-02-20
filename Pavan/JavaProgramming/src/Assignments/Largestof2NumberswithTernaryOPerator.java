package Assignments;

public class Largestof2NumberswithTernaryOPerator {

	public static void main(String[] args) {
		int a=500, b=300;
		if (a==b) {
			System.out.println("The two numbers are equal");
		}
		else {
		int x= (a>b) ? a:b;
		System.out.println("The largest number is "+x); 
		}

	}

}
