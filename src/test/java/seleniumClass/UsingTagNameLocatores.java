package seleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagNameLocatores {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		  
		  //Maximize the window
		  driver.manage().window().maximize();
		  
		  //navigate to webpage
		  driver.get("https://demowebshop.tricentis.com/"
		  		+ "");

		  List<WebElement> link= driver.findElements(By.tagName("a"));
		  
		  for(WebElement ele:link)
		  {
		  System.out.println(ele.getText());
		  ele.click();
		  }
		  driver.quit();

}
	}
	
