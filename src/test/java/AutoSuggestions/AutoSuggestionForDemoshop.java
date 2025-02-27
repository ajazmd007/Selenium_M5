package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionForDemoshop {

	public AutoSuggestionForDemoshop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=  new ChromeDriver();
			
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    driver.get("https://demowebshop.tricentis.com/");
		    
		    driver.findElement(By.name("q")).sendKeys("com");
		    
		   List<WebElement> suggestions = driver.findElements(By.xpath("//a[contains(text(), 'com')]"));
		    
		   for(WebElement ele: suggestions) {
			   System.out.println(ele.getText());
			   }
		    driver.findElement(By.xpath("(//a[contains(text(), 'com')]) [3]")).click();
		    Thread.sleep(3000);
		    driver.quit();
		    
	}

}
