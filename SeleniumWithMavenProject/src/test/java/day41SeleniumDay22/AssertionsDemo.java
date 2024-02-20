package day41SeleniumDay22;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
@Test
void test() 
{
	
	String title="abc";
	Assert.assertEquals(title, "xyz");
}
}
