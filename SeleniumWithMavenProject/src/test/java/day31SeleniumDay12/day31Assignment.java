package day31SeleniumDay12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day31Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Assignment1
		/*
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/\n");
		
		WebElement drpdwnCountryElement = driver.findElement(By.name("country"));
		
		Select drpCountry = new Select(drpdwnCountryElement);
		drpCountry.selectByVisibleText("France");
		
		List<WebElement>options = drpCountry.getOptions();
		System.out.println("No: of items in drop down =====> "+options.size());
		
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
		*/
		
		//Assignment 2
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		driver.findElement(By.xpath("//span[text()='PIM']")).click(); 
		
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		
		//
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']/div"));
		System.out.println("No: of options ====> "+options.size());
		
		for(WebElement option:options)
		{
			if(option.getText().equals("Freelance"))
			{
				option.click();
				break;
			}
		}
		
	
	}

}
