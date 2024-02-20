package day32SeleniumDay14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Find no: of rows
		//List<WebElements> rows= driver.findElements(By.xpath(null))
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total no: of rows -----> "+rows);
		//find no: of columns
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total no: of cloumns -----> "+cols);
		
		//read all data from table
		/*
		 * for(int r=2;r<=rows;r++) 
		{
			for(int c=1;c<=cols;c++) 
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		*/
		//Print books with author ='Mukesh'
		/*
		 * for(int r=2;r<=rows;r++) 
		
		{
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			if(authorname.equalsIgnoreCase("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.print(bookname+"\t");
			}
		}
		 */
		//Find the total price of all books
		int total=0;
		for(int r=2;r<=rows;r++)
			{
			
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
				total=total+Integer.parseInt(price);
				//System.out.println(price);
			
			}System.out.println(total);
	}

}
