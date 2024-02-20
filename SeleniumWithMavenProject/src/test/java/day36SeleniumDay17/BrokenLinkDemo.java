package day36SeleniumDay17;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement linkElement: links) 
		{
			String hrefAttributeValue = linkElement.getAttribute("href");
			if(hrefAttributeValue==null || hrefAttributeValue.isEmpty()) {
				System.out.println("Href attribute value is null or empty.So not possible to check broken link");
				continue;
			} try {
			URL linkUrl;
			
				linkUrl = new URL(hrefAttributeValue);
			 
			HttpURLConnection conn = (HttpURLConnection)linkUrl.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefAttributeValue+"=======Broken Link");
			}
			else {
				System.out.println(hrefAttributeValue+"=======Not Broken Link");
			}
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	}}
