package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_on_amazon {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17");
	driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> desc = driver.findElements(By.xpath("//span[text()='Apple']/../../../..//span[contains(text(),'iPhone Air 256 GB: Thinnest iPhone')]"));
	for(WebElement des:desc)
	{
		System.out.println(des.getText());
		System.out.println("---------------------");
	}
	List<WebElement> price = driver.findElements(By.xpath("//span[text()='Apple']/../../../../..//span[@class='a-price-whole']"));
	for(WebElement p:price)
	{
		System.out.println(p.getText());
	}
}
}
