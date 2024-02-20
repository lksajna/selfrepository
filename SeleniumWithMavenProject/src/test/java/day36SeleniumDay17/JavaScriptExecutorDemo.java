package day36SeleniumDay17;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//inputbox
		WebElement inputbox = driver.findElement("//input[@id='name']");
		js.executeScript("arguments[0].setAttribute('value','john')", inputbox);
		
		//radioButton
		WebElement male_rd_btn = driver.findElement("//input[@id='male']");
		js.executeScript("arguments[0].click()", male_rd_btn);
		
		//Checkbox
		WebElement chk_box = driver.findElement("");
		js.executeScript("arguments[0].click()", chk_box);
		
		

	}

}
