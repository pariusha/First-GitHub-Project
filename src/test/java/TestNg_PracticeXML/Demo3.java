package TestNg_PracticeXML;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeClass
	public void setUp() {
		System.out.println("Before Class in Sample2");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("After Class in Sample2");
	}

	@Test
	public void lmn() {
		System.out.println("Lmn method");
	}

	@Test
	public void pqr() {
		System.out.println("pqr method");
	}

}
