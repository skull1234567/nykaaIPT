package com.NykaaIPT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readalldata {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\navee\\eclipse-workspace\\NykaaIPT\\excel\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheetAt(0);
	
		int numberofRows = sheet.getPhysicalNumberOfRows();
		
		for(int i =0;i<numberofRows;i++) {
			Row row = sheet.getRow(i);
			
			int numberofcells = row.getPhysicalNumberOfCells();
			
			for(int j =0;j<numberofcells;j++) {
				Cell cell = row.getCell(j);
				
				CellType type = cell.getCellType();
				if(type.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}else if (type.equals(CellType.NUMERIC)) {
					double numericcellvalue = cell.getNumericCellValue();
					int data = (int) numericcellvalue;
					System.out.println(data);
				}
				
				
				//System.out.println(cell);
				
				
			}
		}
		
		
		
		
	}

}
