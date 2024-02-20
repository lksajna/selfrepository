package day37SeleniumDay18;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.nopcommerce.com/");
		
		//capture full page screenshot
		TakeScreenshot ts=(TakesScreenshot)driver;
		ts.getscreenshotAs(OutputType.FILE)
		

	}

}
