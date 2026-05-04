package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_on_XpathAxes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Table.html");
		 String wins = driver.findElement(By.xpath("//td[text()='Ferrari']//following-sibling::td[2]")).getText();
		 String name = driver.findElement(By.xpath("//td[text()='Red Bull']//preceding-sibling::td[2]")).getText();
		 System.out.println(name+" "+wins);
		 String fer = driver.findElement(By.xpath("//td[text()='Aston Martin']//preceding-sibling::td[2]")).getText();
		 System.out.println(fer);
		
	}

}
