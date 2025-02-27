package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBAccountCreating {

	public FBAccountCreating() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("123456");
		driver.findElement(By.id("pass")).sendKeys("2356");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		driver.quit(); 
		
	}

}
