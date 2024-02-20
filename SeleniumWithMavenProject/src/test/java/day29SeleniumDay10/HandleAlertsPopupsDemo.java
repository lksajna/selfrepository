package day29SeleniumDay10;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsPopupsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//normal alert - having only Ok button
		/*driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		driver.switchTo().alert().accept();
		*/
		
		//Confirmation Alert - having both Ok and Cancel buttons
		/*
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		*/
		
		//Prompt Alert - have Ok and Cancel along with inputbox

		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Welcome");
		alert.accept();
		
	}

}
