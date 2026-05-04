package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWeekTwo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://shoppersstack.com/products_page/52");
		driver.manage().window().maximize();
		Thread.sleep(25000);
		driver.findElement(By.id("compare")).click();
		Set<String> windowids = driver.getWindowHandles();
		Thread.sleep(25000);
		for(String i:windowids)
		{
			driver.switchTo().window(i);
			 String url=driver.getCurrentUrl();
			 if(url.equals("https://www.flipkart.com/")) {
				 System.out.println("Welcome Page Is Displayed");

			 }
			 else
			 {
				 System.out.println("Welcome Page is Not Displayed");
			 }
			 
			  if(url.equals("https://www.amazon.in/"))
			 {
				  Dimension size = driver.manage().window().getSize();
				  System.out.println(size);
			 }
			 else if(url.equals("https://www.ebay.com/"))
			 {
				 driver.manage().window().setSize(new Dimension(800,600));
			 }
			 
		}
		Thread.sleep(15000);
		driver.quit();

	}

	
}
