package day41SeleniumDay22.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Class1 {
@Test
	void abc() 
	{
		System.out.println("this is abc from class 1");	
	}
@BeforeTest
void m()
{
	System.out.println("This is before test method");
}
@BeforeSuite
void n()
{
	System.out.println("this is before suite");	
}
@AfterSuite
void as()
{
	System.out.println("this is after suite");	
}
}
