package Assignments;

public class NumberOfDigitsInNumber {

	public static void main(String[] args) {
		int number=10;
		System.out.println("Entered Number= "+number);
		int count=0;	
		while(number>0) {
			number=number/10;
			count++;
		}
		System.out.println("No: of digits : "+count);
	}

}
