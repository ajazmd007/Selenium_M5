package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationIsSelectedMethods {

	public UsingValidationIsSelectedMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement radiobtn = driver.findElement(By.id("pollanswers-2"));
		
		if(radiobtn.isSelected()) {
			System.out.println(radiobtn.isSelected() + ":Element selected successfully");
			}
	
		else {
			System.out.println(radiobtn.isSelected() + ":Element not selected");
		}
		
		driver.quit();
	}

}
