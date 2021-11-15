package TestPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public  void  createORG()
	{
		System.out.println();
	}
	
	@Test(dependsOnMethods="createORG")
	public void modifyOrg()
	{
Assert.fail();
		System.out.println("enter the createORG");
	}
	@Test(dependsOnMethods="modifyOrg")
	public void deleteOrg() 
	{
		Assert.fail();
		System.out.println("deleteOrg");
	}
	@Test(invocationCount=3)
	public void login() 
	{
		System.out.println("login");
	}
}



