package GroupTestNG_Prog;

import org.testng.annotations.Test;

public class Demo {
	
	@Test(groups="Regration Testion")
	public void login() {
		System.out.println("login");
	}
	
	@Test(groups="system Testion")
	public void Search() {
		System.out.println("Search");
	}
	
	@Test(groups="Unit Testion")
	public void Down() {
		System.out.println("Down");
	}
	
	@Test(groups="Regration Testion")
	public void Logo() {
		System.out.println("Logo");
	}
}
