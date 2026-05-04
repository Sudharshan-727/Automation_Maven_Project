package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnFlipkart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Dimension size = driver.findElement(By.xpath("//div[@class='olwU0Z CXZSEo']")).getSize();
	System.out.println(size);
	String placeholder = driver.findElement(By.xpath("//input[@name='q']")).getAttribute("placeholder");
	System.out.println(placeholder);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@role='button']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	String property = driver.findElement(By.xpath("//button[text()='Request OTP']")).getCssValue("background");
	System.out.println(property);

	
}
}
