package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	String timestamp = LocalDateTime.now().toString().replace(":", "-");
	//Typecasting
	TakesScreenshot ts=(TakesScreenshot)driver;
	//temp file
	File temp=ts.getScreenshotAs(OutputType.FILE);
	//create permanent folder
	File perm=new File("./Screenshots/"+timestamp+".png");
	//copy to permanent
	FileHandler.copy(temp, perm);
}
}
