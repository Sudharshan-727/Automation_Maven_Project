package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
@BeforeSuite
public void beforesuite() {
	Reporter.log("Before Suit is Executed",true);
}
@AfterSuite
public void aftersuite()
{
	Reporter.log("After Suite is Executed",true);
}
@BeforeTest
public void beforetest()
{
	Reporter.log("Before test is Executed",true);
}
@AfterTest
public void aftertest()
{
	Reporter.log("After Suit is Executed",true);
}
@BeforeMethod
public void beforemethod()
{
	Reporter.log("Before Methods is executed",true);
}
@AfterMethod
public void aftermethods()
{
	Reporter.log("After Methods is Executed",true);
}
@BeforeClass
public void beforeclass(){
	Reporter.log("Before Class is Executed",true);
}
@AfterClass
public void afterclass()
{
	Reporter.log("After Class is Executed",true);
}
@Test
public void launch() {
	Reporter.log("Test Is Executed",true);
}
}

