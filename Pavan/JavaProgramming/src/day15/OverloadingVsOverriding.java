package day15;

public class OverloadingVsOverriding {
class ABC
{
	void m1(int a) 
	{
		System.out.println(a);
	
	}
	void m2(int b)
	{
		System.out.println(b);
	
	}
class XYZ extends ABC
{
		void m1(int a)
		{
			System.out.println(a);
		
		}
		void m2(int a,int b)
		{
			System.out.println(a);
			System.out.println(b);
		}	
	}
}
}
