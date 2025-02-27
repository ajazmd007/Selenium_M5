package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentGuru99 {

	public AssignmentGuru99() {
		// TODO Auto-generated constructor stub
	}

	//Changes made in this script
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act= new Actions(driver);
		act.contextClick(click).perform();
		driver.navigate().refresh();
		Thread.sleep(3000);
		 WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 act.doubleClick(DoubleClick).perform();
		 Thread.sleep(3000); 
	    driver.quit();	
	
	}
	
}
