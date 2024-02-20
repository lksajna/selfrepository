package day31SeleniumDay12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropDownsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drpdwnCountryElement = driver.findElement(By.id("country"));
		Select drpCountry = new Select(drpdwnCountryElement);
		
		//drpCountry.selectByVisibleText("Germany");
		//drpCountry.selectByValue("germany");
		drpCountry.selectByIndex(5);
		
		List<WebElement> options = drpCountry.getOptions();
		System.out.println("No: of items in drop down"+options.size());
		
		
		 // Method 1
		 /*
		 for(int i=0;i<options.size();i++)
		  {
			System.out.println(options.get(i).getText());
	       }
		 */
		//Method2
		for(WebElement option:options) 
		{
			System.out.println(option.getText());
		}

	}

}
