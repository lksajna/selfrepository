package day30SeleniumDay11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");//https://ui.vision/demo/webtest/frames/
		
		//frame1
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		
		//frame2 packageFrame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath(" //span[normalize-space()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		
		//frame3 
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[text()='Index']")).click();
		driver.switchTo().defaultContent();
	}

}
