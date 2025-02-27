package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackDataToExcelFile {

	public WriteBackDataToExcelFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Convert excel file into java object
		FileInputStream fis = new FileInputStream("C:\\Users\\ACER\\eclipse-workspace\\sel\\src\\test\\resources\\Excel File_1.xlsx");

		// Fetch the workbook
		Workbook wb = WorkbookFactory.create(fis);

		// Fetch the Sheet
		Sheet sh = wb.getSheet("Data");
		
		//Fetch the Row
		//Row r = sh.getRow(0);
		
		//Create a Row
		Row r = sh.createRow(6);
		
		
		//Create a cell
		Cell c = r.createCell(1);
		
		//Pass the data
		//c.setCellValue("Product Price");
	
		//Pass the data in cell
		c.setCellValue("20000");
		
		//Save the file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ACER\\eclipse-workspace\\sel\\src\\test\\resources\\Excel File_1.xlsx");
		wb.write(fos);
		
		wb.close();
		

	}

}
