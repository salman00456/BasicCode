package multiplewindowhandles;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandleTest {
	
	@Test
	public void windowHandle() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window Id "+ parentWindow);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle:handles) {
			
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				
				driver.findElement(By.id("firstName")).sendKeys("salman");
				
				driver.close();
			}else {
				
				driver.switchTo().window(parentWindow);
				driver.findElement(By.id("name")).sendKeys("Tutorials");
			}
			
		}
		
		
		
		
		
	}

}
