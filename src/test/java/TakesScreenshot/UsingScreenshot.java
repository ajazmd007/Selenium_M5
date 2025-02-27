package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingScreenshot {

	public UsingScreenshot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.swiggy.com/restaurants");
		
		//Screenshot of a "Web Page"
		//Step 1 TypeCasting the Takescreenshot interface
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		//Step 2 Taking the ScreensShot Store SS in a reference variable
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3 Create a new empty file
		File dest= new File("./Screenshot/img.png");
		
		//Step 4 Copy the Screenshot in empty file
		FileUtils.copyFile(src, dest);
		
		driver.quit();
		
		
		
	}

}
