 package practice.BasicPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@Test(dataProvider="getData")
	public void loginTest(String fname, String lname ) {
		
		System.out.println("user logged successfull"+fname+"and lastname is "+lname);
	}
	
	@DataProvider
	public Object[][] getData() {
		
	Object[][] data = new Object[3][2];
	
	data[0][0]="arun";
	data[0][1]="motri";
	
	data[1][0]= "varun";
	data[1][1]= "motri";
	
	data[2][0]= "tarun";
	data[2][1]="motri";
	
	return data;
	
	
		
	}

}
