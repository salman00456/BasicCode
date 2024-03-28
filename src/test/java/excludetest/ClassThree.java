package excludetest;

import org.testng.annotations.Test;

public class ClassThree {
	
	
	@Test
	public void testOne() {
		
		System.out.println("Executing testOne in ClassThree");
	}
	@Test
public void testTwo() {
		
		System.out.println("Executing testTwo in ClassThree");
	}

	@Test(groups = {"smoke"})
public void testThree() {
	
	System.out.println("Executing testThree in ClassThree");
}

}
