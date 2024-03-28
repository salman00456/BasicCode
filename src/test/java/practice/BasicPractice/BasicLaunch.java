package practice.BasicPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasicLaunch {
	
	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		Actions act = new Actions(driver);
		
		//WebElement widegts = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		//act.moveToElement(widegts).perform();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	driver.findElement(By.xpath("//a[text()=' Accordion ']")).click();
		
		
	/*	WebElement frame = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		act.moveToElement(frame).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("dsdsdsd");
		
		*/
		
		//act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("T")).keyUp(Keys.CONTROL).build().perform();
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		//open new tab with given URL
		((JavascriptExecutor)driver).executeScript("window.open('https://www.youtube.com/','_blank')");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
