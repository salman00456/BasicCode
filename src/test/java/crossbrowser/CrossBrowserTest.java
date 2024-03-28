package crossbrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	 
	@Parameters({"browser"})
	@Test
	public void openBrowser(String b) {
		
	/*	Properties prop = new Properties();
		File fo = new File("config.proprties");
		FileInputStream fis = new FileInputStream(fo);
		prop.load(fis);
		*/
		
		
		String browserName= b;
		WebDriver driver= null;
	
		if(browserName.equals("chrome")) {
			
			driver= new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			
			System.out.println("Enter corecct driver");
		}
		
		driver.get("https://www.google.co.in/");
		
	}

}
