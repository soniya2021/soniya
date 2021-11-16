package VTiger.GenericUtil;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListnerImplements implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		String failedTestCaseName=result.getMethod().getMethodName();
		String CurrentDate = new Date(). toString().replace(" ","_").replace(":","_");
		EventFiringWebDriver ed= new EventFiringWebDriver(BaseClass.driver);
		File srcImg= ed.getScreenshotAs(OutputType.FILE);
		File destImg = new File("C:\\Users\\Sumanth Reddy\\eclipse-workspace\\SDET1-PROJECT\\Screenshot"+failedTestCaseName+CurrentDate+".PNG"); 
		try {
			Files.copy(srcImg, destImg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	}

