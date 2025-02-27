package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGettersMethod {

	public UsingGettersMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//fetch the text on an element
		WebElement element = driver.findElement(By.partialLinkText("Books"));
		//fetch text value
		System.out.println("Text :" +element.getText());
		//fetch tag name value
		System.out.println("Tagname for Books :" +element.getTagName());
		//fetch the location of the books
		System.out.println("Location of Books :" +element.getLocation());
		//fetch the size
		System.out.println("Size of book :" +element.getSize());
		System.out.println("books XAxis :" +element.getRect().getX());
		System.out.println("books YAxis :" +element.getRect().getY());
		
		//fetch the attribute of searchTF
		WebElement searchTF= driver.findElement(By.id("small-searchterms"));
		System.out.println("Attribute value :" +searchTF.getAttribute("class"));
		System.out.println("Tagname for serachTF :" +searchTF.getTagName());
		System.out.println("Location of searchTF :" +searchTF.getLocation());
		System.out.println("Size of searchTF :" +searchTF.getSize());
		System.out.println("SearchTF height :" +searchTF.getRect().getHeight());
		System.out.println("SearchTF widht :" +searchTF.getRect().getWidth());
		driver.quit();
		}
	}
