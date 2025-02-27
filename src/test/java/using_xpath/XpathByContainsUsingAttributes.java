package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsUsingAttributes {

	public XpathByContainsUsingAttributes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		       // Launch the browser
				WebDriver driver= new ChromeDriver();
				
				// Maximize the window
				driver.manage().window().maximize();
				
				// Navigate to an application
				driver.get("https://www.amazon.in/");
				
				// Identify the search TF
				driver.findElement(By.xpath("//input[conatins(@placeholder, 'search Amazon.in')]")) .sendKeys("shoes");
				
				//Identify the search button and click
				driver.findElement(By.xpath("//input[conatins(@type, 'submit')]")).click();
				
	}

}
