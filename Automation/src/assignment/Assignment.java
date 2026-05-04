package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/?gad_source=1&gad_campaignid=22479772058&gclid=CjwKCAjwspPOBhB9EiwATFbi5Fzf-g3I3YvUY-6k-p3rXbPdrZ4501pVaRQWjHShlJSJ0xJoJQQC7xoCm3wQAvD_BwE");
		String url=driver.getCurrentUrl();
		//Maximize
		driver.manage().window().maximize();
		//getsource
		String source=driver.getPageSource();
		System.out.println(source);
		System.out.println("--------------------------------------------------------------------");
		//verification of Welcome Page
		if(url.equals("https://www.redbus.in/?gad_source=1&gad_campaignid=22479772058&gclid=CjwKCAjwspPOBhB9EiwATFbi5Fzf-g3I3YvUY-6k-p3rXbPdrZ4501pVaRQWjHShlJSJ0xJoJQQC7xoCm3wQAvD_BwE"))
		{
			System.out.println("Welcome Page Is Displayed");
		}
		else
		{
			System.out.println("Welcome Page Is Not Displayed");
		}
		//quit
		driver.quit();
		
		
	}

}
