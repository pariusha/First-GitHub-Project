package DataDrivenTesting_Prog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumWithTestNG\\Exelsheet\\New XLSX Worksheet_file.xlsx");
		boolean a=f.exists();
		System.out.println(a);
		
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheets=workbook.getSheetAt(0);
		String b=sheets.getRow(0).getCell(0).getStringCellValue();
		System.out.println(b);
		String c=sheets.getRow(0).getCell(1).getStringCellValue();
		System.out.println(c);
	
	}

}
