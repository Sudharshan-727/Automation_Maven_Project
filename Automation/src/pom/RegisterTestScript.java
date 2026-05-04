package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTestScript {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	FileInputStream fis=new FileInputStream("./Test_Data/CommonData.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	String fname = prop.getProperty("First_name");
	String lname = prop.getProperty("Last_name");
	String email = prop.getProperty("Email");
	String pass = prop.getProperty("password");
	String cpas = prop.getProperty("Confirm_Password");
	driver.get(url);
	HomePage page=new HomePage(driver);
	page.getRegisterlink().click();
	Register reg=new Register(driver);
	reg.getGender().click();
	reg.getFirstname().sendKeys(fname);
	reg.getLastname().sendKeys(lname);
	reg.getEmail().sendKeys(email);
	reg.getPass().sendKeys(pass);
	reg.getConfirmpass().sendKeys(cpas);
	reg.getRegbtn().click();
	
	
	
}
}
