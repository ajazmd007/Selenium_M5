package HandlingDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingMultiSelectDropDown {

	public UsingMultiSelectDropDown() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		WebDriver driver=  new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://demoapp.skillrary.com/");
	    
	    WebElement dropdown = driver.findElement(By.id("cars"));
	    
	    //create an object of select class
	    Select s= new Select(dropdown);
	    
	    s.isMultiple();
	    System.out.println(s.isMultiple());
	    
	    s.selectByIndex(0);
	    
	    s.selectByValue("299");
	    
	    s.selectByVisibleText("More Than INR 500 ( 55 ) ");
	    
	    //Fetch all options
	    List<WebElement> list = s.getOptions();
	    for(WebElement ele: list) {
			System.out.println(ele.getText());
		}
		
		System.out.println("first selected :" + s.getFirstSelectedOption().getText());
		
		List<WebElement> selected = s.getAllSelectedOptions();
		for(WebElement ele: selected) {
			System.out.println(ele.getText());
		}
		  s.deselectByIndex(0);
		  s.deselectByValue("299");
	      s.deselectByVisibleText("More Than INR 500 ( 55 )");
	      s.deselectAll();
          driver.quit();
	    
	  }
}
