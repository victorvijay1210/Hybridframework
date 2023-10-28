//package com.saucedemo.utility;
//
//import java.io.File;
//import java.io.FileInputStream;
//
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class Dataprovider {
//	
//	
//	XSSFWorkbook wb;
//	
//	public Dataprovider() {
//		
//		File src = new File("C:\\Users\\vijay\\eclipse-workspace\\HybridFramework\\TestData\\TestData.xlsx");
//		
//		try {
//			FileInputStream fi = new FileInputStream(src);
//			
//			 wb = new XSSFWorkbook(fi);
//		}
//		catch (Exception e) {
//			System.out.println("unable to read excel" + e);
//		}
//			
//		
//		 
//		 
//	}
//	
//public String getStringData(int sheetindex, int row, int coloumn) {
//		
//		return wb.getSheetAt(sheetindex).getRow(row).getCell(coloumn).getStringCellValue();
//		
//	}
//
//	public String getStringData(String Sheetname, int row, int coloumn) {
//		
//		return wb.getSheet(Sheetname).getRow(row).getCell(coloumn).getStringCellValue();
//		
//	}
//	
//public double getNumericData(String Sheetname, int row, int coloumn) {
//		
//		return wb.getSheet(Sheetname).getRow(row).getCell(coloumn).getNumericCellValue();
//		
//	}
//	
//	}
