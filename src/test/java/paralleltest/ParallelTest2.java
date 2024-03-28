package paralleltest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import practice.BasicPractice.BaseTest;

public class ParallelTest2 extends BaseTest{
	
	@Test
	public void Test2() {
		thread.get().get("https://www.google.com/");
		thread.get().manage().window().maximize();
		thread.get().findElement(By.name("q")).sendKeys("Naveen Automation lab");
		System.out.println("Getting thread count of ParallelTEst1 :"+ Thread.currentThread().getId());

	}


}
