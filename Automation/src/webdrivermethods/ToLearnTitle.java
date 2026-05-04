package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTitle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	//get title
	String title = driver.getTitle();
	if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) 
	{
		System.out.println("Welcome Page is displayed");
	}
	else {
		System.out.println("Welcome Page is not Displayed");
	}
}
}
