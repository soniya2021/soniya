package COM.VTIGER.TESTCASE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import VTiger.GenericUtil.BaseClass;

public class CreateOrganization  extends BaseClass{

	@Test(groups="smokeTest")
	public void createOrganizationTest() throws Throwable 
	{	
		driver.findElement(By.xpath("//a[normalize-space()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("testyentra");
		driver.findElement(By.xpath("/html[1]/body[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]"));
		Thread.sleep(2000);
	}


	@Test(groups="RegressionTest")
	public  void createtOrgWithIndustry() throws Throwable {

		{
			driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
			driver.findElement(By.linkText("Organizations")).click();
			driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("testyentra");
			Reporter.log("Organization_info");

			WebElement Orginfo = driver.findElement(By.className("dvHeaderText"));
			String Organization_info = Orginfo.getText(); 
			System.out.println(Organization_info);
			Assert.assertTrue(Organization_info.contains(Organization_info));
			Reporter.log("verification passed");

		}
	}
}