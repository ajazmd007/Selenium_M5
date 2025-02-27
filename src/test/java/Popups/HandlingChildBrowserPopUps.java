package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserPopUps {

	public HandlingChildBrowserPopUps() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		
		//Fetching parent window Id
		String ParerntWindwId= driver.getWindowHandle();
		//Clicking on the product
		driver.findElement(By.xpath("//div[text()='REDMI 13c 5G (Starlight Black, 128 GB)']")).click();
		//Fetching all the window Ids
		Set<String> AllWindwIds = driver.getWindowHandles();
	
		for(String s:AllWindwIds)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("REDMI 13c 5G (Starlight Black, 128 GB)  (6 GB RAM)\r\n"));
			{
				driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
				System.out.println(driver.getTitle());
				
			}
		}
		driver.switchTo().window(ParerntWindwId);
	}

}
