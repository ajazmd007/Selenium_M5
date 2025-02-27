package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingToRightOfMethod {

	public UsingToRightOfMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Using searchTF and RL toRightOf Method clicking on search button
		WebElement TF= driver.findElement(By.id("small-searchterms"));
		TF.sendKeys("shoes");
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(TF)).click();
		Thread.sleep(3000);
		
		//Using login link and RL ToLeftOf method clicking on Register link
		WebElement login= driver.findElement(By.linkText("Log in"));
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(login)).click();
		Thread.sleep(3000);
		
		
		//Using gender label RL Near method clicking on male radio button
		WebElement label= driver.findElement(By.xpath("//label[text()= 'Gender:']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(label)).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
