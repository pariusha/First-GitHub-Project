package GroupTestNG_Prog;

import org.testng.annotations.Test;

public class Demo1 {
	
	@Test(groups = { "Admin", "PIM" }, priority = 1)
	public void login() {
		System.out.println("Login Page ");
	}

	@Test(groups = "PIM", priority = 2)
	public void pimPage() {
		System.out.println("PIM Page ");
	}

	@Test(groups = "PIM", priority = 3)
	public void addNewPim() {
		System.out.println("New PIM user");
	}

	@Test(groups = "Admin", priority = 4)
	public void addNewEmpInAdmin() {
		System.out.println("new Employee in Admin Page");
	}

	@Test(groups = "Admin", priority = 5)
	public void deleteNewEmpInAdmin() {
		System.out.println("delete new Employee in Admin Page");
	}

	@Test(groups = { "Admin", "PIM" }, priority = 6)
	public void logout() {
		System.out.println("logout use");
	}


}
