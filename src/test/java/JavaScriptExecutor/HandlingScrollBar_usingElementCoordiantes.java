package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar_usingElementCoordiantes {

	public HandlingScrollBar_usingElementCoordiantes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		//2. Handle scroll bar using element coordinates
		//WebElement ele = driver.findElement(By.className("navFooterBackToTopText"));
		//int x = ele.getRect().getX();
		//int y = ele.getRect().getY();
		JavascriptExecutor js= (JavascriptExecutor)driver;

		//js.executeScript("window.scrollBy("+x+","+y+")");

		//3.Handle scroll bar using element reference
		//js.executeScript("arguments[0].scrollIntoView(true)",ele);
		//Thread.sleep(3000);
		
		//4.Scroll till bottom of the web page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
	
		
		//5.Scroll till top of the web page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}