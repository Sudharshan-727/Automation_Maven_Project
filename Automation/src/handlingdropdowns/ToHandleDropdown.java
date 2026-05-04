package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropdown {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	WebElement country_code = driver.findElement(By.id("country_code"));
	Select s=new Select(country_code);
	s.selectByIndex(3);
	s.selectByValue("+91");
	List<WebElement> options = s.getOptions();
	for(WebElement ele:options) {
		System.out.println(ele.getText());
	}
	
	System.out.println("-------------------------------------------------------------");
	WebElement country = driver.findElement(By.id("select3"));
	Select s2=new Select(country);
	s2.selectByVisibleText("India");
	List<WebElement> country_options = s2.getOptions();
	for(WebElement countries:country_options) {
		System.out.println(countries.getText());
	}
	
	System.out.println("--------------------------------------------------------------");
	
	
	WebElement state = driver.findElement(By.id("select5"));
	Select s3=new Select(state);
	s3.selectByValue("Kerala");
	List<WebElement> state_options = s3.getOptions();
	for(WebElement states:state_options) {
		System.out.println(states.getText());
	}
	System.out.println("---------------------------------------------------------------");
	
//	WebElement city = driver.findElement(By.id("//label[text()='City']"));
//	Select s4=new Select(city);
//	s3.selectByValue("Kannur");
	
	
	WebElement city = driver.findElement(By.id("select7"));
	Select s4=new Select(city);
	s4.selectByValue("5");
}
}
