package popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopups {
public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	  
	  driver.findElement(By.id("fullName")).sendKeys("Sudharshan");
	  driver.findElement(By.id("emailId")).sendKeys("Sudharshan@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Sudharshan");
	  driver.findElement(By.id("mobile")).sendKeys("1234567890");
	 File f=new File("‪D:\\Sudharshan_Testing_Resume.pdf");
	  String path = f.getAbsolutePath();
	  driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
}
}
