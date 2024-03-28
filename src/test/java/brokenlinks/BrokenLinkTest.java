package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrokenLinkTest {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		// find all the links available on the web page
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
		//now we have to iterate the all the links
		
		for(WebElement link:links) {
			
			String url = link.getAttribute("href");
			
			if(url==null|| url.isEmpty()) {
				System.out.println(url+"--is empty");
				continue;
			}
			
			HttpURLConnection huc =(HttpURLConnection)(new URL(url).openConnection());
			huc.connect();
			
			if(huc.getResponseCode()>=400) {
				
				System.out.println(url+" is broken.");
			}else
				System.out.println(url+"is valid");
			
		}
		
		
	}

}
