package TestNg_PracticeXML;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeClass
	public void setUp() {
		System.out.println("Before Class in Demo2");
	}

	@Test
	public void abc() {
		System.out.println("Abc method");
	}

	@Test
	public void xyz() {
		System.out.println("xyz method");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("After class in Demo2");
	}


}
