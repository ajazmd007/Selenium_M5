package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupIndexing {

	public XpathByGroupIndexing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		 // Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage() .window() .maximize();
		
		// Navigate to the FB application 
		driver.get("https://demowebshop.tricentis.com/");

		
		// Identify the user name text field, //*[@id="email"]
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sel");
		
	}

}
