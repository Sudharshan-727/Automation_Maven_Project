package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotOfWebelement {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement ele = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
	File temp=ele.getScreenshotAs(OutputType.FILE);
	File perm=new File("./Screenshots/image.png");
	FileHandler.copy(temp, perm);
}
}
