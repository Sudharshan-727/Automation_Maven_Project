package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String url = driver.getCurrentUrl();	
		System.out.println(url);
		
		//for verification
		if(url.equals("https://www.flipkartcom/")) {
			System.out.println("Web Page is  Displayed");
		}
		else
		{
			System.out.println("Web Page is not displayed");
		}
	}

}
