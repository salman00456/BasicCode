package paralleltest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import practice.BasicPractice.BaseTest;

public class ParallelTest1 extends BaseTest {
	
	@Test
	public void Test1() {
		
		
thread.get().get("https://demo.automationtesting.in/Windows.html");
thread.get().manage().window().maximize();
		
		/*Actions act = new Actions(driver);
		
		
		WebElement frame = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		act.moveToElement(frame).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("dsdsdsd");
		*/
		System.out.println("Getting thread count of ParallelTEst1 :"+ Thread.currentThread().getId());
		
	}
	
	
}
