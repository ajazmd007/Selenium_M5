package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderPopup {

	
	public HandlingCalenderPopup() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		//HANDLING CALANEDER POP UPS.
		//Identify the close button on web element and click on it.
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		//Identify the Round trip radio button  web element and click on it.
		driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
		
		//Identify the from date web element and click on it.
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hyd");
		driver.findElement(By.xpath("(//p[contains(text(),'Hyd')])[1]")).click();
		Thread.sleep(5000);
		
		//Identify the To date web element and click on it.
		driver.findElement(By.id("toCity")).sendKeys("Benga");
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		Thread.sleep(5000);

		//Identify date on the web page,select the date and click on it
		WebElement date = driver.findElement(By.xpath("//div[text()='January']/../../descendant::p[text()='23']"));
		date.click();
		Thread.sleep(5000);
		
		//Identifying to date on the web page an click on it
		WebElement date1 = driver.findElement(By.xpath("//div[text()='February']/../../descendant::p[text()='20']"));
		date1.click();
		Thread.sleep(5000);

		//Identifying search button and click on it.
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(5000);

		driver.quit();
		
	}

}
