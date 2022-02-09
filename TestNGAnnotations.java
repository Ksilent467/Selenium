package SeleniumTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//WebDriver driver =new ChromeDriver();
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("In Before Test");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("In Test Case 1");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("In After Suite");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("In Test Case 2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("In Ater Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("In After Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("In Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("In After Class");
	}
	

}
