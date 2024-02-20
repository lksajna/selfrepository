package nopCommerceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLearning {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MAC");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("BOOK");
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mac");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("book");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Mac");
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("Book");
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MaC");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("BooK");

	}

}
