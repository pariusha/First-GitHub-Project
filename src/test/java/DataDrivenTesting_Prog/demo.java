package DataDrivenTesting_Prog;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {


		

		public static void main(String[] args) throws Exception {

			File f = new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumWithTestNG\\Exelsheet\\New XLSX Worksheet_file.xlsx");
			boolean a = f.exists();

			System.out.println(a);

			FileInputStream fis = new FileInputStream(f);

			// how to load whole workbook
			// we need apache poi dependeancy.
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			// there are 2 types of xls sheet
			// .xls HSSFWorkbook workbook = new HSSFWorkbook(fis);
			// .xlsx XSSFWorkbook workbook = new XSSFWorkbook(fis);

			// if u want to focus on specific sheet
			XSSFSheet sheets = workbook.getSheetAt(1);

			String username = sheets.getRow(0).getCell(0).getStringCellValue();

			String password = sheets.getRow(0).getCell(1).getStringCellValue();

			String url = sheets.getRow(1).getCell(0).getStringCellValue();

			System.setProperty("webdriver.chrome.driver", "C:\\\\Download\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().deleteAllCookies();
			driver.get(url);

			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();
		}
	}


