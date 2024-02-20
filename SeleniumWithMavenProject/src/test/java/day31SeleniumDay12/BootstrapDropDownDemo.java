package day31SeleniumDay12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDownDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//to select one item
		driver.findElement(By.xpath("//input[@value='Python']")).click();
		List<WebElement> items = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("No: of items in dropdown ====> "+items.size());
		
		for(WebElement item:items) 
		{
			System.out.println(item.getText());
		}
		for (WebElement item:items) 
		{
			String itemtext=item.getText();
			if(itemtext.equals("Java")||itemtext.equals("Bootstrap"))
			{
				item.click();
			}
			
			
		}
	}

}
