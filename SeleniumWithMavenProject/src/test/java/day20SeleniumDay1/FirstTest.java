package day20SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String Actual_Title = driver.getTitle();
		if(Actual_Title.equals("Your Store"))
		{
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.quit();

	}

}
