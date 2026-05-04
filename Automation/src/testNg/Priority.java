package testNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = -1)
public void launch()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();   
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test(priority = 2)
public void login()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Reporter.log("Login Page is displayed",true);
}
@Test(priority = 1)
public void register()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	Reporter.log("Register Page is displayed,true");
}
}
