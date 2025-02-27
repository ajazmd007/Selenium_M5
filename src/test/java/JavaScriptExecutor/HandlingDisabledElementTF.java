package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElementTF {

	public HandlingDisabledElementTF() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele= driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",ele,"selenium");
		Thread.sleep(3000);
		driver.quit();
	}

}
