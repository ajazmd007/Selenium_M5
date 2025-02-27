package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAndLogin {

	public RegisterAndLogin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
			//Launch the browser
			  WebDriver driver= new ChromeDriver();
			  
			  //Maximize the window
			  driver.manage().window().maximize();
			  
			  //navigate to web page
			  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			  Thread.sleep(3000);
			  
			  //Enter user name text in text field
			  driver.findElement(By.className("name")).sendKeys("Sel");
			  
			//Enter email text in text field
			  driver.findElement(By.className("email")).sendKeys("email@gmail.com");
			  
	}

}
