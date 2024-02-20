package day28SeleniumDay9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://demo.opencart.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.getCurrentUrl();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 Set<String> WindowIds=driver.getWindowHandles();
		 for(String WinId:WindowIds)
			{
				System.out.println("Window ID ------"+WinId);
				System.out.println( driver.getCurrentUrl());
			}
	
	}

}
