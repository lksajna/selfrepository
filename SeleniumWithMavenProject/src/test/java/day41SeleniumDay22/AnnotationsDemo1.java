package day41SeleniumDay22;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
@BeforeMethod
void Login()
	{
	System.out.println("Login.......");
	}
@AfterMethod
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
