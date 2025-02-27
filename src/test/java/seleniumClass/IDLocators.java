package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocators {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage() .window() .maximize();
		
		// Navigate to the FB application 
		driver.get("https://www.facebook.com/");
		
		// Identify the user name text field
		WebElement user = driver.findElement(By.id("email"));
		
		// pass the text in username textfield
		user.sendKeys("username");
		
		// Identify the password textfield
		WebElement pass = driver.findElement(By.id("pass"));
		
		// pass the text in the password text field
		pass.sendKeys("password");
		
		// Identify the login button
		WebElement login = driver.findElement(By.name("login"));
				
		// click on login button
		login.click();
	}

}
