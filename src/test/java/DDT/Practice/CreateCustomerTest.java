package DDT.Practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateCustomerTest {

	@Test
	public void createcustomer(XmlTest xml) {
	 System.out.println("Execute Test");
	 String Browser= xml.getParameter("BROWSER");
	 System.out.println(Browser);
	
		
	}
	} 