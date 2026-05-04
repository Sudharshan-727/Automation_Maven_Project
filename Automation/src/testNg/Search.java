package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Search extends Baseclass {
@Test
public void search() {
	driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Reporter.log("ITEM SEARCHED SUCCESSFULLY");
	
}
}
