package Tutorials;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelSheetHandling {
	public static void WriteExcelSheet() throws IOException {
	    XSSFWorkbook workbook=new XSSFWorkbook();
	    XSSFSheet worksheet=workbook.createSheet("Sheet 1");
	    int rowNum=0;
	    for(int i=1;i<=10;i++) {
	    	Row row=worksheet.createRow(rowNum++);
	        int colNum=0;
	        for(int j=1;j<=10;j++) {
	        	Cell cell=row.createCell(colNum++);
	        	cell.setCellValue("Row "+i+" Column "+j);
	        	
	        }
	    }
	    String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
         File ExcelFile = new File(path);	
         FileOutputStream Fos=null;
         try {
        	 Fos=new FileOutputStream(ExcelFile);
        	 workbook.write(Fos);
        	 workbook.close();
         }catch(FileNotFoundException e) {
        	 e.printStackTrace();
         }finally {
        	 Fos.close();
         }
	}
	public static void readExcelSheet() throws IOException {
		String path=System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
		File ExcelFile=new File(path);
		FileInputStream Fis=new FileInputStream(ExcelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(Fis);
		XSSFSheet sheet=workbook.getSheet("Sheet 1");
		Iterator<Row>row=sheet.rowIterator();
		while(row.hasNext()) {
			Row currRow=row.next();
			Iterator<Cell>cell=currRow.cellIterator();
			while(cell.hasNext()) {
				Cell currcell=cell.next();
				System.out.print(currcell.getStringCellValue()+" ~ ");
							}
			System.out.println();
			
		}
		Row newRow=sheet.createRow(12);
		Cell newCell=newRow.createCell(12);
		newCell.setCellValue("Its raining");
		FileOutputStream Fos=new FileOutputStream(ExcelFile);
		workbook.write(Fos);
		workbook.close();
		
		
	}
public static void main(String[] args) throws IOException {
	 
	//WriteExcelSheet();
	readExcelSheet();
}
}
