package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement ele = driver.findElement(By.xpath("//input[@id='username']"));
		ele.clear();
		ele.sendKeys("Eren");
		Thread.sleep(5000);
		WebElement cl = driver.findElement(By.xpath("//input[@id='password']"));
		cl.clear();
		cl.sendKeys("Eren");
	}

}
