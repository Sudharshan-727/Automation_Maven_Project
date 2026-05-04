package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@placeholder='Leaving From']")).sendKeys("Bengaluru");
	driver.findElement(By.xpath("//input[@placeholder='Going To']")).sendKeys("Kerala");
	driver.findElement(By.xpath("//span[text()='Search']")).click();
}
}
