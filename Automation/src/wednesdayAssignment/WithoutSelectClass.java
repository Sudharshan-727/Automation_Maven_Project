package wednesdayAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectClass {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/dropdown/disabled?sublist=3");
	WebElement country = driver.findElement(By.xpath("//select[@id='SelectCountry']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].removeAttribute('disabled')",country);
	 List<WebElement> options = driver.findElements(By.xpath("//select[@id='SelectCountry']"));
	 for(WebElement opt:options) {
		if(opt.getText().equals("India")){
			opt.click();
		}

	 }
}
}
