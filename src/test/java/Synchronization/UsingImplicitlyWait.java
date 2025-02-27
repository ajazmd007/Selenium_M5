package Synchronization;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitlyWait {

	public UsingImplicitlyWait() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
				
		//Validate
		//@Nullable
		String title = driver.getTitle();
		//@Nullable
		String url = driver.getCurrentUrl();

		if(url.contains("https://www.shoppersstack.com/user-signin")){
			System.out.println("Test Pass");
			} 
		else {
			System.out.println("Test Fail");
		}
		driver.quit();
		}

		}
		

	