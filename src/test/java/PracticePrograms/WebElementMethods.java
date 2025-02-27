package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public WebElementMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement SearchTF = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		SearchTF.sendKeys("Jeans for men");
		String Login = driver.findElement(By.id("container")).getCssValue("font-size");
		System.out.println(Login);
		driver.quit();
		
	}

}
