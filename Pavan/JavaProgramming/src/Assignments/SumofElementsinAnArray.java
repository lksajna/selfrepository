package Assignments;

public class SumofElementsinAnArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6,7},sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of Digits in Array -->"  +sum);
		

	}

}
