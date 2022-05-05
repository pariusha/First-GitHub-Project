package SeleniumWithTestNG.SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basetestlogin extends Base {
	
	private LoginPage obj = new LoginPage();

	@BeforeMethod
	public void setUpandLogin() {
		Base.inilization();
		obj.loginFunctionality("Admin", "admin123");
	}

	@Test(priority = 1)
	public void homepage() {
		boolean logoStatus = driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		Assert.assertEquals(logoStatus, true);
	}

	@Test(priority = 2)
	public void pimpage() {
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		boolean pimpage = driver.getCurrentUrl().contains("pim");
		Assert.assertEquals(pimpage, true);

		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.id("lastName")).sendKeys("abc");
		driver.findElement(By.id("btnSave")).click();

	}

	@Test(priority = 3)
	public void searchPIMUserpage() {
		System.out.println("Search PIM User");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After method");
		driver.quit();
		System.out.println("after method");
	}
}
