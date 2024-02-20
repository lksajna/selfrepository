package day1;

public class ArrayAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Sum of elements in an array
		/*
		int sum=0;
		//int a[][]=new int[20][20];
		int a[][]= {{100,200},{300,400},{500,600}};
		for (int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				sum=sum+a[r][c];
			}
		}
		System.out.println("Sum of array "+sum);
		*/
		int sum=0;
		int a[][]= {{100,200},{300,400},{500,700}};
		for(int x[]:a)
		{
			for(int v:x) 
			{
				sum=sum+v;
			}
		}
		System.out.println("Sum of array "+sum);
		//2. print even and odd numbers in array
		//3.Searching elemnts in an array
		//4.Sort elements in an array
				
	}

}
