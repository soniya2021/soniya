package COM.VTIGER.TESTCASE;

import org.testng.annotations.Test;

public class DataProvider {

	@org.testng.annotations.DataProvider
	public Object [][] sendData()
	{
		Object[][] ob =new Object[3][2];
		
		ob[0][0]="ACC-1";
		ob[0][1]=2356.00;
		
		ob[1][0]="ACC-2";
		ob[1][1]=2556.00;
		
		ob[2][0]="ACC-03";
		ob[2][2]=2600.00;
		
	return ob;
	}
	
	@Test(dataProvider="sendData")
	public void getData(String name,double balance)
	{
		System.out.println("name of Account Holder:"+name+"Balance:"+balance);;
		
	}

}
