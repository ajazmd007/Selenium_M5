package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AJIO {

	public AJIO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ajio.com/");
		WebElement men = driver.findElement(By.xpath("//li[@data-test='li-MEN']"));
		Actions act= new Actions(driver);
		act.moveToElement(men).perform();
		driver.findElement(By.xpath("(//a[text()='Shirts'])[1]")).click();
		
		WebElement sort = driver.findElement(By.id("sortBy"));
		Select s= new Select(sort);
		s.selectByVisibleText("What's New");
		
		WebElement price = driver.findElement(By.xpath("(//div[text()='Men Printed Regular Slim Fit Shirt']/parent::div/child::div)[1]"));
		System.out.println(price.getText());
		
		
	    driver.quit();
		
	}

}
