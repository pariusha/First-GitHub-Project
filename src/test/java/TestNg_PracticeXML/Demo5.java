package TestNg_PracticeXML;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo5 {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}

	@BeforeClass
	public void beforeclasses() {
		System.out.println("Before classes");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}

	@Test
	public void abc() {
		System.out.println("Test Cases 1");
	}

	@Test
	public void xyz() {
		System.out.println("Test Cases 2");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}

}
