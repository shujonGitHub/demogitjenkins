package com.connectxl;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsheet {

	public static void main(String[] args) throws IOException {
		
		//String path=System.getProperty("user.dir");
		
		
		XSSFWorkbook workbook=new XSSFWorkbook("C:\\Users\\johns\\eclipse-workspace\\jobpractice\\MIX_Coading\\OfficeSalary.xlsx");
		XSSFSheet sheetName=workbook.getSheet("credentials");
		
		
		String userName=sheetName.getRow(6).getCell(0).getStringCellValue();
		System.out.println(userName);
		
		double password=sheetName.getRow(6).getCell(1).getNumericCellValue();
		System.out.println(password);
		
		

	}

}
