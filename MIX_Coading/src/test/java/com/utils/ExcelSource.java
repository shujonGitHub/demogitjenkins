package com.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSource {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public ExcelSource(String name, String pass) {
		
		try {
			workbook = new XSSFWorkbook(name);
			sheet = workbook.getSheet(pass);
			
		} catch (Exception E) {
			E.printStackTrace();

		}

	}

	public static void numberValue(int row, int col) {

		try {

			double number = sheet.getRow(row).getCell(col).getNumericCellValue();
			System.out.println(number);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void nameValue(int row, int col) {

		try {
			
			String name = sheet.getRow(row).getCell(col).getStringCellValue();
			System.out.println(name);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}