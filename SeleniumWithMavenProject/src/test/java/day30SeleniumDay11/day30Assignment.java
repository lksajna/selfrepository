package day30SeleniumDay11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day30Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("WelcomeFrame5");
		driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
		//driver.switchTo().frame(0);
		Boolean logodisplay = driver.findElement(By.xpath("//a[@id='logo']")).isDisplayed();
		System.out.println("Logo is displayed (true or false) ---> "+logodisplay);
		driver.switchTo().defaultContent();


	}

}
