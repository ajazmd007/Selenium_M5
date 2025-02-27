package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAnElement {

	public ClickOnAnElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js= (JavascriptExecutor)driver;

		//Navigation to URL
		js.executeScript("window.location=arguments[0]","https://demoapp.skillrary.com/");
		WebElement login = driver.findElement(By.linkText("LOGIN"));
		
		//Click on an element
		js.executeScript("arguments[0].click()",login);
		Thread.sleep(3000);
		
		//Refresh the web page
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		
		//Fetch the Title
		System.out.println(js.executeScript("return document.title"));
		
		//Fetch the URL
		System.out.println(js.executeScript("return document.URL"));
		
		driver.quit();
	}

}
