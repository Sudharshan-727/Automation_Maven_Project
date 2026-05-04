package wednesdayAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelect {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	WebElement ele = driver.findElement(By.id("select-multiple-native"));
	Select s1=new Select(ele);
	s1.selectByVisibleText("Mens Casual Premium ...");
	s1.selectByVisibleText("Mens Cotton Jacket...");
	s1.selectByVisibleText("White Gold Plated Pr...");
	s1.selectByVisibleText("Silicon Power 256GB ...");
	
	List<WebElement> alloptions = s1.getAllSelectedOptions();
	for(WebElement all:alloptions) {
		System.out.println(all.getText());
	}       
	driver.findElement(By.xpath("//button[text()='Add']")).click(); 

}

}
