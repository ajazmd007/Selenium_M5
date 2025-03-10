package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public HandlingScrollBar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		//typecast JSexecuter with driver
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//1. Using Hard coded coordinate
		js.executeScript("window.scrollBy(0,800)");

		driver.quit();
		
	}

}
