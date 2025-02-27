package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAccountCreating {

	public FaceBookAccountCreating() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ajaz");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mohd");
		WebElement dddate = driver.findElement(By.id("day"));
		Select s= new Select(dddate);
		s.selectByVisibleText("18");
		
		WebElement ddmonth = driver.findElement(By.id("month"));
		Select s1= new Select(ddmonth);
		s1.selectByVisibleText("Nov");
		
		WebElement ddyear = driver.findElement(By.id("year"));
		Select s2= new Select(ddyear);
		s2.selectByVisibleText("1992");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("ajaz.y@yahoo.com");
		driver.findElement(By.id("password_step_input")).sendKeys("123abcd");
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}

}
