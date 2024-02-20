package day22SeleniumDay3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//locator :  name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//locator : id
		//boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);
		
		//locator : linktext and partialLinkText
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//classname - to locate multiple webElements
		//List<WebElement> hearderLinks = driver.findElements(By.className("list-inline-item"));
		//System.out.println("Number of Header Links --->" +hearderLinks.size());
		
		//tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no: of links  ----> " +links.size());
		
		for(WebElement link: links)
		{
			System.out.println(link.getText());
		}
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println("Number of images --> "+image.size());
		//driver.quit();
	}

}
