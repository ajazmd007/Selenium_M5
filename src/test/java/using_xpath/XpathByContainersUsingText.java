package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainersUsingText {

	public XpathByContainersUsingText() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?_rdr");
		
		WebElement headermsg = driver.findElement(By.xpath("//h2[contains(text(), 'Facebook')]"));
		
		System.out.println(headermsg.getText());
		
		driver.quit();
	}

}
