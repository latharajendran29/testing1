package com.baseclass.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven4 {
	public static void main(String[] args) throws IOException {
		hetvaluesfromexcel(2,2,"queen");
	}
	

		public static void hetvaluesfromexcel(int rownum,int cellnum,String value) throws IOException  {
			File f =new File("C:\\Users\\navin\\eclipse-workspace\\Adatcin\\lib\\sample.xlsx");
			FileInputStream xf=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(xf);
			Sheet sheetAt=wb.getSheetAt(0);
			
			System.out.println(sheetAt.getPhysicalNumberOfRows());
			Row row = sheetAt.getRow(rownum);
if(row==null) {
	row=sheetAt.createRow(rownum);
}
Cell cell=row.getCell(cellnum);
if(cell==null) {
cell=row.getCell(cellnum);
}
cell.setCellValue(value);
FileOutputStream fout=new FileOutputStream(f);
wb.write(fout);
wb.close();
System.out.println("write to excel completed");
}


			}
			
	
