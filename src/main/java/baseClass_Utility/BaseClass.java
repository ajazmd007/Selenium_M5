package baseClass_Utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite()
	public void BS()
	{
	System.out.println("Connect to Data Base");
	}
	
	@AfterSuite()
	public void AS()
	{
		System.out.println("Disconnect to Data Base");
	}
	
	@BeforeTest()
	public void BT()
	{
		System.out.println("Parallel Execution");
	}
	
	@AfterTest()
	public void AT()
	{
		System.out.println("Close Parallel Execution");
	}
	
	@BeforeClass()
	public void BC()
	{
		System.out.println("Open the Browser");
	}
	
	@AfterClass()
	public void AC()
	{
		System.out.println("Close the Browser");
	}
	
	@BeforeMethod()
	public void BM()
	{
		System.out.println("Login");
	}	
	
	@AfterMethod()
	public void AM()
	{
		System.out.println("Logout");
	}
}
