package day42SeleniumDay23;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestDemo {

	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(false);
	}
	
	//@Test(priority=2, dependsOnMethods= {"openApp"})
	@Test(priority=2,dependsOnMethods= {"openApp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	//@Test(priority=3, dependsOnMethods= {"login"})
	@Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	
	//@Test(priority=4,dependsOnMethods= {"login","search"})
	@Test(priority=4)
	void advacedsearch()
	{
		Assert.assertTrue(true);
	}

	//@Test(priority=5,dependsOnMethods= {"login"})
	@Test(priority=5)
	void logout()
	{
		Assert.assertTrue(true);
	}
}
