package day41SeleniumDay22;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HardAssertionsDemo {
	@Test
	void Test() 
	{
		String title="welcome";
		/*if(title.equals("abc"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}*/
	
	Assert.assertEquals("abc","abc");
	Assert.assertEquals(1,2);
	
	Assert.assertEquals("ABC", "ABC");
	Assert.assertNotEquals("ABC", "ABC");
	Assert.assertNotEquals("ABC", "XYZ");
}
}
