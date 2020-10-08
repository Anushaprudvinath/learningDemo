import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public ArrayList<String> getExceldata(String testCaseName) throws IOException
	{
		ArrayList<String> a=new ArrayList<String>();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\M LOK NATH REDDY\\Documents\\excelPractice.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//To get the total no.of sheets available in Excel
		int sheets=workbook.getNumberOfSheets();
		
		System.out.println(sheets);
		
		//lets iterate through the excel and get the index of desired sheet.
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Data1"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				
				Iterator <Row> rows=sheet.iterator();
				
				Row Firstrow=rows.next();
				
				
			
				//iterate through the cells of Secondrow
				Iterator<Cell>  ce=Firstrow.cellIterator();
				
				int k=0;
				int column = 0;
				while(ce.hasNext())
				{
				Cell value= ce.next();
				
				 if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
				 {
					 column=k;
					//System.out.println(value); 
				 }
				 k++;
				 }
				//System.out.println(column); 
				
				while(rows.hasNext())
				{
					Row Secondrow=rows.next();
					
					if(Secondrow.getCell(column).getStringCellValue().equalsIgnoreCase("testCaseName"))
					{
						Iterator<Cell> cv=Secondrow.cellIterator();
						
						while(cv.hasNext())
						{
							
							cv.next();
							a.add(cv.next().getStringCellValue());
						}
					}
				}
				
				
				 
			}
			
			
			
		}
		return a;


	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		dataDriven d=new dataDriven();
		ArrayList data=d.getExceldata("TestCases");
		System.out.println(data.get(0));
		
				}

	}

	

