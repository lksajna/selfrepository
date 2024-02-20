package day22SeleniumDay3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day22Seleniumday3 {

	public static void main(String[] args) {
//		Open application "https://www.demoblaze.com/index.html"
//
//		1) Total number of links & print them
//		2) Total number of images
//		3) Click on Any product link using linkText /partialLinkText
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println("The number of links is " + links.size());
	     for(WebElement link:links) {
	    	 System.out.println(link.getText());
	     }
	     List<WebElement> img = driver.findElements(By.tagName("img"));
	     System.out.println("The number of images is " + img.size());
	     driver.findElement(By.linkText("Samsung galaxy s6")).click();
	      driver.close();
		

	}

}
