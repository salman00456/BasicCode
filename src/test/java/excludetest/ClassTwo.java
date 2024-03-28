package excludetest;

import org.testng.annotations.Test;

public class ClassTwo {
	
	
	@Test
	public void testOne() {
		
		System.out.println("Executing testOne in ClassTwo");
	}
	@Test(groups = {"smoke"})
public void testTwo() {
		
		System.out.println("Executing testTwo in ClassTwo");
	}

	@Test
public void testThree() {
	
	System.out.println("Executing testThree in ClassTwo");
}

}
