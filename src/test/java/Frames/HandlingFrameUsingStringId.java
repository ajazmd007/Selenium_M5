package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameUsingStringId{
	public HandlingFrameUsingStringId() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/");
		
		
		driver.findElement(By.linkText("Log in")).click();
		
		//Switch the driver control to the frame using ID
		driver.switchTo().frame("auth-login-ui");
		
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567890");
		
		//click on the close button
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		//switch back the driver control to main page 
		
		driver.switchTo().defaultContent();
		//switch back the driver control to previous web page
		Thread.sleep(3000);
	
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	
}
