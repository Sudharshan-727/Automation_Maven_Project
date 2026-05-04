package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLinkedText {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("Email")).sendKeys("Abc@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("Password")).sendKeys("Abc@123");
	Thread.sleep(1000);
	
	
}
}
