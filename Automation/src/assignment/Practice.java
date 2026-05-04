package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	FileInputStream f= new FileInputStream("./Test_Data/CommonData.properties");
	Properties prop=new Properties();
	prop.load(f);
	String url = prop.getProperty("url");
	String email = prop.getProperty("Email");
	String pass = prop.getProperty("password");
	
	driver.get(url);
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	boolean status = driver.findElement(By.xpath("//a[text()='sudharshan0727@gmail.com']")).isDisplayed();
	System.out.println(status);
	driver.navigate().to("https://demowebshop.tricentis.com/books");
	WebElement drop = driver.findElement(By.id("products-orderby"));
	Select sel=new Select(drop);
	sel.selectByVisibleText("Price: Low to High");
	//sel.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
	//sel.selectByIndex(3);
	driver.navigate().to(url);
	WebElement com = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]"));
	Actions act=new Actions(driver);
	act.moveToElement(com).contextClick(com);
	WebElement desk = driver.findElement(By.className("picture"));
	act.contextClick(desk);
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	driver.findElement(By.id("add-to-cart-button-16")).click();
	boolean addcart = driver.findElement(By.xpath("//p[contains(text(),'The product has been added ')]")).isDisplayed();
	System.out.println(addcart);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	
}
}
