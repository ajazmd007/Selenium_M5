package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Enaled_Flag {

	@Test(enabled= false)
	public void cat()
	{
		Reporter.log("cat",true);
		
	}
	
	@Test
	public void orange()
	{
		Reporter.log("orange",true);
	}
}
