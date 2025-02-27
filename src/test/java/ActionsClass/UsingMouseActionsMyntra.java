package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMouseActionsMyntra {

	public UsingMouseActionsMyntra() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement KidsWear = driver.findElement(By.linkText("Kids"));
		Actions act= new Actions(driver);
		act.moveToElement(KidsWear).perform();
	}

	
}
