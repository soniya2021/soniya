package DifferentScenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OlympicsTest {
	
	@Test
	public void olympicsTest()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://olympics.com/");
		//driver.findElement(By.xpath("//span[text()='Eliud KIPCHOGE']/ancestor::ul/li/div[@class='featured-athlete__medals text-body-sm']"));
        List<WebElement> names = driver.findElements(By.xpath("//a[@class='featured-athlete__name d-flex text-body']/span"));
        List<WebElement> allmedals = driver.findElements(By.xpath("//div[@class='featured-athlete__medals text-body-sm']"));
        
        for (int i = 0; i < allmedals.size(); i++)
        {
        	System.out.println(names.get(i).getText()+"\n"+allmedals.get(i).getText());
        	
        	
        }
	}

}
