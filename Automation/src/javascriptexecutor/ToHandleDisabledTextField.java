package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledTextField {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	WebElement ele = driver.findElement(By.name("name"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].removeAttribute('disbaled')",ele);
	ele.sendKeys("Sudharshan");
	WebElement element = driver.findElement(By.id("email"));
	js.executeScript("arguments[0].removeAttribute('disbaled')",element);
	element.sendKeys("Sudharshan@gmail.com");
	WebElement password = driver.findElement(By.name("password"));
	js.executeScript("arguments[0].value='password'",password);
	//password.sendKeys("KSJNSEN");
}
}
