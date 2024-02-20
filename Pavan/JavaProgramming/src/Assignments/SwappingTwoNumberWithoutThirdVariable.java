package Assignments;

public class SwappingTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int a=2,b=3;
		System.out.println("The numbers before swapping are"+a+", "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The numbers after swapping are"+a+", "+b);

	}

}
