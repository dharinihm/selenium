package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//excel data into array
public class Tester3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowNo = sh.getLastRowNum();
		int cellNo = sh.getRow(0).getLastCellNum();
		System.out.println(rowNo);
		System.out.println(cellNo);
		String arr[][] = new String[3][3];

		for (int i = 0; i <= rowNo; i++) {
			for (int j = 0; j < cellNo; j++) {
				//System.out.print(i + "-" + j + ": ");
				arr[i][j] = sh.getRow(i).getCell(j).toString();
				//System.out.print(arr[i][j] + "    ");
			}
			//System.out.println();
		}

		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < cellNo; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();

		}

	}
}
