package COM.VTIGER.TESTCASE;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import VTiger.GenericUtil.BaseClass;
import VTiger.GenericUtil.ExcelUtility;
import VTiger.GenericUtil.JavaUtility;
import VTiger.GenericUtil.PropertyFileUtility;
import VTiger.GenericUtil.WebDriverUtility;

public class CreateContactWithOrganisation extends BaseClass {


	@Test(groups="smokeTest")
	public  void createContactWithOrganisation() throws Throwable {

	
		String firstName = eUtil.excelUtility("Sheet1", 4, 2)+"_" + JavaUtility.generateRandomNumber();
		String lastName = eUtil.excelUtility("Sheet1", 4, 3)+"_" + JavaUtility.generateRandomNumber();
		String searchType = eUtil.excelUtility("Sheet1", 4, 4);

		//create contactwithorganization
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		WebElement salutation=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select sel=new Select(salutation);
		sel.selectByValue("Mr.");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shreyansh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("abc");
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
		Thread.sleep(4000);

		
		//Switch to child window
				String partialWinTitle="Accounts";
				wUtil.SwitchToWindow(driver, partialWinTitle);
				driver.findElement(By.id("search_txt")).sendKeys(searchType);
				driver.findElement(By.name("search")).click();
				driver.findElement(By.xpath("//a[text()='Session8']")).click();
				
				//Switch to Parent window
				String partialWinTitle1="Contacts";
				wUtil.SwitchToWindow(driver, partialWinTitle1);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
			}

}
