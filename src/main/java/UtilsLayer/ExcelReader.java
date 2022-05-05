package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public XSSFWorkbook workbook;

	// cons with 1 String
	public ExcelReader(String filepath) {
		File f = new File(filepath);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// non static method with string return and 3 int args
	public String getDataFromExcel(int sheetIndex, int row, int col) {
		// XSSFSheet sheet=workbook.getSheetAt(sheetIndex);
		return workbook.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
	}

	// non static method with int return type and 1 int args
	public int countTotalRows(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum();
	}

	// non static method with int return type and 1 int args
	public int countTotalColumns(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

}