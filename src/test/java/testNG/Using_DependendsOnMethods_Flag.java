package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_DependendsOnMethods_Flag {
	
	@Test(dependsOnMethods = "Register")
	public void login()
	{
		Reporter.log("Login",true);
	}

	@Test
	public void Register()
	{
		Reporter.log("Register",true);
		//Assert.fail();
	}
	
	@Test(dependsOnMethods = "login")
	public void Create()
	{
		Reporter.log("Create",true);
	}	
}

