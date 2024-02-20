package day29SeleniumDay10;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertsUsingExplicitWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Alert alert = mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();

	}

}
