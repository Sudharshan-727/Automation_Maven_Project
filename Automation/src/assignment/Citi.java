package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Citi {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
//	WebElement ele = driver.findElement(By.xpath("//h2[text()='Try our Certificate of Deposit calculator']"));
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].scrollIntoView",ele);
	
	
	WebElement deposit = driver.findElement(By.id("mat-input-0"));
	deposit.clear();
	deposit.sendKeys("234567");
	WebElement months = driver.findElement(By.id("mat-input-1"));
	months.clear();
	months.sendKeys("24");
	WebElement apy = driver.findElement(By.id("mat-input-2"));
	apy.clear();
	apy.sendKeys("10");
	driver.findElement(By.id("mat-select-0-panel"));
	WebElement drop = driver.findElement(By.id("mat-select-0-panel"));
	Select s=new Select(drop);
	s.selectByVisibleText("Compounded Quarterly");
	
	
}
}
