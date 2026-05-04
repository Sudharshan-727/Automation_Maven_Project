package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[contains(@title='Search for Products, Brands' )]")).sendKeys(args)
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("mobiles", org.openqa.selenium.Keys.ENTER);
		}

}
