package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingLinkTextLocator {

	public ByUsingLinkTextLocator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize the window
		driver.manage().window() . maximize();
		
		//navigate to an application
		driver.get("https://www.facebook.com/");
		
		//Click on forgotten password link
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}
