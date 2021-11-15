package ProductModule_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import VTiger.GenericUtil.PropertyFileUtility;

public class CreateProductNo2 {
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		
		PropertyFileUtility pf = new PropertyFileUtility();
		String URL = pf.propertyFileUtility("url");
		String USERNAME = pf.propertyFileUtility("username");
		String PASSWORD = pf.propertyFileUtility("password");
		driver.get(URL);
		driver.findElement( By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Products']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create a')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("productname")).sendKeys("Micromax");
		driver.findElement(By.xpath("//input[@id='productcode']")).sendKeys("PRO1");
		Thread.sleep(1000);
	    Actions ac = new Actions(driver);
		WebElement ICON = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
        ac.moveToElement(ICON).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
		}
	}	
	}

