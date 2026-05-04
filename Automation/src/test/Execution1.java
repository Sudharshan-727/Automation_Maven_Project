package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.logging.FileHandler;

import org.apache.poi.hwpf.usermodel.DateAndTime;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Execution1 {
public static void main(String[] args) throws IOException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.globalsqa.com/");
	WebElement test = driver.findElement(By.xpath("(//a[contains(text(),'Tester’s Hub')])[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(test).perform();
	WebElement demo = driver.findElement(By.xpath("//span[contains(text(),'Demo Testing Site')]"));
	act.moveToElement(demo).perform();
	driver.findElement(By.xpath("//span[contains(text(),'Drag And Drop')]")).click();
	WebElement element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(element);
	WebElement source = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
	WebElement target = driver.findElement(By.id("trash"));
	act.dragAndDrop(source, target).perform();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
	//driver.findElement(By.xpath("//div[contains(text(),'Close')]")).click();
	driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
	Set<String> ids = driver.getWindowHandles();
	for(String s:ids)
	{
		driver.switchTo().window(s);
	}
	WebElement scroll = driver.findElement(By.xpath("//p[contains(text(),'Visualizing SQL Joins in ')]"));
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",scroll);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm=new File("./Screenshots/Sql.png");
	org.openqa.selenium.io.FileHandler.copy(temp, perm);
	
	
	
	
}
}
