package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegister {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	FileInputStream fis=new FileInputStream("./Test_Data/CommonData.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
    String first_name = prop.getProperty("First_name");
    String last_name = prop.getProperty("Last_name");
    String email = prop.getProperty("Email");
    String pass = prop.getProperty("password");
    String passconfirm = prop.getProperty("Confirm_Password");
    driver.get(url);
    driver.findElement(By.xpath("//a[text()='Register']")).click();
    driver.findElement(By.xpath("//input[@value='M']")).click();
    driver.findElement(By.id("FirstName")).sendKeys(first_name);
    driver.findElement(By.id("LastName")).sendKeys(last_name);
    driver.findElement(By.id("Email")).sendKeys(email);
    driver.findElement(By.id("Password")).sendKeys(pass);
    driver.findElement(By.id("ConfirmPassword")).sendKeys(passconfirm);
    driver.findElement(By.id("register-button")).click();
    
    
}

}
