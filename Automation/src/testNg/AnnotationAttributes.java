package testNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributes {
@Test
public void launch()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("Welcome Page is Displayed",true);
}

@Test(dependsOnMethods = "register")
public void login() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");;
	Reporter.log("Login Page is Displayed",true);
}
@Test
public void register()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	Reporter.log("Register Page is Displayed");
}
} 
