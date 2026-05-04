package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentAbibus {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.abhibus.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement ele = driver.findElement(By.xpath("//h2[text()='Popular Bus Routes']"));
	js.executeScript("arguments[0].scrollIntoView(true)",ele);
	driver.findElement(By.xpath("//img[@alt='Bangalore to Hyderabad']/../..//a[text()='View Buses']")).click();
	WebElement element = driver.findElement(By.xpath("//span[text()='Bus Partner']"));
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	driver.findElement(By.xpath("//span[text()='Bus Partner']")).click();
	//WebElement bus = driver.findElement(By.xpath("//span[text()='Bus Partner']/../../../..//input[@type='checkbox']/..//label[text()='7 Hills Roadways']"));
	//WebElement bus = driver.findElement(By.xpath("//span[text()='Bus Partner']/../../../..//input[@type='checkbox']/../../.."));
	driver.findElement(By.xpath("//label[text()='BigBus']/..//input[@type='checkbox']")).click();
//	List<WebElement> details = driver.findElements(By.xpath("//div[@class='container service-info-left-section ']"));
//	for(WebElement info:details) {
//		System.out.println("---------Bus Details--------");
//		System.out.println(info.getText());
//		System.out.println("----------------------------");
//	}
	
	 List<WebElement> places = driver.findElements(By.xpath("//h5[text()='BigBus']/../..//div[@id='travel-distance-container']"));
	for(WebElement place:places)
	{
		Thread.sleep(5000);
		System.out.println(place.getText());
		System.out.println("-------------");
	}
	
//	List<WebElement> price = driver.findElements(By.xpath("//h5[text()='BigBus']/../../../../..//span[text()='₹']"));
//	
//	for(WebElement p:price)
//	{
//		System.out.println(p.getText());
//		System.out.println("------------------");
//	}
}
}
