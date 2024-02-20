package day26SeleniumDay7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//get title of the web page
		System.out.println("Title of the Webpage ---> "+driver.getTitle());
		
		//get CurrentURL of the web page
		System.out.println("Current URL ---> "+driver.getCurrentUrl());
		
		System.out.println("Page Source ----------"+driver.getPageSource());
		
		System.out.println("Window ID ---> "+driver.getWindowHandle());
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> WinIds = driver.getWindowHandles();
		for(String WinId:WinIds)
		{
			System.out.println("Window ID ------"+WinId);
		}
	}

}
