package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitOnThreeConditions {

	public ExplicitWaitOnThreeConditions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		wait.until(ExpectedConditions.visibilityOf(login));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		wait.until(ExpectedConditions.elementToBeSelected(login));
		driver.quit();
		
		
	}

}
