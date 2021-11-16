package COM.VTIGER.TESTCASE;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import VTiger.GenericUtil.BaseClass;
import VTiger.GenericUtil.ExcelUtility;
import VTiger.GenericUtil.JavaUtility;

public class CreateOrganisationWithIndustryTest extends BaseClass
{
@Test(groups="regression")
public void createOrganisationWithIndustry() throws Throwable
{
	ExcelUtility eUtil =  new ExcelUtility();
	String orgName = eUtil.excelUtility("Sheet1",1 , 2)+"_"+JavaUtility.generateRandomNumber();
	String indusType = eUtil.excelUtility("Sheet1", 3, 3);
	
	//Create Organisation with Industry
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.name("accountname")).sendKeys(orgName);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	WebElement ind = driver.findElement(By.name("industry"));
	wUtil.SelectByVisibleText(ind, indusType);
}

}