package com.connectxl;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataFormatter {
	
	public static void main(String[] args) throws IOException {
		getDataFromExcel();
	}
	
	public static void getDataFromExcel() throws IOException {
	
	@SuppressWarnings("resource")
	XSSFWorkbook workbook=new XSSFWorkbook("./OfficeSalary.xlsx");
	XSSFSheet sheet=workbook.getSheet("Credentials");
	
	
	DataFormatter data=new DataFormatter();
	 Object result=data.formatCellValue(sheet.getRow(0).getCell(2));
	System.out.println(result);
	
	
	//String stringvalue=sheet.getRow(0).getCell(0).getStringCellValue();
	

}
}