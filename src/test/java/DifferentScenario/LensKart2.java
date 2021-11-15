package DifferentScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LensKart2{
	@Test
	public void olympicsTest() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/"); 
		driver.findElement(By.xpath("//div[@class=\"white-bg btn btn dropdown-toggle \"]"));
		driver.findElement(By.xpath("//div[@class='btn dropdown-toggle'][1]"));
	
	
  }
		
}
	
		
	
	
	
	
	
	
	
	

