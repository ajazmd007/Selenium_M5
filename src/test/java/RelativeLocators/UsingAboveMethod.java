package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.devtools.v128.page.model.RelatedApplication;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingAboveMethod {

	public UsingAboveMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement pswd=  driver.findElement(By.id("pass"));
		
		WebElement user= driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd));
		user.sendKeys("username");
		pswd.sendKeys("password");
		WebElement btn= driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd));
		btn.click();
		
		
		
	}

}
