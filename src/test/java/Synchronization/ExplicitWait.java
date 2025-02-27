package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public ExplicitWait() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		
		driver.get("https://www.shoppersstack.com/");
		
		//creating instance of webdriver wait
		WebElement login = driver.findElement(By.id("loginBtn"));

		//Verify whether the login button is displayed
		wait.until(ExpectedConditions.visibilityOf(login));
		
		//Verify whether the login button is clickable
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	
	}

}
