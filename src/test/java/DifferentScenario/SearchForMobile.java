package DifferentScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import VTiger.GenericUtil.WebDriverUtility;

public class SearchForMobile {


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
				driver.get("https://www.amazon.in/");
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("search for mobiles under 15000");
				driver.findElement(By.xpath("")).click();

			}
		}
		}

		}
