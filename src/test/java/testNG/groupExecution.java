package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupExecution {

	@Test(groups = "smoke")
	public void java()
	{
		Reporter.log("java",true);
		
	}
	
	@Test(groups = "smoke")
	public void manual()
	{
		Reporter.log("manual",true);
	}
	
	@Test(groups = "regression")
	public void selenium()
	{
		Reporter.log("selenium",true);
	}
	//if u want to include smoke group then in XML mention it under suite as <include name= "smoke"></include>
	
}
