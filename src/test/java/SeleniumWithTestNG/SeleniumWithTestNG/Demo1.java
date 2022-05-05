package SeleniumWithTestNG.SeleniumWithTestNG;

import org.testng.annotations.Test;

public class Demo1 {
	
	@Test(priority=3)
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void Search() {
		System.out.println("Search");
	}
	@Test(priority=1)
	public void Logout() {
	System.out.println("Logout");
	}
	
		
}
