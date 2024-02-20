package day33SeleniumDay15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		//Approach 1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/15/2023");
		
		//Approach2
		String year="2023";
		String month="October";
		String day="21";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectMonthAndYear(driver,month,year);
		selectDate(driver,day);
		
	}
		static void selectMonthAndYear(WebDriver driver, String month,String year)
		{
		//select month and year

		while(true) 
		{
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
 		}
		}
		static void selectDate(WebDriver driver, String day)
		{
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(day)) 
			{
				dt.click();
				break;
			}
		}
		}

}
