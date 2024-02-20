package day23SeleniumDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("input[name=q]")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");	
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-Shirts");	
		
	}

}
