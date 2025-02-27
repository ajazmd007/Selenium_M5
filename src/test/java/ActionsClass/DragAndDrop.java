package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public DragAndDrop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement element1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement targetloc1 = driver.findElement(By.id("amt7"));
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement targetloc2 = driver.findElement(By.id("amt8"));
		
		WebElement element3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement targetlocbank = driver.findElement(By.id("bank"));
		
		WebElement element4 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement targetloan = driver.findElement(By.id("loan"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(element1, targetloc1).perform();
		Thread.sleep(3000);
		act.dragAndDrop(element2, targetloc2).perform();
		Thread.sleep(3000);
		act.dragAndDrop(element3, targetlocbank).perform();
		Thread.sleep(3000);
		act.dragAndDrop(element4, targetloan).perform();
		Thread.sleep(3000);
		
		WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		if(perfect.isDisplayed()) {
			System.out.println("Test perfect!");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.quit();
	
	}

}
