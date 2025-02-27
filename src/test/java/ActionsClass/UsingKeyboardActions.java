package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeyboardActions {

	public UsingKeyboardActions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		Actions act= new Actions(driver);
		
		//To type the words in Upper Case we use keyDown and KeyUp
		act.keyDown(Keys.SHIFT).perform();
		email.sendKeys("email");
		act.keyUp(Keys.UP).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
