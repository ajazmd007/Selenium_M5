package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreensshotOfWebElement {

	public ScreensshotOfWebElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, InterruptedException {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.swiggy.com/restaurants");
		Thread.sleep(3000);
		//Taking Screenshot of WebElement
		WebElement swiggyicon = driver.findElement(By.xpath("//*[name()='svg'][@width='49']"));
		File src= swiggyicon.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshot/swiggy.png");
		FileUtils.copyFile(src, dest);
		
		driver.quit();
		
		
	}

}
