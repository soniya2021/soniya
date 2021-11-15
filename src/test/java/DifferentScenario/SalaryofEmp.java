package DifferentScenario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import VTiger.GenericUtil.WebDriverUtility;

public class SalaryofEmp
{

	public static void main(String[] args) throws Throwable
	{
			FileInputStream fis= new FileInputStream("Data\\Testcase.xlsx");
				Workbook workbook1 = WorkbookFactory.create(fis);
				int LastRow =workbook1.getSheet("Sheet2").getLastRowNum();

				for (int i = 1; i<=LastRow; i++) {
					String SalaryofEmp = workbook1.getSheet("Sheet2").getRow(i).getCell(2).getStringCellValue()+" "+"Salary";
					if(Integer.parseInt(SalaryofEmp)>50000)
					{
						System.out.println(workbook1.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue());

				}

			}
	}


}







