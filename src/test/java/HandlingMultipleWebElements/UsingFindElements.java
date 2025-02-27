package HandlingMultipleWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElements {

	public UsingFindElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(WebElement ele : links) {
			String text = ele.getText();
			System.out.println(text);
			}
		driver.quit();
	}
}
