package PracticePrograms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshotWebPageAndElement {

	public TakesScreenshotWebPageAndElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.nike.com/in/");
		// Taking Screen shot of web page
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshot/Nikepage.png");
		FileUtils.copyFile(src, dest);
		
		//Taking Screenshot of web element
		WebElement shoe = driver.findElement(By.id("gn-search-input"));
		shoe.sendKeys("air jordan");
		driver.findElement(By.xpath("//img[@alt='Air Jordan 1 Low']")).click();
		WebElement shoepic = driver.findElement(By.id("mobile-image-carousel"));
		File src0= shoepic.getScreenshotAs(OutputType.FILE);
		File dest0= new File("./Screenshot/NikeShoepic.png");
		FileUtils.copyFile(src0, dest0);
		
		  driver.get("https://www.adidas.co.in/");
		//  Taking Screen shot of web page
		TakesScreenshot ts1= (TakesScreenshot)driver;
		File src1= ts1.getScreenshotAs(OutputType.FILE);
		File dest1= new File ("./Screenshot/adidas.png");
		FileUtils.copyFile(src1, dest1);
		
		WebElement searchTF = driver.findElement(By.xpath("//button[@class='_mobile_search_toggle_4re0c_1']"));
		searchTF.sendKeys("jacket");
		//driver.findElement(By.xpath("(//img[@data-testid='product-card-primary-image'])[1]"));
		
		
		
		
		//driver.get("https://in.puma.com/in/en");
		// Taking Screenshot of web page
		//TakesScreenshot ts2= (TakesScreenshot)driver;
		//File src2= ts.getScreenshotAs(OutputType.FILE);
		//File dest2= new File("./Screenshot/puma.png");
		//FileUtils.copyFile(src2, dest2);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
