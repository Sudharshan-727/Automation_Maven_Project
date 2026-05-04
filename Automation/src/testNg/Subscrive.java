package testNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Subscrive extends Baseclass {
@Test
public void subscribe()
{
	driver.findElement(By.id("Email")).sendKeys("Sudharhan");
}
}
