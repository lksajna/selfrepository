package day21SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBaze_LoginTest {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoblaze.com/index.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("login2")).click();
	driver.findElement(By.id("loginusername")).sendKeys("slk");
	driver.findElement(By.id("loginpassword")).sendKeys("slk1");
	driver.findElement(By.xpath("//*[@id=\'logInModal\']/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
	boolean status = driver.findElement(By.id("logout2")).isDisplayed();//logout2
	System.out.println(status);
	if(status==true) 
	{
	System.out.println("Login success");	
	}
	else {
		System.out.println("Login failed");	
	}
	String username = driver.findElement(By.id("nameofuser")).getText();
	if(username.contains("slk"))
	{
		System.out.println("Test Passed - Username displayed");
		}
	else 
	{
		System.out.println("Test Failed - Username not displayed");	
	}
	driver.quit();
	}

}
