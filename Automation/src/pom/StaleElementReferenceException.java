package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");;
	List<WebElement> chek = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement ele:chek)
	{
		ele.click();
	}
	driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
	driver.findElement(By.xpath("//a[text()='Prompt']")).click();
	
	List<WebElement> chekbtn = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement element:chek)
	{
		element.click();
	}
	 
	
	
}
}
