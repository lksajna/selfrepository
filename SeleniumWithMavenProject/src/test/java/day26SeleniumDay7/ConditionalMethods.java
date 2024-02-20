package day26SeleniumDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Status o f logo"+status);
		
		//isEnabled
		boolean SearchBtnstatus =driver.findElement(By.id("small-searchterms")).isEnabled();
		System.out.println("Status o f logo"+SearchBtnstatus);
		
		//isSelected
		WebElement male_rd_btn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd_btn = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection ------");
		System.out.println(male_rd_btn.isSelected());
		System.out.println(female_rd_btn.isSelected());
		
		male_rd_btn.click();
		System.out.println("After Selecting male radio btn ------");
		System.out.println(male_rd_btn.isSelected());
		System.out.println(female_rd_btn.isSelected());
	}

}
