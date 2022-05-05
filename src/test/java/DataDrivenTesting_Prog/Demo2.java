package DataDrivenTesting_Prog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumWithTestNG\\Exelsheet\\New XLSX Worksheet_file.xlsx");



		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getLastRowNum();

		System.out.println(rows);

		for (int i = 0; i <= rows; i++) {
			String name = sheet.getRow(i).getCell(0).getStringCellValue();
			String id = sheet.getRow(i).getCell(1).getStringCellValue();
			String add = sheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println(name + " " + id +" "+add);
		}
	}

}
