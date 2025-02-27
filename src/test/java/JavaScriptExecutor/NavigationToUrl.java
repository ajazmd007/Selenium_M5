package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationToUrl {

	public NavigationToUrl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js= (JavascriptExecutor)driver;

		//Navigation to URL
		js.executeScript("window.location=arguments[0]","https://demoapp.skillrary.com/");
		driver.quit();
	}

}
