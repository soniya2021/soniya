package VTiger.GenericUtil;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	
    public  String excelUtility(String sheetname,int rownum,int i) throws Throwable {
		FileInputStream fis = new FileInputStream(IPathConstant.EXCELPATH);
		  Workbook workbook= WorkbookFactory.create(fis); 
		  String val = workbook.getSheet(sheetname).getRow(rownum).getCell(i).getStringCellValue();
		return val;
			

	
	}

	
	

	}

