package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptOnProperty {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Store the location inside FileInputStream Class
		FileInputStream fis=new FileInputStream("./Test_Data/CommonData.properties");
		//Create File Specific Object
		Properties prop=new Properties();
		//Load Data into Location
		prop.load(fis);
		//Call Read Methods
	    String url = prop.getProperty("url");
	     String name = prop.getProperty("Email");
		 String pass = prop.getProperty("password");
		 driver.get(url);	
		 driver.findElement(By.partialLinkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys(name);
		 driver.findElement(By.id("Password")).sendKeys(pass);
		 

}
}
