package com.utils;

public class RegularClass {
	
	public static void main(String[] args) {
		
	
	
	ExcelSource obj=new ExcelSource("C:\\Users\\johns\\eclipse-workspace\\jobpractice\\MIX_Coading\\OfficeSalary.xlsx", "credentials");
	
	obj.nameValue(2, 0);
	
	obj.numberValue(1, 1);

}
}