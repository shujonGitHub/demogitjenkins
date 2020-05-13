package com.connectxl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMultiCol {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		excel();

	}

	public static Object[][] excel() throws EncryptedDocumentException, InvalidFormatException, IOException {

		File f = new File("./OfficeSalary.xlsx");
		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook Workbook = (XSSFWorkbook) WorkbookFactory.create(fis);
		XSSFSheet Sheet = Workbook.getSheet("Credentials");

		Object[][] obj = new Object[19][3];

		for (int r = 0; r < 19; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("\t");

				// obj[r][c]=Sheet.getRow(r).getCell(c).totring();
				System.out.println(Sheet.getRow(r).getCell(c).toString());
			}
		}
		return obj;
	}
}
