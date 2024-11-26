package demoPkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FileHandling_Excel 
{

	public static void readexceldata() throws Exception
	{
		File f = new File("C:\\TestData\\abc.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("data");
		
		int nr = sh1.getPhysicalNumberOfRows();  //3
		System.out.println(nr);
		
		for(int i=0; i<nr; i++)  //i=0, 0<3
		{
			XSSFRow row = sh1.getRow(i); //i=0
			
			int nc = row.getPhysicalNumberOfCells();  //2
			//System.out.println(nc);
			
			for(int j=0; j<nc; j++) //j=0, 0<2, j=1, 1<2
			{
				XSSFCell col = row.getCell(j);
				System.out.print(col.getStringCellValue() + "    ");
			}
			
			System.out.println();
			
		}
		
		/*
		
		//Row - 1
		XSSFRow row1 = sh1.getRow(0);
		XSSFCell col1 = row1.getCell(0);
		System.out.print(col1.getStringCellValue() + "    ");
		XSSFCell col2 = row1.getCell(1);
		System.out.print(col2.getStringCellValue());
		
		System.out.println();
		
		//Row - 2
				XSSFRow row2 = sh1.getRow(1);
				XSSFCell col21 = row2.getCell(0);
				System.out.print(col21.getStringCellValue() + "    ");
				XSSFCell col22 = row2.getCell(1);
				System.out.print(col22.getStringCellValue());
		
				
				System.out.println();
				
				//Row - 3
						XSSFRow row3 = sh1.getRow(2);
						XSSFCell col31 = row3.getCell(0);
						System.out.print(col31.getStringCellValue() + "    ");
						XSSFCell col32 = row3.getCell(1);
						System.out.print(col32.getStringCellValue()  + "    ");
						XSSFCell col33 = row3.getCell(2);
						System.out.print(col33.getStringCellValue());
						
				*/
	}
	
	public static void main(String[] args) throws Exception 
	{
	
		readexceldata();
		
	}
	
}
