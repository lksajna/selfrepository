package day21SeleniumDay2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class day21Seleniumday2 {

	public static void main(String[] args) throws InterruptedException {
	//1) Launch browser( chrome)
	//2) open URL    https://opensource-demo.orangehrmlive.com/
	//3) Provide username - Admin
	//4) Provide password - admin123
	//5) Click on login button
	//6) Verify dashboard page display
	//7) close browser
		
			WebDriver driver=null;
			try{
		System.out.println("Enter browser name : (Chrome/Safari)");
		Scanner sc=new Scanner(System.in);
		String browserName = sc.next();
		switch(browserName)
		{
		case "Chrome" : 
			
			driver = new ChromeDriver();
			break;
			
		case "Safari":
			//driver = new SafariDriver();
			System.out.println("Safari not setup in this mac");
			break;
			
		default: System.out.println("Invalid Browser");
			}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		boolean dashboardMsg = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed();
		if(dashboardMsg==true) 
		{
			System.out.println("Test Passed - Login Successful");
		}
		else 
		{
			System.out.println("Test Failed - Login Not Successful");
		}
		
		String username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
		if(username.equals("MSK MSK")) 
		{
			System.out.println("Test Passed - Login As "+username);
		}
		else
		{
			System.out.println("Test Failed - Invalid User");
		}
			}
			catch(Exception e) {}
		driver.quit();
	}

}
