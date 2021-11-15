package DDT.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class READTHEDATAFROMPROPERTIESFILETEST {

	
	@Test

	public void readdatafrompropfileTest() throws Throwable
	{
		FileInputStream fis  = new FileInputStream("./Data/commonData.properties");
		 Properties p = new Properties();
		 p.load(fis);
		 String URL = p.getProperty("url");
		 String UN = p.getProperty("usn");
		 String PW = p.getProperty("pwd");
		 System.out.println(URL);
		 System.out.println(UN);
		 System.out.println(PW);
		 
	}
	
}
