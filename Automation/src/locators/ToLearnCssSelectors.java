package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssSelectors {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Books");
	driver.findElement(By.cssSelector("input[value='Search']")).click();
}
}
