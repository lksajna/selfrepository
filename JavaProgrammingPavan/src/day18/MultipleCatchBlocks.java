package day18;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("PRogram started.....");
	
		String s=null;//"";//"welcome";
		//Approach 1
		/*try {
		//System.out.println("String length"+s.length());
		System.out.println(200/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic Exception occured");
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Number Format Exception occured");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception occured");
		}
		*/
		//Approach2
		try {
		//System.out.println("String length"+s.length());
		System.out.println(200/0);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
			System.out.println(e.getMessage());
		}
		System.out.println("Program finished.....");

	}

}
