package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public HandlingMultipleWindows() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("mensProd")).click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='featuredProducts_cardBody__l4gLE'])[1]")).click();
		driver.navigate().refresh();
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
	}

}
