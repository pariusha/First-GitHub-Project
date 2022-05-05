package TestNg_PracticeXML;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {

	@BeforeTest
	public void setup() {
		System.out.println("before test");
	}

	@AfterTest
	public void tearDown() {
		System.out.println("After Test");
	}

	@BeforeClass
	public void beforeclas() {
		System.out.println("Before class in Demo2");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After class in Demo2");
	}

	@Test
	public void abc() {
		System.out.println("Abc method");
	}

	@Test
	public void xyz() {
		System.out.println("xyz method");
	}


}
