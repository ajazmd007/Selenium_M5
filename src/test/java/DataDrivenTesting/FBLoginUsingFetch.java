package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginUsingFetch {

	public FBLoginUsingFetch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		        //Convert Physical file into java Object
				FileInputStream fis= new FileInputStream("./src/test/resources/FBCommondata.properties");
	
				
				//Create an Object of properties
				Properties p = new Properties();
				
				//Load the property object
				p.load(fis);
				
				//Fetch the data from property file
				String data = p.getProperty("url");
				String data1 = p.getProperty("browser");
				String data2 = p.getProperty("timeouts");
				String data3 = p.getProperty("email");
				String data4 = p.getProperty("password");
				
				//Convert String data to long
				long timeouts = Long.parseLong(data2);
			
			
				WebDriver driver= new ChromeDriver();
				driver.get(data);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
				driver.findElement(By.id("email")).sendKeys(data3);
				driver.findElement(By.id("pass")).sendKeys(data4);
				driver.findElement(By.name("login")).click();
				Thread.sleep(3000);
				driver.quit();
				
	}

}
