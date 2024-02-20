package day28SeleniumDay9;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindowsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> winIds = driver.getWindowHandles();
		
		//Approach 1 - THis method is used if we have two or three WindowIds
		/*
		List<String> winIdList=new ArrayList(winIds);
		
		System.out.println(winIdList.get(0));
		String parentWinId = winIdList.get(0);
		String childWinID = winIdList.get(1);
	
		System.out.println("Parent Window ID ===== "+driver.getTitle());
		driver.switchTo().window(childWinID);
		System.out.println("Child Window ID ===== "+driver.getTitle());
		//parentWinId
		driver.switchTo().window(parentWinId);
		System.out.println("Parent Window ID ===== "+driver.getTitle());
		 */
		
		//Approach 2 - using looping statements
		for(String winId : winIds) {
			String title = driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
				System.out.println("This is the parent window");
			}
			if(title.contains("OrangeHRM HR Software")) {
				System.out.println(driver.getCurrentUrl());
				System.out.println("This is the child window");
			}
		}
	}

}
