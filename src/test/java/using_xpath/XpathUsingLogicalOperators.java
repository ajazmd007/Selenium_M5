package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingLogicalOperators {

	public XpathUsingLogicalOperators() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Using Logical Operators  
	    driver.findElement(By.xpath("//input[@type='text' and  @id='email']")).sendKeys("user");

	    driver.findElement(By.xpath("//input[@type='pass' or @id='pass']")).sendKeys("password");
	    driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).click();

		
	}

}
