package day41SeleniumDay22;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertionsDemo {
//@Test
void hardAssertions() 
{
	System.out.println("Testing......");
	System.out.println("Testing......");
	Assert.assertEquals(1, 2);
	System.out.println("Hard Assertion Completed");
	Assert.assertEquals(1,1);
}
@Test
void softAssertions() 
{
	System.out.println("Testing......");
	System.out.println("Testing......");
	
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(1, 2);
	System.out.println("Soft Assertion Completed");
	Assert.assertEquals(1,1);
	sa.assertAll();
}
}
}
