package COM.VTIGER.TESTCASE;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import VTiger.GenericUtil.BaseClass;

public class LoginTestCase4  extends BaseClass{

	@Test
	public void loginTestCase() throws Throwable
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		WebElement salutation=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select s = new  Select(salutation);
		s.selectByValue("Mr.");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vedansh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Reddy");
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());
		String parentTitle=driver.getTitle();
		String pw=driver.getWindowHandle();
		for(String wh:allwh)
		{		
		String title=driver.switchTo().window(wh).getTitle();
		if(!title.equals(parentTitle))
			{
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			driver.findElement(By.id("2")).click();
			}
			
		driver.switchTo().window(pw);
		}
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		//Thread.sleep(3000);
		//Actions ac=new Actions(driver);
		//WebElement icon = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//ac.moveToElement(icon).perform();
		//Thread.sleep(2000);
		//WebElement out=driver.findElement(By.xpath("//a[text()='Sign Out']"));
	
	//	out.click();
	
			}
		
}
