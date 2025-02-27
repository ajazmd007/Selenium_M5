package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public ClickAndHold() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement A = driver.findElement(By.xpath("//li[text()='A']"));
		Actions act= new Actions(driver);
		//Performing Click Actions
		act.clickAndHold(A).perform();
		Thread.sleep(3000);
		act.release(A).perform();
		driver.quit();;
	}

}
