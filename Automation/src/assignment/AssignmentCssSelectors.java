package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCssSelectors {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Sudharshan");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Shankarsudharshan07@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("#Su07dharshan");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
