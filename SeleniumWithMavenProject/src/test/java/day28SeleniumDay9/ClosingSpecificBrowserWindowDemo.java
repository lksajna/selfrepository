package day28SeleniumDay9;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindowDemo {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> winIds = driver.getWindowHandles();
		for(String winId : winIds) {
			String title = driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
				System.out.println("This is the parent window");
				driver.close();
			}
		}
	}

}
