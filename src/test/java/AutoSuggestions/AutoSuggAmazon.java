package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggAmazon {

	public AutoSuggAmazon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pen");
		List<WebElement> sugg = driver.findElements(By.xpath("//div[contains(text(), 'pen')]"));
		for(WebElement ele: sugg) {
			System.out.println(ele.getText());
			}
		driver.findElement(By.xpath("(//div[contains(text(), 'pen')])[2]")).click();
	    Thread.sleep(5000);
		driver.quit();
		
	}

}
