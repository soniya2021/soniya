package DDT.Practice;

import java.util.Date;

import org.testng.annotations.Test;

public class GetDate {

	@Test
	public void getDateTest() 
	{
	new Date().toString().replace("","_").replace(":","_");
	}
}
