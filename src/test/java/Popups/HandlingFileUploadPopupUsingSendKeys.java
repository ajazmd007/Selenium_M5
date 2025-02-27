package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopupUsingSendKeys {

	public HandlingFileUploadPopupUsingSendKeys() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Handling File upload pop up using Send keys
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\ACER\\Desktop\\ajaz.txt");
		Thread.sleep(3000);
		
		//Clicking on Upload
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
