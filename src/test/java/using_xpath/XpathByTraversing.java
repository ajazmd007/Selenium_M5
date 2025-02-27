package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTraversing {

	public XpathByTraversing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Independent and Dependent Xpath with Forward and Backward xpath traversing
		WebElement price= driver.findElement(By.xpath("//a[contains(text(),'Virtual Gift Card')]/../../div[3]/div/span"));
		System.out.println(price.getText());
			
	}

}
