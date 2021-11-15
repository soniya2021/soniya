package TestPractice;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTest {

	@BeforeSuite
	public void ConnecttoDatabase()
	{
		System.out.println("connect to database");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		   
	}
	
	@BeforeMethod
	public void Login()
	{
	System.out.println("login into the application ");	
	}
	
	@Test
	public void CreateOraginazation()
	{
		System.out.println("create the organization");
	}
	
	@Test
	public void modifyOraginazation()
	{
		System.out.println("modify the organization");
	}
	
	@AfterMethod
	public void Logout()
	{
	System.out.println("logout from the application ");	
	}
	@BeforeClass
	public void closeBrowser()
	{
		System.out.println("close the browser");
	}
	@AfterSuite
	public void ConnectionclosefromeDatabase()
	{
		System.out.println("connection close from database");
	}
	
}
