package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPartialLinkText {

	public UsingPartialLinkText() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// Launch the browser
		WebDriver driver= new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Navigate to an application
		driver.get("https://www.facebook.com/");
		
		// Click on forgotten password link
		driver.findElement(By.partialLinkText("Forgotten")).click();
		}

}
