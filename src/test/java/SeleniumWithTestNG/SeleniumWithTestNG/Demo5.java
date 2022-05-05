package SeleniumWithTestNG.SeleniumWithTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo5 {
	
	@Test(priority=1)
	public void loginFunctionality() {
		Assert.assertEquals("login","abc");
		System.out.println("loginFunctionality");
	}
	
	@Test(dependsOnMethods={"loginFunctionality"},priority=2)
	
	public void homeFunctionality() {
		System.out.println("homeFunctionality");
	}
	
	@Test(priority=3)
	 public void pimFunctionality() {
		System.out.println("pimFunctionality");
	}
	 
	@Test(priority=4)
	public void logOutFunctionality() {
		System.out.println("logOutFunctionality");
	}
	
}
