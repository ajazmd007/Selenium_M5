package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_ThreadPoolSize_Flag {
	
	@Test(threadPoolSize = 2, invocationCount = 3)
	public void demo()
	{
		Reporter.log("demo",true);
	}

}
