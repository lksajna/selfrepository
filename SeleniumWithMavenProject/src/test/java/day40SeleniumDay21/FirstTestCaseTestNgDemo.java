package day40SeleniumDay21;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

/*
 * 1. open app
 * 2. login
 * 3. logout
 */
public class FirstTestCaseTestNgDemo {
	@Test(priority=-5)
	void openApp() 
	{
		System.out.println("Opening application....");
	}
	@Test(priority=-3)
	void login() 
	{
		System.out.println("Login to the application....");
	}
	@Test(priority=0)
	void logout() 
	{
		System.out.println("Logout of the application....");
	}
}
