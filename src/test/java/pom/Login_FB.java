package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_utility.LoginPomPage;

public class Login_FB {

	public static void main(String[] args) throws IOException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis= new FileInputStream("./src/test/resources/FBCommondata.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		String UN = p.getProperty("username");
		String password = p.getProperty("password");
		
		LoginPomPage l = new LoginPomPage(driver);
		
		driver.get(url);
		
		//Verification
		if(l.getHeader().contains("Facebook helps you")) {
			l.getUn().sendKeys(UN);
			l.getPswd(password);
			
			driver.navigate().refresh();
			l.getUn().sendKeys(UN);
			l.getPswd(password);
			l.getLogin_btn();
			
		
		}
		
		
	}
}
