package Assignments;

public class SumOfEvenOddDigitsInArray {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7},Even_sum=0,Odd_sum=0;
		for(int i=0;i<=a.length-1;i++) 
		{
		if(a[i]%2==0) {
			Even_sum=Even_sum+a[i];
				
			}
			else
			{
				Odd_sum=Odd_sum+a[i];
			}
		}
		System.out.println("Sum of Even Numbers in the array="+Even_sum);
		System.out.println("Sum of Odd Numbers in the array="+Odd_sum);
		
	}

}
