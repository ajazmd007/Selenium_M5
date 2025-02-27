package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelectors {

	public UsingCssSelectors() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// Launch the browser
				WebDriver driver= new ChromeDriver();
				
				// Maximize the window
				driver.manage().window().maximize();
				
				// Navigate to an application
				driver.get("https://www.facebook.com/");
				
				// identify user text field using CssSelector and pass the text
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("user");
				
				// identify password text field using CssSeclector and pass the text
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
				
				// Identify and click on login Button
				driver.findElement(By.cssSelector("button[value='1']")).click();
				}
}
