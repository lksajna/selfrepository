package day41SeleniumDay22;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	@BeforeClass
	void Login()
		{
		System.out.println("Login.......");
		}
	@AfterClass
	void Logout()
	{
	System.out.println("Logout.......");
	}
	@Test(priority=1)
	void Search()
	{
	System.out.println("Search.......");
	}
	@Test(priority=2)
	void AdvancedSearch()
	{
	System.out.println("AdvancedSearch........");
	}
}
