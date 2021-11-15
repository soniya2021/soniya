package DifferentScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import VTiger.GenericUtil.WebDriverUtility;



public class MMTrip 
{
	WebDriverUtility  wUtil= new WebDriverUtility();
	{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		{
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			driver.findElement(By.xpath("//div[type()=\"langCard  fixedCard bounceAni\"")).click();
			driver.findElement(By.id("fromcity")).click();
			driver.findElement(By.xpath("//div[@type=Hyderabad, India]")).sendKeys("hyderabad");
			driver.findElement(By.id("tocity")).click();
			driver.findElement(By.xpath("//div[@type=font14 appendBottom5 blackText]")).sendKeys("mumbai");
			driver.findElement(By.xpath("//span[text()=departure']")).click();
		
}
}
}