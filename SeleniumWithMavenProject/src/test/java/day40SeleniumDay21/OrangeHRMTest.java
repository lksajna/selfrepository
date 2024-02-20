package day40SeleniumDay21;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * Launch browser
 * check logo
 * login
 * close app
 * 
 * 
 * */
public class OrangeHRMTest {
	WebDriver driver;
	@Test(priority=1)
	void testOpenApp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	}
	@Test(priority=2)
	void testCheckLogo() 
	{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo display status ===> "+status);
	}
	@Test(priority=3)
	void testLogin()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}
	@Test(priority=4)
	void testLogout()
	{
		driver.close();
	}
}
