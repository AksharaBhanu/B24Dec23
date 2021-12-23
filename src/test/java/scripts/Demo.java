package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class Demo extends BaseTest{
	
	@Test
	public void testA(){

		Reporter.log("testA",true);
		
	}

}
