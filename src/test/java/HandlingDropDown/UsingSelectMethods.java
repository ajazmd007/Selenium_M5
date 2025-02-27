package HandlingDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectMethods {

	public UsingSelectMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//Identify drop down element
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		//create an object of select class
		Select s= new Select(dropdown);
		
		//select the option using index
		s.selectByIndex(10);
		
		//select the option using visibile text
		s.selectByVisibleText("Luxury Beauty");
		
		//select the option using value
		s.selectByValue("search-alias=furniture");
		
		//Identify dropdown is multi select
		s.isMultiple();
		Thread.sleep(5000);
		System.out.println(s.isMultiple());
		
		//Fetch all the options from the dropdown
		
		List<WebElement> list = s.getOptions();
		
		for(WebElement ele: list) {
			System.out.println(ele.getText());
		}
		
		System.out.println("first selected :" + s.getFirstSelectedOption().getText());
		
		List<WebElement> selected = s.getAllSelectedOptions();
		for(WebElement ele: selected) {
			System.out.println(ele.getText());
		}
		//close the window
		driver.quit();
		

		
	}

}
