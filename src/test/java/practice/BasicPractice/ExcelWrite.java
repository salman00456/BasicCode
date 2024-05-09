package practice.BasicPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void writeToExcell(String dataRec) throws IOException {
		
		File fo = new File("path of the excell file");
		
		FileInputStream fis = new FileInputStream(fo);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		sheet.getRow(0).getCell(0).setCellValue(dataRec);
		
		FileOutputStream fos = new FileOutputStream(fo);
		workbook.write(fos);
		workbook.close();
		
		
	}
	
	public static void resdToExcell() throws IOException {
		
		File fo = new File("path of the excell file");
		
		FileInputStream fis = new FileInputStream(fo);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String data =sheet.getRow(1).getCell(1).getStringCellValue();
		
		workbook.close();
	}

}
