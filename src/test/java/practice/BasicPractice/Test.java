package practice.BasicPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		
		
		/*handling the auto suggestion search feild of amazon website
		storing all the result into a list and then iterating the list and pick one item 
		on them*/
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	List<WebElement> searchList =	driver.findElements(By.className("s-suggestion-container"));
	
	for(int i=0;i<searchList.size()-1;i++) {
		//System.out.println(searchList.get(i).getText());
		
		if(searchList.get(i).getText().equalsIgnoreCase("mobile under 15000")) {
			searchList.get(i).click();
			break;
		}
	}
		
	driver.quit();
		}
		
	}


