package Assertions;

import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {
	
	//Changes done in this script
	//Changes done in eclipse
	//Changes done in git hub
	//Changes done in eclipse again
	@Test 
	public void HardAssert()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		@Nullable
		String title = driver.getTitle();
		
		//Hard Assert
		Assert.assertEquals(title, "Facebook – log in or sign up");
		//Assert.assert.assertNotEquals(driver, title)
		boolean condition = driver.getTitle().contains("Facebook – log in or sign up");
		Assert.assertTrue(condition);
		//Assert.assertFalse(condition);
		//Assert.fail();
		System.out.println("Verification Passed");
		
		driver.quit();
	}

}
