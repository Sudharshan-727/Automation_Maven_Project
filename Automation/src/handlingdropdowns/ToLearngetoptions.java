package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearngetoptions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='select3']"));
	Select s=new Select(dropdown1);
	s.selectByIndex(4);
	List<WebElement> options = s.getOptions();
	for(WebElement l:options) {
		System.out.println(l.getText());
	}
	
}
}
