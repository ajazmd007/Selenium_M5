
package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMouseHovering {

	public UsingMouseHovering() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
		//Mouse hover on the element
		Actions act= new Actions(driver);

		act.moveToElement(electronics).perform();
		Thread.sleep(5000);
		//Click on the element
		driver.findElement(By.linkText("Bluetooth Speakers")).click();
		Thread.sleep(5000);
		driver.quit();
		}

}
