package day29SeleniumDay10;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day29Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Hello my name is ...");
		driver.switchTo().alert().accept();
	}

}
