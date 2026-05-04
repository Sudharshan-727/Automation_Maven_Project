package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver =new ChromeDriver();
	 //driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=6983068920173957508&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062011&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones");
	 driver.findElement(By.id("nav-search-submit-button")).click();
	 List<WebElement> images = driver.findElements(By.tagName("img"));
	 System.out.println(images.size());
	}

	}


