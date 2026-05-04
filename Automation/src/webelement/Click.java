package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	//driver.findElement(By.xpath("//input[@value='Vote']")).submit(); 
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobiles");
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
}
}
