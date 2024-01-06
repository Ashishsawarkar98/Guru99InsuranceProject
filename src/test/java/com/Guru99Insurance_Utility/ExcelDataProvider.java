package com.Guru99Insurance_Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	// Read Data from Excel sheet
	XSSFWorkbook wb;

	public ExcelDataProvider() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Eclipse IDE java programm files\\Guru99InsuranceProject\\Test_Data\\TestData.xlsx");

		wb = new XSSFWorkbook(fis);
	}

	public String getStringValue(String sheetName, int row, int column) // Here we are used method overloading

	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public String getStringValue(int sheetIndex, int row, int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}

	public long getNumericValue(String sheetName, int row, int column) {
		return (long) wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
