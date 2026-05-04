package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Execution2 {
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.hdfc.bank.in/");
	WebElement login = driver.findElement(By.xpath("(//button[text()='Login'])[1]"));
	login.click();
	driver.findElement(By.xpath("(//span[text()='NetBanking'])[1]")).click();
	Set<String> s = driver.getWindowHandles();
	for(String id:s)
	{
		String url = driver.getCurrentUrl();
		if(url.contains("https://now.hdfc.bank.in/auth/realms/retail/protocol/openid-connect"))
		{
		driver.switchTo().window(id);
		System.out.println("success");
		}
	}
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}
