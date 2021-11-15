package VTiger.GenericUtil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductModule {
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
}
}
	}