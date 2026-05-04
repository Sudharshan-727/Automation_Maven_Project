package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Checkout extends Baseclass{
	@Test
	public void checkout() {
		driver.findElement(By.partialLinkText("Shopping cart")).click();  
		WebElement country = driver.findElement(By.id("CountryId"));
		Select sel= new Select(country);
		sel.selectByVisibleText("India");
		driver.findElement(By.id("ZipPostalCode")).sendKeys("637211");
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		Reporter.log("order is Placed Successfully");
	}

}
