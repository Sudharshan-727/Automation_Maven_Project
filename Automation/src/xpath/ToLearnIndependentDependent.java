package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIndependentDependent {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Iphone");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(@title,'Search for Products')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']/../..//div[text()='Bank Offer']")).click();
	Set<String> winid = driver.getWindowHandles();
	for(String id: winid)
	{
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains("https://www.flipkart.com/apple-iphone-16-black-128-gb/"))
		{
			String price = driver.findElement(By.xpath("//h1[taext()='APPLE iPhone 16 (Black, 128 GB)']/../../../../../../../../../../../..//div[contains(text(),'₹6')]")).getText();
			System.out.println(price);
		}
	}
	
	
}
}
