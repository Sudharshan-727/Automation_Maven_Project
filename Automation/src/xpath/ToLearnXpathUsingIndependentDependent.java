package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class ToLearnXpathUsingIndependentDependent {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	//driver.findElement(By.xpath("//label[text()='Good']/..input[contains(@type='radio')]")).click();
	driver.findElement(By.xpath("//label[text()='Good']/../input[@type='radio']")).click();
}
}
