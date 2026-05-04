package iframe;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentOniframe {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.automationtesting.in/Frames.html");
	WebElement frame = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	 File perm=new File("./Screenshots/frame.png");
	 FileHandler.copy(temp, perm);
	 driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	 WebElement parent = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	 driver.switchTo().frame(parent);
	 WebElement child = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	 driver.switchTo().frame(child);
	 driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("Seleneium");
	TakesScreenshot t=(TakesScreenshot)driver;
	File temperory = t.getScreenshotAs(OutputType.FILE);
	File permanet=new File("./Screenshots/innerframe.png");
	FileHandler.copy(temperory, permanet);
	 
}
}
