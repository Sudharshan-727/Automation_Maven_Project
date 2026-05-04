package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Execution1 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	Set<String> windows = driver.getWindowHandles();
	for(String i:windows) {
		driver.switchTo().window(i);
	}
	driver.findElement(By.xpath("//span[text()='Create account']")).click();
	driver.findElement(By.name("name")).sendKeys("Sudharshan");
	driver.findElement(By.name("email")).sendKeys("Sudharshans@gmail.com");
	WebElement month = driver.findElement(By.xpath("//select[@id='SELECTOR_1']"));
	 Select s =new Select(month);
	s.selectByVisibleText("November");
	WebElement day = driver.findElement(By.xpath("//select[@id='SELECTOR_2']"));
	Select s2=new Select(day);
	s2.selectByVisibleText("27");
	WebElement year = driver.findElement(By.xpath("//select[@id='SELECTOR_3']"));
	Select s3=new Select(year);
	
	s3.selectByVisibleText("2005");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm=new File("./Screenshots/Twitter.png");
	FileHandler.copy(temp, perm);
	
	
}
}
