package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAtrribute {

	public XpathByAtrribute() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
	
		 // Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage() .window() .maximize();
		
		// Navigate to the FB application 
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		// Identify the user name text field 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username");
		
		// Identify the password text field, 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		
		
		// Identify the login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
