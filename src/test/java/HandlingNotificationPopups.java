import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopups {

	public HandlingNotificationPopups() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		
		//Disabled Notifications
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		//Identifying notification TF AND Handling Notification Pop up 
		driver.findElement(By.id("browNotButton")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
