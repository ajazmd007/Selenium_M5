package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingclassnamelocators {

	public static void main(String[] args) {
	//Launch the browser
	  WebDriver driver= new ChromeDriver();
	  
	  //Maximize the window
	  driver.manage().window().maximize();
	  
	  //navigate to web page
	  driver.get("https://www.flipkart.com/");
	  
	  //Enter text in text field
	  driver.findElement(By.className("Pke_EE")).sendKeys("Shoes");
	}
}
