package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://homeloans.hdfc.bank.in/");
	Actions act=new Actions(driver);
//	WebElement hover = driver.findElement(By.xpath("//a[@title='Login']"));
	Point cord = driver.findElement(By.xpath("//a[@title='Login']")).getLocation();
	System.out.println(cord.getX());
	System.out.println(cord.getY());
	act.moveByOffset(1219, 56).perform();
//	act.moveToElement(hover).perform();
}
}

