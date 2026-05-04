package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
//decalartion
	@FindBy(id = "Email")
	private WebElement emailtextfield;
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	@FindBy(id="RememberMe")
	private WebElement checkbox;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbtn;
//intialization
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements( driver,this);
	}
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	
}
