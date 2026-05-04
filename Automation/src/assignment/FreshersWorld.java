package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FreshersWorld {
public static void main(String[] args) throws IOException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 FileInputStream fis=new FileInputStream("./Test_Data/FreshersJob.properties");
	 Properties prop=new Properties();
	 prop.load(fis);
	String url = prop.getProperty("url");
	String name = prop.getProperty("Name");
	String email = prop.getProperty("Email");
	String mobile = prop.getProperty("Mobile");
	String dob = prop.getProperty("Dob");
	driver.get(url);
	driver.findElement(By.id("reg_new_btn")).click();
	driver.findElement(By.id("firstname")).sendKeys(name);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("mobile")).sendKeys(mobile);
	driver.findElement(By.id("datepicker")).sendKeys(dob);
	WebElement education = driver.findElement(By.id("course"));
	Select sel=new Select(education);
	sel.selectByVisibleText("MCA");
	driver.findElement(By.id("hasWorkExp0")).click();
	File f = new File("D:/Sudharshan_Testing_Resume.pdf");
	String absolute = f.getAbsolutePath();
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absolute);
	driver.findElement(By.xpath("(//input[@unchecked='unchecked'])[2]")).click();
	TakesScreenshot ts= (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm=new File("./Screenshots/Job.png");
	FileHandler.copy(temp, perm);
	driver.findElement(By.name("submitRegister")).click();

}
}
