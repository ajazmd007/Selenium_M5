package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthentifaicationPopups {

	public HandlingAuthentifaicationPopups() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Handling for Authentification popup
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(3000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.quit();
	}

}
