package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLeanDragAndDrop {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(element);
	WebElement source = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	WebElement target = driver.findElement(By.id("trash"));
	Actions act=new Actions(driver);
	//act.dragAndDrop(source, target).perform();
	act.clickAndHold(source).moveToElement(target).release().perform();
}
}
