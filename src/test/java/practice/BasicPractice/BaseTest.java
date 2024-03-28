package practice.BasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static ThreadLocal<WebDriver> thread = new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void setUp() {
		//driver = new ChromeDriver();
	//	thread.set(driver);
		
		 thread.set(new ChromeDriver());
		System.out.println(Thread.currentThread().getId());
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		thread.get().quit();
		//thread.remove();
		System.out.println(Thread.currentThread().getId());

	}
	
	

}
