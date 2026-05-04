package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnswitchToUsingBreak {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/52");
	Thread.sleep(15000);
	driver.findElement(By.id("compare")).click();
	Set<String> allwinids = driver.getWindowHandles();
	for(String id:allwinids) {
		driver.switchTo().window(id);
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.amazon.in/")) {
			break;
		}
		driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.manage().window().minimize();
		Thread.sleep(15000);
		driver.close();
	}
}
}
