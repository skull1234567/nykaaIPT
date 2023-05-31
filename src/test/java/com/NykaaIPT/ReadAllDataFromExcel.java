package com.NykaaIPT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllDataFromExcel {

	public static void main(String[] args) throws IOException {

		File f = new File(".\\excel\\dataprovidertaskk.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheetAt(1);

		int numberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheet.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				System.out.print(cell+" ");
			}
			System.out.println();
		}
		wb.close();

	}

}
