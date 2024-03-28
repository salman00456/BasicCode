package multiplewindowhandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingMultipleWindow {
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindow = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		
		Set<String> handle = driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(handle);
		if(switchToRightWindow("Facebook", hlist)) {
			System.out.println(driver.getCurrentUrl()+"----"+driver.getTitle());
		}
		
		switchToParentWindow(parentWindow);
		closeAllWIndow(hlist, parentWindow);

	
	}
	
	public static void closeAllWIndow(List<String>hlist,String parentWindow) {
	
		for(String e:hlist) {
			if(!e.equals(parentWindow)) {
				driver.switchTo().window(e).close();
			}
		}
	}
	
	public static void switchToParentWindow(String parentWindow) {
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl()+"----"+driver.getTitle());
		
		
	}
	public static boolean switchToRightWindow(String windowTitle, List<String> hlist) {
		
		for(String e:hlist) {
		String tittle	= driver.switchTo().window(e).getTitle();
		if(tittle.contains(windowTitle)) {
			System.out.println("Right window if found");
			return true;
		}
		}
		return false;
	}
	
	

}
