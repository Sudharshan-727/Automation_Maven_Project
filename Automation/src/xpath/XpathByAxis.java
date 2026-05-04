package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxis {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/reserve.php");
		//String price = driver.findElement(By.xpath("//td[text()='Aer Lingus']//following-sibling::td[3]")).getText();
		//System.out.println(price);
		driver.findElement(By.xpath("//td[text()='Aer Lingus']//preceding-sibling::td[2]")).click();
	}
}
