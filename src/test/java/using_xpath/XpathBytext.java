package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBytext {

	public XpathBytext() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		 // Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage() .window() .maximize();
		
		// Navigate to the FB application 
		driver.get("https://www.facebook.com/");

		
		// Identify the user name text field, //*[@id="email"]
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("username");
		
		// Identify the password text field
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		
		
		// Identify the login button
		 
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

}
