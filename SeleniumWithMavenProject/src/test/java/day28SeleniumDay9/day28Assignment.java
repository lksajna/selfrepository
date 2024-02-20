package day28SeleniumDay9;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day28Assignment {

	public static void main(String[] args) {
	
//		https://testautomationpractice.blogspot.com/
//		1) provide some string search for it
//		2) count number of links
//		3) click on each link using for loop
//		4) get window ID's for every browser window
//		5) close specific browser window
		System.out.println("Enter the text you want to search ---> ");
		Scanner sc= new Scanner(System.in);
		String searchkey= sc.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys(searchkey);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> searchResults = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		System.out.println("Number of links in search results -----> "+searchResults.size());
		for(WebElement eachsearchResult:searchResults)
		{
			//driver.findElement(By.xpath("//div[@id='wikipedia-search-result-link']/a")).click();
			System.out.println(eachsearchResult.getText());
			eachsearchResult.click();
		}
		System.out.println("------Listing Titles of each Links-------");
		Set<String> winIds=driver.getWindowHandles();
		for(String winId: winIds) 
		{
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println(title);	
		}
		driver.quit();
		
	}

}
