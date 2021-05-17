package week5.testng.homeworkday2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderExcelRead {

	public static String[][] readExcel(String sheetName) throws InvalidFormatException, IOException { 
		
	/*	In above method name,
		
		1. static keyword to access this method without object name
		2. Since excel book not knows to get data from which sheet, to make it dynamic run, sheet name is passed as parameter
		*/
		
		// Load workbook
		File excelFileName = new File("./Data/TestLeafLeads.xlsx");

		// Open workbook
		XSSFWorkbook wbook = new XSSFWorkbook(excelFileName);

		// Navigate to sheet inside workbook
		XSSFSheet sheet = wbook.getSheet(sheetName);
		
		// Get row and column total count
		int totalRowCount = sheet.getLastRowNum(); // Will point till last row excluding the row header

		int totalColumnCount = sheet.getRow(0).getLastCellNum(); // Will point till last column
		
		//Creating String array for passing the data to date provider by assigning excel rows and columns
		
		String[][] data=new String[totalRowCount][totalColumnCount];

		// Iterate rows and columns to print entire workbook

		for (int i = 1; i <= totalRowCount; i++) // Row iterator. Here i=1 indicates we going to take data from 1st row
		{
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < totalColumnCount; j++)// column iterator
			{
				XSSFCell column = row.getCell(j);

				System.out.println(column.getStringCellValue());
				
				//Assigning excel read rows and column data value to data provider
				
				data[i-1][j]=column.getStringCellValue(); //Here since i(row) starts from 1, our data provider array starts with 0, i value reduced by 1
				
			}
		}

		wbook.close(); // close the workbook
		
		return data;
	}

}
