package TestLayer;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseCLass;
import UtilsLayer.ExcelReader;

public class CreateMultipleUserLayer extends BaseCLass {
	String employeeID;
	
	@BeforeClass
	public void setup() {
		BaseCLass.inilization();
	}
	
	@Test(priority = 1)
	public void loginfunctionality() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(priority = 2)
	public void validateHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	

	@Test(priority = 3, dataProvider = "CreateUser")
	public void createMultipleUser(String Fname, String mName, String lName) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys(Fname);
		driver.findElement(By.id("middleName")).sendKeys(mName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		employeeID = driver.findElement(By.id("employeeId")).getAttribute("value");
		
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(employeeID);

		driver.findElement(By.id("searchBtn")).click();
//		
//		UtilsClass.takeScreenshot(employeeID);
//		driver.findElement(By.xpath("//table[@id='resultTable']//td[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("btnDelete")).click();
		Thread.sleep(2000);
		String deletePopTitle = driver.findElement(By.xpath("//p[text()='Delete records?']")).getText();
		Assert.assertEquals(deletePopTitle.contains("Delete"), true);
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
	}

	@DataProvider(name = "CreateUser")
	public Object[][] getData() {
		ExcelReader excelreader = new ExcelReader("C:\\Users\\DELL\\eclipse-workspace\\SeleniumWithTestNG\\Exelsheet\\New XLSX Worksheet_file.xlsx");
		int rows = excelreader.countTotalRows(1);
		int cols = excelreader.countTotalColumns(1);

		Object[][] data = new Object[rows][cols];

		for (int i = 0; i < rows; i++) 
		{
			data[i][0] = excelreader.getDataFromExcel(1, i, 0);
			data[i][1] = excelreader.getDataFromExcel(1, i, 1);
			data[i][2] = excelreader.getDataFromExcel(1, i, 2);
		}

		return data;
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
