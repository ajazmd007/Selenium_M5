package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingSoftAssert {
	
	@Test
	public void SoftAssert()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
	
		String title = driver.getTitle();
		
		//Soft Assert
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(title, "Facebook – log in or sign up");
		//boolean condition = driver.getTitle().contains("Facebook – log in or sign up");
		//soft.assertTrue(condition);
		//soft.assertFalse(condition);

		System.out.println("verifaction passed");
		soft.assertAll();
		driver.quit();
		
	}

}
