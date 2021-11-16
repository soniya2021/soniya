package VTiger.GenericUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public WebDriverUtility  wUtil= new WebDriverUtility();
	public PropertyFileUtility pUtil = new PropertyFileUtility();
	public ExcelUtility eUtil = new ExcelUtility();

	public static WebDriver driver;

	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void connectDatabase()
	{
		System.out.println("connect to Database");
	}

	@BeforeClass(groups={"smokeTest","regressionTest"})
	public void openBrowser() throws Throwable
	{
		//open the browser
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		wUtil.WaitForPageLoad(driver);
	}
	@BeforeMethod(groups={"smokeTest","RegressionTest"})
	public void login() throws Throwable
	{
		//login into the application
		driver.get(pUtil.propertyFileUtility("url"));
		String UN = pUtil.propertyFileUtility("username");
		String PWD = pUtil.propertyFileUtility("password");
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(PWD);
		driver.findElement(By.id("submitButton")).click();
	}
	@AfterMethod(groups={"smokeTest","regressionTest"})
	public void logOut() throws Throwable
	{
		//logout from application
		Thread.sleep(3000);
		WebElement admImg= driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wUtil.mouseover(driver,admImg);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
	@AfterClass(groups={"smokeTest","regressionTest"})
	public void CloseBrowser()
	{
		driver.close();
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void disconnectDatabase()
	{
		System.out.println("close connection from Database");
	}
}
