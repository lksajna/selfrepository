package day34SeleniumDay16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		WebElement banksrc=driver.findElement(By.xpath("//ul/li[@id='credit2']/a"));
		WebElement bankdes=driver.findElement(By.xpath("//ol[@id='bank']/li"));
		WebElement amt1src=driver.findElement(By.xpath("//ul/li[@id='credit1']/a"));
		WebElement amt1des=driver.findElement(By.xpath("//ul/li[@id='loan']/li"));
	
		act.dragAndDrop(amt1src, amt1des).build().perform();
		act.dragAndDrop(banksrc, bankdes).build().perform();
		
		if(driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")).isDisplayed())							
     	{		
         	System.out.println("Perfect Displayed !!!");					
     	}
		else
     	{
        	System.out.println("Perfect not Displayed !!!");					
     	}
		
	}

}
