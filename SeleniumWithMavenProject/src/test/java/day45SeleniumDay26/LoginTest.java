package day45SeleniumDay26;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	LoginPageWithPageFactory lp;

	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	void testLogin() throws InterruptedException
	{
		//LoginPage lp = new LoginPage();
		
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	@Test(priority=1)
	void testLinks() 
	{
		lp = new LoginPageWithPageFactory(driver);
		Assert.assertEquals(lp.getNumberOfLinks(), 5);;
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
}
