package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
@Test
public void login()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/tricentis");
	
	//verify Home Page is Displayed
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Tricentis","Home Page is not displayed");
	Reporter.log("Homepage",true);
	driver.findElement(By.partialLinkText("Log in")).click();
	
	//verify login page is displayed
	boolean status = driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed();
	Assert.assertEquals(status,true);
	driver.findElement(By.id("Email")).sendKeys("sudharshan0727@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("#Su07dharshan");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
}
