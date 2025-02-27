package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAccountCreate {

	public InstagramAccountCreate() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.findElement(By.xpath("//span[text()='Mobile Number or Email']")).sendKeys("ajaz.y@yahooo.com");
		driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("123abc");
		driver.findElement(By.xpath("//span[text()='Full Name']")).sendKeys("ajaz");
		driver.findElement(By.xpath("//span[text()='Username']")).sendKeys("ajaz123");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		driver.quit();
	}

}
