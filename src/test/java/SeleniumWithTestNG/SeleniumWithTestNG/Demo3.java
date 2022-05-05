package SeleniumWithTestNG.SeleniumWithTestNG;

import org.testng.annotations.Test;

public class Demo3 {
	@Test(priority = 1)
	public void testcasesa() {
		System.out.println("Test case a");
	}

	@Test
	public void testcasesz() {
		System.out.println("Test case Z");
	}

	@Test
	public void testcasesp() {
		System.out.println("Test case p");
	}

	@Test(priority = 0)
	public void testcasesm() {
		System.out.println("Test case m");
	}
}
