package day29SeleniumDay10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//select checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();

		//select all checkbox
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("No: of checkboxes  ---> "+chkboxes.size());
		/*
		 for(WebElement chkbox:chkboxes) {
			chkbox.click();
		}
		for(int i=4;i<chkboxes.size();i++)
		{
			chkboxes.get(i).click();
		}
		*/
		//start index = total no: of checkboxes-how many chkboxes want to select
		for(int i=0;i<3;i++)
		{
			chkboxes.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0;i<chkboxes.size();i++)
		{
			if(chkboxes.get(i).isSelected()) {
				chkboxes.get(i).click();
			}
		}
	}

}
