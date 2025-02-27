package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {

	public FetchMultipleDataFromExcel() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Convert excel file into java object
		FileInputStream fis = new FileInputStream("./src/test/resources/Excel File_1.xlsx");

		// Fetch the workbook
		Workbook wb = WorkbookFactory.create(fis);

		// Fetch the Sheet
		Sheet sh = wb.getSheet("Data");

		// Fetch all the Row from sheet using for loop
		for (int i = 0; i < sh.getLastRowNum(); i++) {

			String data = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);

		}

		wb.close();

	}

}
