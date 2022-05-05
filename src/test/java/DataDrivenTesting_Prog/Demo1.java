package DataDrivenTesting_Prog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumWithTestNG\\Exelsheet\\New XLSX Worksheet_file.xlsx");
		System.out.println(f.exists());

		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String data = sheet.getRow(5).getCell(4).getStringCellValue();
		
System.out.println(data);		
	}

}
