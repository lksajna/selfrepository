package day43SeleniumDay24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestDemo {
	WebDriver driver;
	//String Url;
	@BeforeClass
	@Parameters({ "browser","url" })
	void setup(String br,String appUrl)
	{
		//Url=appUrl;
		if(br.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (br.equals("safari"))
		{
			driver = new SafariDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		//
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(appUrl);
	}
	
	@Test(priority=1)
	void testLogo() 
	{
		try {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status,true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	@Test(priority=2)
	void testHomePageTitle() 
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@Test(priority=3)
	@Parameters({"url"})
	void TestAppURL(String appUrl)
	{
		//this.appUrl=appUrl;
		Assert.assertEquals(driver.getCurrentUrl(),appUrl);
	}
	@AfterClass
	void tearDown() 
	{
		driver.quit();
	}


}
