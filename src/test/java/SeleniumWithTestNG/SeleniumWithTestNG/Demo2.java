package SeleniumWithTestNG.SeleniumWithTestNG;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(priority=1)
	public void pune() {
		System.out.println("pune");
	}
	
	@Test(priority=1)
	public  void mumbai(){
		System.out.println("mumbai");
	}
	
	@Test(priority=1)
	public void nashik() {
		System.out.println("nashik");
	}
}
