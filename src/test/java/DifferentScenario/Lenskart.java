package DifferentScenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lenskart {
	@Test
	public void olympicsTest() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/"); 
		Thread.sleep(1000);
	    String order = driver.findElement(By.xpath("//img[@title='Lenskar']")).getAttribute("title");
	    System.out.println(order);
	    driver.findElement(By.xpath("//input[@class='search_input-bar autoSuggest']")).click();
	    Thread.sleep(2000);
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']//li"));
        for(WebElement onelink:links)
        {
        	System.out.println(onelink.getText());
        }
}
}