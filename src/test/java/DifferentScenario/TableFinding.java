package DifferentScenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import VTiger.GenericUtil.WebDriverUtility;

public class TableFinding
{
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		WebDriverUtility  wUtil= new WebDriverUtility();
		{
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			{
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
			    List<WebElement> rowcount = driver.findElements(By.xpath("//table//tbody/tr"));
				//List<WebElement> colcount = driver.findElements(By.xpath("//table//tbody/tr[3]"));
				List<WebElement> colcount1 = driver.findElements(By.xpath("//table//tbody/tr[2]/td"));
				 
				System.out.println(rowcount.size());
				System.out.println(colcount1.size());
				System.out.println(driver.findElement(By.xpath("//table//tbody")).getText());
}
}
		}
}