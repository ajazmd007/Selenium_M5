package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationAndPromptPopup {

	public HandlingConfirmationAndPromptPopup() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Handle confirmation pop ups
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.id("result"));
		if(result.getText().contains("You successfully clicked an alert"))
		{
			System.out.println("Alert popup unhandled");
		}
		else {
			System.out.println("Alert popup unhandled");
		}
		//Handling Prompt Pop ups
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(al.getText());
		al.sendKeys("selenium");
		Thread.sleep(3000);
		al.accept();
		
		//Verifying success message
		if(result.getText().contains("You entered: selenium"))
		{
			System.out.println("Alert PROMPT popup handled");
		}
		else {
			System.out.println("Alert PROMPT popup unhandled");
		}
		
		
	}

}
