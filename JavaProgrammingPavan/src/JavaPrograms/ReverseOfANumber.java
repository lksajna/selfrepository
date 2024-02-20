package JavaPrograms;

import java.util.Scanner;

/*public class ReverseOfANumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to be reversed \t");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a,i=0,j=0;
		a=num;
		while(a>0) 
		{
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println("Reversed number is "+j);

	}

}*/
public class ReverseOfANumber{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed ===> ");
		int number = sc.nextInt();
		int i=0,j=0,a;
		a=number;
		while(a>0)
		{
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println("Reversed number is "+j);
		//public static void main (String[] args)
	}
}
