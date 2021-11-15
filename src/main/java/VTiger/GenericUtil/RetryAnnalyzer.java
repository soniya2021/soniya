package VTiger.GenericUtil;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnnalyzer implements IRetryAnalyzer {

	int count = 0;
	int retrylimit=4;
			
	public boolean retry(ITestResult result)
	{
		
		if(count<retrylimit)
		{
			count ++;
		return true;
		}
		return false;
	}

}
