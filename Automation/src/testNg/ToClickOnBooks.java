package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnBooks extends Baseclass{
@Test
public void clickbooks()
{
	driver.findElement(By.partialLinkText("Books")).click();
	Reporter.log("Books is clicked",true);
}
}
