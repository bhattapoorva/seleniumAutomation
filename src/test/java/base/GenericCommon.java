package base;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public abstract class GenericCommon 
{
	public String getAndConcatCurrentPath(String path)
	{
		String currentPath=System.getProperty("user.dir");
		
		return currentPath+path;
		
	}
	
	public String readExcel(String xlValue)
	{
		File fl=new File("C:\\Qa Automation\\TDDM.xlsx");
		String strValue=null;
		try {
			FileInputStream flInputStream=new FileInputStream(fl);
			Workbook wb=new XSSFWorkbook(flInputStream);
			Sheet ws=wb.getSheetAt(0);
			int lastrownNo=ws.getLastRowNum();
			for(int i=0;i<=lastrownNo;i++)
			{
				Row row=ws.getRow(i);
				Cell cell=row.getCell(0);
				String cellValue=cell.getStringCellValue();
				if(cellValue.equals(xlValue))
				{
					strValue=row.getCell(1).getStringCellValue();
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strValue;
		
	}
	
	public void writeExcel()
	{
		
	}
}	

