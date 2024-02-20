package day28SeleniumDay9;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethodsDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		//Approach 1
		//driver.navigate().to("https://demo.opencart.com/");
		
		//Approach 2
		//URL myurl=new URL("https://demo.opencart.com/");
		//driver.navigate().to(myurl);
		driver.navigate().to("https://demo.opencart.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.orangehrm.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());//navigates to opencart
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());//navigates to orangehrm
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		
		}

}
