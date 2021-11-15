package TestPractice;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority=-1)
	public  void login()
	{
		System.out.println("click on login");
	}
	@Test(priority=0)
	public void homnpage()
	{

		System.out.println("enter homepage");
	}
	@Test(priority=-2)
	public void logout() 
	{
		System.out.println("logout from homepage");
	}
}
