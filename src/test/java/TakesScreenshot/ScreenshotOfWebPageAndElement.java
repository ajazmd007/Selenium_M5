package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfWebPageAndElement {

	public ScreenshotOfWebPageAndElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		//Screenshot of a "Web Page"
		//Step 1 TypeCasting the Take screen shot interface
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		//Step 2 Taking the ScreensShot Store SS in a reference variable
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3 Create a new empty file
		File dest= new File("./Screenshot/flipkart.png");
		
		//Step 4 Copy the Screenshot in empty file
		FileUtils.copyFile(src, dest);
		
		
		//Taking Screenshot of WebElement
		WebElement mobile = driver.findElement(By.name("q"));
		mobile.sendKeys("mobile phones");
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		WebElement Phonepic = driver.findElement(By.xpath("(//img[@loading='eager'])[1]"));
		Thread.sleep(3000);
		File src11= Phonepic.getScreenshotAs(OutputType.FILE);
		File dest11= new File("./Screenshot/Phonepic.png");
		FileUtils.copyFile(src11, dest11);
		driver.quit();
		
		
	}

}
