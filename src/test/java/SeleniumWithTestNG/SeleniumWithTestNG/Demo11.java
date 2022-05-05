package SeleniumWithTestNG.SeleniumWithTestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo11 extends  Base {
	String employeId;

	@BeforeClass
	public void setUp() {
		Base.inilization();
		System.out.println("Before Class");// 1
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test(priority = 1)
	public void validateHomePageTitle() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test(priority = 2)
	public void validateHomePageUrl() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

	@Test(priority = 3)
	public void validateHomePageLogo() {
		boolean actualLogo = driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		Assert.assertEquals(actualLogo, true);
	}

	@Test(priority = 4)
	public void PIMUserCreatepage() {
		driver.findElement(By.xpath("//b[text()='PIM']")).click();

		boolean confirmPIMuser = driver.getCurrentUrl().contains("pim");

		Assert.assertEquals(confirmPIMuser, true);
		driver.findElement(By.id("btnAdd")).click();

	}

	@Test(priority = 5)
	public void addNewPIMEmployee() {
		boolean userOnAddEmployee = driver.getCurrentUrl().contains("addEmployee");
		Assert.assertEquals(userOnAddEmployee, true);

		driver.findElement(By.id("firstName")).sendKeys("Abc");
		driver.findElement(By.id("lastName")).sendKeys("xyz");

		String employeeId = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
	}

	@Test(priority = 6)
	public void Searchuser() {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		String employeeId = "1";
		driver.findElement(By.id("empsearch_id")).sendKeys(employeeId);
		driver.findElement(By.id("searchBtn")).click();

		String actualIdNumber = driver.findElement(By.xpath("//table[@id='resultTable']//td[2]")).getText();

		Assert.assertEquals(actualIdNumber, employeeId);
	}

	@AfterClass
	public void tearDown() {

		driver.close();

	}

}


