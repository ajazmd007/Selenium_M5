package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public ScrollToElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.linkText("Help"));
		Actions act= new Actions(driver);
		act.scrollToElement(ele).perform();
		driver.quit();
		
	}

}
