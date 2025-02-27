package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelectorDemoApp {

	public UsingCssSelectorDemoApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
  
		// Launch the browser
		WebDriver driver= new ChromeDriver();
		
		// Maximize the web page
		driver .manage() .window() .maximize();
		
		// Navigate to the demo application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
	     
		// Identify the User Name text field and pass the text
		driver.findElement(By.id("name")).sendKeys("ajaz");
		
		// Identify the  EmailID text field and pass the text
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("ajaz.y@yahoo.com");
		
		// Identify the  Password text field and pass the text
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("ajaz1234");
		
		// Identify the Register button and click on it
	
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
	
		// Identify the Email ID text field and pass the text
		driver.findElement(By.id("email")).sendKeys("ajaz.y@yahoo.com");
				
		// Identify the  Pass word text field and pass the text
		driver.findElement(By.id("password")).sendKeys("ajaz1234");
				
		// Identify the Login button and click on it
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		// Identify the button element and click 
				
	}
}
