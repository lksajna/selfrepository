package day20SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day20Seleniumday1{

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	String Actl_title = driver.getTitle();
	if(Actl_title.equals("nopCommerce demo store"))
	{
		System.out.println("Test passed");
	}
	else {
		System.out.println("Test failed");
	}
	driver.quit();

	}

}
