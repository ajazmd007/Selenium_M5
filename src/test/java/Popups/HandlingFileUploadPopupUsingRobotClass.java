package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFileUploadPopupUsingRobotClass {

	public HandlingFileUploadPopupUsingRobotClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Handling File Upload using robot class
		WebElement choosebtn = driver.findElement(By.id("file-upload"));
		
		Actions act= new Actions(driver);
		act.click(choosebtn).perform();
		
		//Selecting the file
		StringSelection str= new StringSelection("C:\\Users\\ACER\\Desktop\\ajaz.txt");
		//Copying the file to system clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, str);
		Thread.sleep(3000);
		
		//Copy the file using robot class
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//Paste the file
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//Upload the file by clicking Open
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
