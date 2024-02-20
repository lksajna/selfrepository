package day31SeleniumDay12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDownDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		//clicking on PIM 
		driver.findElement(By.xpath("//span[text()='PIM']")).click(); 
		//clicking on Dropdown - Job Title	
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]")).click();
				
				//getting all the options
				List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
				
				System.out.println("total number of options:"+options.size());

				for(WebElement option:options)
				{
					if(option.getText().equals("Finance Manager"))
					{
						option.click();
						break;
					}
				}

	}

}
