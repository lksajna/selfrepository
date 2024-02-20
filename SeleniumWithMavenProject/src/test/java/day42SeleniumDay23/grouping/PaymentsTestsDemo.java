package day42SeleniumDay23.grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

/*
 * paymentinrupees - sanity
paymentindollar - sanity  & regression
paymentReturnbyBank  - regression

 */
public class PaymentsTestsDemo {


	@Test(priority=1, groups= {"sanity"})
	void paymentinrupees()
	{
		System.out.println("this is payement by rupees method");
	}
	
	@Test(priority=2,groups= {"sanity", "regression","functional"})
	void paymentindollar()
	{
		System.out.println("this is payement by dollar method");
	}
	
	@Test(priority=3,groups= {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("payment return by bank");
	}
	
}