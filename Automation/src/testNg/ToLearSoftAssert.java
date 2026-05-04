package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearSoftAssert {
@Test
public void login()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Login page is displayed");
	driver.findElement(By.id("Email")).sendKeys("sudharshan0727@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("#Su07dharshan");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	soft.assertEquals(driver.getTitle(),"Demo Web Shop","Homepage is Displayed");
	soft.assertAll();
	
}

}
