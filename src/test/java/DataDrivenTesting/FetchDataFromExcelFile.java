package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelFile {

	public FetchDataFromExcelFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//Convert excel file into java object
		FileInputStream fis = new FileInputStream("./src/test/resources/Excel File_1.xlsx");
		
		//Fetch the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Fetch the Sheet
		Sheet sh = wb.getSheet("Data");
		
		//Fetch the Row
		Row r = sh.getRow(1);
		
		//Fetch the Cell
		Cell c = r.getCell(0);

		//Fetch the data
		String data = c.getStringCellValue();
		System.out.println(data);

		//close the excel file
		wb.close();
	}

}
