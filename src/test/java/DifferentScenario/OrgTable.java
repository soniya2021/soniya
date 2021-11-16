package DifferentScenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import VTiger.GenericUtil.WebDriverUtility;

public class OrgTable
{
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		WebDriverUtility  wUtil= new WebDriverUtility();
		{
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			{
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();//div[@class='btn dropdown-toggle'][1]
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("http://localhost:8888/");
				driver.findElement( By.name("user_name")).sendKeys("admin");
				driver.findElement(By.name("user_passwor")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='submitButton']")).click();
				driver.findElement(By.linkText("Organizations")).click();
				
		
			     @SuppressWarnings("unused")
				List<WebElement> colcount =  driver.findElements(By.xpath("//table[@class=//tbody/tr[*]/td[3]"));
			     List<WebElement> rowcount =  driver.findElements(By.xpath("//table[@class=//tbody/td[2]"));
				
				System.out.println(rowcount.size());
				 System.out.println(driver.findElement(By.xpath("//table//tbody")).getText());
				 
			}
		}
	}
}
