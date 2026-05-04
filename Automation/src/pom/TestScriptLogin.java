package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptLogin {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	FileInputStream fis=new FileInputStream("./Test_Data/CommonData.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	String email = prop.getProperty("Email");
	String pass = prop.getProperty("password");
	driver.get(url);
	//
	HomePage page=new HomePage(driver);
	page.getLoginlink().click();
	Login log=new Login(driver);
	log.getEmailtextfield().sendKeys(email);
	log.getPasswordtextfield().sendKeys(pass);
	log.getCheckbox().click();
	log.getLoginbtn().click();
	
	
}
}
