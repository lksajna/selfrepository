package Assignments;

public class PalindromeCheck {

	public static void main(String[] args) {
		int original_number=111;
		int number= original_number;
		//System.out.println("Original Number= "+original_number);
		int reverse_no=0;
		while(original_number!=0) {
			reverse_no=reverse_no*10+original_number%10;
			original_number=original_number/10;
		}
			//System.out.println("Reversed Number = "+reverse_no);
			if(number==reverse_no) {
				System.out.println("The number "+number+" is Palindrome" );
				}
				else {
					System.out.println("The number "+number+" is not Palindrome" );	
				}

		}

}
