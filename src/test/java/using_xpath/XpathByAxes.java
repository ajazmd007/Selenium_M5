package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	
	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		// Fetch the price using Ancestor xpath and print the data on console
		WebElement price= driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 13 (128GB) - Starlight')]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/decendent::span[@class='a-price-whole']"));
		System.out.println(price.getText());
		
		
	}

}
