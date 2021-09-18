package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowNo = sh.getLastRowNum();
		int cellNo = sh.getRow(0).getLastCellNum();
		System.out.println(rowNo);
		System.out.println(cellNo);
		for (int i = 0; i <= rowNo; i++) {
			for (int j = 0; j < cellNo; j++) {
				System.out.print(sh.getRow(i).getCell(j)+ "    ");
			}
			System.out.println();
		}

	}

}
