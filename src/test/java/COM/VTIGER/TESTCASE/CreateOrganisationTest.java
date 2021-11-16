package COM.VTIGER.TESTCASE;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import VTiger.GenericUtil.BaseClass;
import VTiger.GenericUtil.ExcelUtility;
import VTiger.GenericUtil.JavaUtility;


public class CreateOrganisationTest extends BaseClass
{
@Test(groups="regression")
	public  void createorganization() throws Throwable 
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ExcelUtility eUtil=new ExcelUtility();
		String orgName = eUtil.excelUtility("Sheet1",1 , 2)+"_"+JavaUtility.generateRandomNumber();

		//Create organization
		
//		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("(//a[text()=\"Organizations\"])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Reporter.log("Organisation Created");

		WebElement orgInfo = driver.findElement(By.className("dvHeaderText"));
		String organisationInfo = orgInfo.getText();
		System.out.println(organisationInfo);
		Assert.assertTrue(organisationInfo.contains(orgName));
		Reporter.log("Verification Passed", true);

		//	    SoftAssert sa=new SoftAssert();
		//	    sa.assertEquals(true, false);		
		//	    System.out.println("Verfication is done");
	}

}
	