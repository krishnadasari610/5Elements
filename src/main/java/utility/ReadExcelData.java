package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public String readExcel(int row, int col, String fileName, String sheetName) throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet workbookSheet = wb.getSheet(sheetName);
		int rowCount = workbookSheet.getLastRowNum()-workbookSheet.getFirstRowNum();
		return workbookSheet.getRow(row).getCell(col).getStringCellValue().toString();

		/*
		 * Workbook myWorkbook = null; String fileExtensionName =
		 * fileName.substring(fileName.indexOf(".")); //Check condition if the file is
		 * xlsx file if(fileExtensionName.equals(".xlsx")){ //If it is xlsx file then
		 * create object of XSSFWorkbook class myWorkbook = new XSSFWorkbook(fis); }
		 * //Check condition if the file is xls file else
		 * if(fileExtensionName.equals(".xls")){ //If it is xls file then create object
		 * of HSSFWorkbook class myWorkbook = new HSSFWorkbook(fis); } //Read sheet
		 * inside the workbook by its name Sheet mySheet =
		 * myWorkbook.getSheet(sheetName); //Find number of rows in excel file int
		 * rowCount = mySheet.getLastRowNum()- mySheet.getFirstRowNum();
		 * 
		 * //Create a loop over all the rows of excel file to read it for (int i = 0; i
		 * < rowCount+1; i++) { Row row = mySheet.getRow(i); //Create a loop to print
		 * cell values in a row for (int j = 0; j < row.getLastCellNum(); j++) { //Print
		 * excel data in console
		 * System.out.println(row.getCell(j).getStringCellValue()+"|| "); }
		 * System.out.println(); } }
		 */

		

	}

}
