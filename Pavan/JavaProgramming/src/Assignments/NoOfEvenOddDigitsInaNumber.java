package Assignments;

public class NoOfEvenOddDigitsInaNumber {

	public static void main(String[] args) {
		int num=20000,digit, even_count=0,odd_count=0;
		System.out.println("Entered number is : "+num);
		while(num>0) {
			
			digit=num%10;
			num=num/10;
			
			if(digit%2==0) {
				even_count=even_count+1;
				
			}
			else {
				odd_count=odd_count+1;
				
			}
		}
		System.out.println("No: of even digits = "+even_count);
		System.out.println("No of odd digits = "+odd_count);

	}

}
