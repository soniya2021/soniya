package VTiger.GenericUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.util.StringUtil;
import org.junit.Test;

public class ExcelUtility {

	
    public  String excelUtility(String sheetname,int rownum,int i) throws Throwable {
		FileInputStream fis = new FileInputStream(IPathConstant.EXCELPATH);
		  Workbook workbook= WorkbookFactory.create(fis); 
		  String val = workbook.getSheet(sheetname).getRow(rownum).getCell(i).getStringCellValue();
		return val;
			

	
	}

	
	

	}

