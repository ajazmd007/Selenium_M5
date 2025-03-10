package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssValueMethod {

	public UsingCssValueMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.linkText("Register"));
		
		System.out.println(register.getCssValue("padding-left"));
		
		driver.quit();
	}

}
