package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(15000);
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.id("newsletter-subscribe-button")).click();
	//driver.findElement(By.id("small-searchterms")).sendKeys("books");
	
}
}
