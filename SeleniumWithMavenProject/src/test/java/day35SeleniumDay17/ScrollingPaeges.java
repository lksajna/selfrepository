package day35SeleniumDay17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPaeges {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//ChromeDriver driver=new ChromeDriver();
		//JavascriptExecutor js=driver;
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		//to scroll to particular index of page
		//js.executeScript("window.scrollBy(0,3000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//to scroll to a particular element of page
		//WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		//js.executeScript("arguments[0].scrollIntoView();", flag);
		
		//to scroll to bottom of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		//to scroll to top of page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}

}
