package pom_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage {
	
	//Declaration
	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(name="pass")
	private WebElement pswd;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login_btn;
	
	@FindBy(xpath="//h2")
	private WebElement header;
	
	//Initialization
	public LoginPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	//Initialization
	public WebElement getUn() {
		return un;
	}

	public void getPswd(String pass) {
		pswd.sendKeys(pass);
	}

	public void getLogin_btn() {
		 login_btn.click();
	}

	public String getHeader() {
		return header.getText();
	}
	

}
