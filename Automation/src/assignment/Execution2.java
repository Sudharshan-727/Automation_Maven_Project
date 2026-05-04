package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Execution2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://blazedemo.com/");
	WebElement from = driver.findElement(By.xpath("//select[@name='fromPort']"));
	Select s=new Select(from);
	s.selectByVisibleText("San Diego");
	WebElement to = driver.findElement(By.xpath("//select[@name='toPort']"));
	Select s2=new Select(to);
	s2.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[3]")).click();
	driver.findElement(By.id("inputName")).sendKeys("Charles Leclerc");
	driver.findElement(By.name("address")).sendKeys("Monaco");
	driver.findElement(By.id("city")).sendKeys("Italy");
	driver.findElement(By.id("state")).sendKeys("Dubai Kuruku Santhu");
	driver.findElement(By.id("zipCode")).sendKeys("56789");
	WebElement drop = driver.findElement(By.id("cardType"));
	Select s3=new Select(drop);
	s3.selectByVisibleText("American Express");
	driver.findElement(By.id("creditCardNumber")).sendKeys("23456789");
	WebElement cl = driver.findElement(By.id("creditCardMonth"));
	cl.clear();
	cl.sendKeys("11");
	WebElement c2 = driver.findElement(By.id("creditCardYear"));
	c2.clear();
	c2.sendKeys("2026");
	WebElement c3 = driver.findElement(By.id("nameOnCard"));
	c3.clear();
	c3.sendKeys("Charles");
	driver.findElement(By.id("rememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
					
	
	
	
	
}
}
