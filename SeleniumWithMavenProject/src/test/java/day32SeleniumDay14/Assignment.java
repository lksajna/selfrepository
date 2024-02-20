package day32SeleniumDay14;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Boston");
		driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("London");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("No: of rows retrieved = "+rows);
		String pricesArr[]=new String[rows];
		for(int r=1;r<=rows;r++) 
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			pricesArr[r-1]=price;
			//System.out.println(pricesArr[r-1]);
			
		}
		for(String arrvalue:pricesArr) 
		{
			System.out.println(arrvalue);
			
		}
		Arrays.sort(pricesArr);
		String lowestprice=pricesArr[0];
		System.out.println("Lowest price - "+lowestprice);
		for(int r=1;r<=rows;r++) 
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]/td[6]")).getText();
			if(price.equals(lowestprice)) 
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
				break;
			}
		}
		
		driver.findElement(By.id("inputName")).sendKeys("ss");
		driver.findElement(By.id("address")).sendKeys("1cffgfg");
		driver.findElement(By.id("city")).sendKeys("fdgfdgd");
		driver.findElement(By.id("state")).sendKeys("dgdf");
		driver.findElement(By.id("zipCode")).sendKeys("2342");
		driver.findElement(By.id("creditCardNumber")).sendKeys("24343234");
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.id("creditCardYear")).sendKeys("3423");
		driver.findElement(By.id("nameOnCard")).sendKeys("sddff");
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
	
String msg=driver.findElement(By.xpath("//h1")).getText();
if(msg.contains("Thank you for your purchase"))
{
	System.out.println("Success !! Passed");
}
else
{
	System.out.println("Failed");	
}

driver.quit();
}
}