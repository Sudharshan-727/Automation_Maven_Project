package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement ele = driver.findElement(By.xpath("//button[@title='More Photos']"));
	Actions act=new Actions(driver);
	//act.scrollToElement(ele).perform();
	act.scrollByAmount(111,45).perform()	;
}
}
