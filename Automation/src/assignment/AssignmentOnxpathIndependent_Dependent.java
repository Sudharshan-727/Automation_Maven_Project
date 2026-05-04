package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnxpathIndependent_Dependent {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Iphone 17 Pro");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(@title,'Search for Products')]")).click();
	Thread.sleep(5000);
	 List<WebElement> phones = driver.findElements(By.xpath("//div[contains(text(),'iPhone 17 Pro')]"));
	 for(WebElement i:phones)
	 {
		    String name = i.getText();
		    System.out.println(name);
	 }
	List<WebElement> price = driver.findElements(By.xpath("//span[contains(text(),'Showing')]/../../../..//div[contains(text(),'₹')]"));
	for(WebElement j:price)
	{
				String prices = j.getText();
				System.out.println(prices);
	}

	 
}
}
