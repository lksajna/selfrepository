package day18;

public class finallyblock {

	public static void main(String[] args) {
		String s=null;//"sss";
		try {
			System.out.println(s.length());
			}
		catch(ArithmeticException e) 
		{
			System.out.println("Arithmatic Exception occured");
		}
		//catch(NullPointerException e) {System.out.println("Null pointer Exception occured");}
		finally 
		{
			System.out.println("Entered finally block");
		}

	}

}
