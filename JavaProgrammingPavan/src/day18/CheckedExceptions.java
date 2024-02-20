package day18;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program started.......");
		System.out.println("Program in progress.........");
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		Thread.sleep(5000);
		System.out.println("Program finished.........");
		System.out.println("Program exited........");
		
	}

}
