package DataDrivenTesting_Prog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDExcelReader {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumWithTestNG\\Exelsheet\\New XLSX Worksheet_file.xlsx");
		boolean a= f.exists();
		System.out.println(a);
		
		FileInputStream fis = new FileInputStream(f);
		// how to load whole workbook
				// we need apache poi dependeancy.
		XSSFWorkbook  workbook = new XSSFWorkbook (fis);
		
		// there are 2 types of xls sheet
				// .xls HSSFWorkbook workbook = new HSSFWorkbook(fis);
				// .xlsx XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// if u want to focus on specific sheet
		
				XSSFSheet sheets = workbook.getSheetAt(0);		
				
//				String b = sheets.getRow(0).getCell(0).getStringCellValue();
//				System.out.println(b);

//				for (int i = 0; i < 15; i++) {
//					String data = sheets.getRow(i).getCell(1).getStringCellValue();
//					System.out.println(data);
//				}

				String c = sheets.getRow(0).getCell(0).getStringCellValue();
				System.out.println(c);

				String d = sheets.getRow(0).getCell(1).getStringCellValue();
				System.out.println(d);

				for (int i = 0; i < 6; i++) {
					String e = sheets.getRow(i).getCell(0).getStringCellValue();

					String fe = sheets.getRow(i).getCell(1).getStringCellValue();
					System.out.println(e + " " + fe);
				}
				
	}
}
