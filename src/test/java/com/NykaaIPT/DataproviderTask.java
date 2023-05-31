package com.NykaaIPT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataproviderTask {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\navee\\eclipse-workspace\\NykaaIPT\\excel\\dataprovidertaskk.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheet = wb.createSheet("chennaitpppp");
	
	wb.getSheet("chennaitp").createRow(0).createCell(0).setCellValue("Battype");
	wb.getSheet("chennaitp").getRow(0).createCell(1).setCellValue("SR");
	wb.getSheet("chennaitp").getRow(0).createCell(2).setCellValue("detailcheck");
	
	Map<Object,Object[]> data = new HashMap<Object,Object[]>();
	data.put("Ruturaj",  new Object[] {"righthanded",126.4,true});
	data.put("Conway", new Object[] {"lefthanded",138.12,true});
	data.put("Rahane", new Object[] {"righthanded",169.88,true});
	data.put("Dube", new Object[] {"lefthanded",157.4,true});
	data.put("Jadeja", new Object[] {"lefthanded",126.9,true});
	
	
	
	Collection<Object> rows = data.keySet();
	System.out.println(rows);
	
	int rowNum = 1;
	
	for (Object key : rows) {
		Row row = sheet.createRow(rowNum++);
		Object[] objarray = data.get(key);
		
		int cellNum = 0;
		
		for (Object obj : objarray) {
			Cell cell = row.createCell(cellNum++);
			if(obj instanceof String) {
				cell.setCellValue((String)obj);
			}
			else if(obj instanceof Double) {
				cell.setCellValue((Double)obj);
			}
			else if(obj instanceof Boolean) {
				cell.setCellValue((Boolean)obj);
			}
		}
		
		
	}
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	fos.close();
	
	
}
}
