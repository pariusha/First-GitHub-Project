package SeleniumWithTestNG.SeleniumWithTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo8 {
	@BeforeMethod
	public void home() {
		System.out.println("home");
	}
	@Test(priority=1)
	public void Pm() {
		System.out.println("Pim");
	}
	
	@Test(priority=2)
	public void Login() {
		System.out.println("Login");
	}
	@AfterMethod
	public void User() {
		System.out.println("User");
	}
}
