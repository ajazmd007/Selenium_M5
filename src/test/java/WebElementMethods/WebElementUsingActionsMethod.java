package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementUsingActionsMethod {

	public WebElementUsingActionsMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		// Identify search TF and pass the text
		WebElement sTF= driver.findElement(By.id("small-searchterms"));
		sTF.sendKeys("Shoes");
		Thread.sleep(3000);
		
		//clear the text
		sTF.clear();
		Thread.sleep(3000);
		
		//pass the text
		sTF.sendKeys("mobiles");
		Thread.sleep(3000);
		
		// Identify search button and click on it
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(3000);
		
		//Click on register link
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
