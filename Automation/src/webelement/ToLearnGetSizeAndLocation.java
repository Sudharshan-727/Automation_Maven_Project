package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class ToLearnGetSizeAndLocation {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Dimension size = driver.findElement(By.xpath("(//div[@class='title'])[5]")).getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	System.out.println(size);
  	Point points = driver.findElement(By.xpath("(//div[@class='title'])[5]")).getLocation();
  	System.out.println(points.getX());
  	System.out.println(points.getY());
}
}
