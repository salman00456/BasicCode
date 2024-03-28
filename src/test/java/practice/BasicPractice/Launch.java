package practice.BasicPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Launch {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password"));
		driver.findElement(By.xpath("//div[contains(@class,'oxd-form-actions')]//following-sibling::button")).click();
		
		
		String homePage = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		
		Assert.assertEquals(homePage, "Dashboard");
		
		
		
	}

}
