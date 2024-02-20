package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_Login {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin1231");
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(5000);
	String str1=driver.getTitle();
	System.out.println(str1);
	String str2="OrangeHRM";
	if(str1.equals(str2))
	{
		System.out.println("Test Passed");
	}
	else
	{
	System.out.println("Test Failed");
	}
	driver.quit();
}}
