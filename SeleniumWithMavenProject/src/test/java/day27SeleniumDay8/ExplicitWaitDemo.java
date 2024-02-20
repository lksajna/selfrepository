package day27SeleniumDay8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));//declaration
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtUsername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		txtUsername.sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		WebElement txtPassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		txtPassword.sendKeys("admin123");

		WebElement btnLogin = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		btnLogin.click();
	}

}
