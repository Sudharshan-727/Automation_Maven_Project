package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	@FindBy(id ="gender-male")
	private WebElement gender;
	@FindBy(id = "FirstName")
	private WebElement firstname;
	@FindBy(id="LastName")
	private WebElement lastname;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement pass;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpass;
	@FindBy(id="register-button")
	private WebElement regbtn;
	
	public Register(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements( driver,this);
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public void setConfirmpass(WebElement confirmpass) {
		this.confirmpass = confirmpass;
	}

	public WebElement getRegbtn() {
		return regbtn;
	}

	public void setRegbtn(WebElement regbtn) {
		this.regbtn = regbtn;
	}
	
	
}
