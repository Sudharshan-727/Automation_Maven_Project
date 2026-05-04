package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")).sendKeys("Mobile");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(@title,'Search for Products')]")).click();
	
	
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(5000);
	String text = driver.findElement(By.xpath("//div[contains(text(),'Copyright © 2026 Tricentis Demo')]")).getText();
	System.out.println(text);
	
	
}
}
