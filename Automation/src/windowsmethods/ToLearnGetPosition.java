package windowsmethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Point coordinates=driver.manage().window().getPosition();
	System.out.println(coordinates);
	System.out.println(coordinates.getX());
	System.out.println(coordinates.getY());
}
}
