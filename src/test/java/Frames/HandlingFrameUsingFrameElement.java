package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrameUsingFrameElement {

	public HandlingFrameUsingFrameElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		WebElement SignIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions act= new Actions(driver);
		act.moveToElement(SignIn).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(3000);

		//Switch into frame using Frame element or webelement
		WebElement frameelement = driver.findElement(By.id("loginIframe"));
		Thread.sleep(3000);

		driver.switchTo().frame(frameelement);
		Thread.sleep(3000);

		
		driver.findElement(By.id("userName")).sendKeys("1234567890");
		Thread.sleep(3000);

		driver.findElement(By.id("close-pop")).click();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		driver.findElement(By.id("inputValEnter")).sendKeys("mobile"+Keys.ENTER);
		Thread.sleep(3000);

		driver.quit();

	}

}
