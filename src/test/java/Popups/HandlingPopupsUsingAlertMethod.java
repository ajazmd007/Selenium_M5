package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupsUsingAlertMethod {

	public HandlingPopupsUsingAlertMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Handle alert popup and click on ok button
		driver.switchTo().alert().accept();
		
		//verify success message
		WebElement result = driver.findElement(By.id("result"));
		
		if(result.getText().contains("You successfully clicked an alert"))
		{
			System.out.println("Alert popup unhandled");
		}
		else {
			System.out.println("Alert popup unhandled");
		}
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.quit();
	}

}
