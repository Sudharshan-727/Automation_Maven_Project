package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnLocators {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.className("ico-register")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("gender-male")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("FirstName")).sendKeys("Sudharshan");
	Thread.sleep(2000);
	driver.findElement(By.id("LastName")).sendKeys("S");
	Thread.sleep(2000);
	driver.findElement(By.name("Email")).sendKeys("Shankarsudharshan07@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("Password")).sendKeys("Sudharshan@27");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Sudharshan@27");
	Thread.sleep(2000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(2000);
	
}
}
