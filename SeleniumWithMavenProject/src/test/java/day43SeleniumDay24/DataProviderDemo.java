package day43SeleniumDay24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@BeforeClass
	void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="dp")
	void testLogin(String email,String pwd) throws InterruptedException 
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(3000);
		String exp_title="nopCommerce demo store";
		String act_title=driver.getTitle();
		Assert.assertEquals(exp_title, act_title);
	
	}
	@AfterClass
	void tearDown() 
	{
		driver.quit();
	}
	@DataProvider(name="dp")
	Object[][] loginData()
	{
		Object data[][] = {{"sr@gmail.com","123456"},{"sr1122@gmail.com","11221122"},{"sr112233@gmail.com","112233112233"}};
		return data;
	}
	
}
