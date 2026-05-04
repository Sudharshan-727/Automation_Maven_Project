package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 //Declaration
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerlink;
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement loginlink;
	@FindBy(id = "small-searchterms")
	private WebElement searchtextfield;
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchbutton;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	
	//call getter and setter methods
	public WebElement getRegisterlink() {
		return registerlink;
	}

	public void setRegisterlink(WebElement registerlink) {
		this.registerlink = registerlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public void setLoginlink(WebElement loginlink) {
		this.loginlink = loginlink;
	}

	public WebElement getSearchtextfield() {
		return searchtextfield;
	}

	public void setSearchtextfield(WebElement searchtextfield) {
		this.searchtextfield = searchtextfield;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public void setSearchbutton(WebElement searchbutton) {
		this.searchbutton = searchbutton;
	}
	
	
	
}
