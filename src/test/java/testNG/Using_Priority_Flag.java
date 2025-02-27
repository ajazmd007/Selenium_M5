package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Priority_Flag{
	
	@Test(priority = 3)

	public void Apple()
	{
		Reporter.log("Test Started",true);
		
	}

	@Test(priority = 1)
	
	public void Mango() 
	{
		Reporter.log("Start Eating", true);
	}
	
	@Test(priority = 2)
	public void Donkey() 
	{
		Reporter.log("Test Ended", true);
	}
}
