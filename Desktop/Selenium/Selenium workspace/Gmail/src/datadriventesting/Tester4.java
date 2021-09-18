package datadriventesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

//write data into the excel file
public class Tester4 {

	public static void main(String[] args) throws Throwable {
//		FileInputStream fis = new FileInputStream("./resources/TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Sheet1");
//		sh.getRow(3).createCell(6).setCellValue("Dharini");
//		
//		FileOutputStream fos = new FileOutputStream("./resources/TestData.xlsx");
//		wb.write(fos);
//		wb.close();
		
		ExcelUtility util = new ExcelUtility();
		util.setDataExcel("Sheet1", 3, 4, "Dharini");
	}
}
