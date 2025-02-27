package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {

	public HandlingAutoSuggestions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver=  new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.google.com/");
	    
	    
	    // Identify Search TF and pass the text
	    driver.findElement(By.id("APjFqb")).sendKeys("car");
	    
	    //Inspect all the autosuggestions and fetch the text from it
	    List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(text(), 'car')]"));
	    
	    for(WebElement ele: suggestions) {
	    	System.out.println(ele.getText());
	    	 }
	    
	    //Identify the 3rd element and perform click action
	    driver.findElement(By.xpath("(//span[contains(text(), 'car')])[3]")).click();
	    Thread.sleep(3000);
	    driver.quit();
	    
	}

}
