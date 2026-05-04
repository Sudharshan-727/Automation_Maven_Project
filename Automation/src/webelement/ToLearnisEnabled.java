package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnisEnabled {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/52");
	Thread.sleep(20000);
	boolean status = driver.findElement(By.name("Check")).isEnabled();
	System.out.println(status);
}
}
