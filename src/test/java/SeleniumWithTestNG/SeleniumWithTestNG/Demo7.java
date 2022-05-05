package SeleniumWithTestNG.SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo7 {
	WebDriver driver;

	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Download\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

	}

	@Test(priority = 2)
	public void loginFunctinality() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("1244555");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertEquals(12, 1344);
	}

	@Test(dependsOnMethods = { "loginFunctinality"})
	public void verifyTitle() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test(priority = 4)
	public void tearDown() {
		driver.quit();
	}

}
