package SeleniumWithTestNG.SeleniumWithTestNG;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class Demo10 {
	
	@BeforeClass
	public void setUP() {
		System.out.println("setUP");
	}
	

	@Test(priority = 1)
	public void homepage() {
		System.out.println("homepage");
	}

	@Test(priority = 2)	public void PIMUserCreatepage() {
		System.out.println("PIMUserCreatepage");
	}

	@Test(priority = 3)	public void Searchuser() {
		System.out.println("Searchuser");
	}
	
	public void tearDown() {
		System.out.println("tearDown");
	}
	
}
