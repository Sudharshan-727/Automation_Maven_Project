package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCart extends Baseclass {
	@Test
	public void cart() {
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Reporter.log("Item Addded To CART Successfully");
	}
}
