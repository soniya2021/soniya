package DifferentScenario;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import VTiger.GenericUtil.WebDriverUtility;

public class IccCricket {

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
			driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
           List<WebElement> teams = driver.findElements(By.xpath("//table//tbody//tr[*]//td[2]"));
           List<WebElement> matches = driver.findElements(By.xpath("//table//tbody//tr[*]//td[3]"));
           
           HashMap<String, Integer> hp = new HashMap<String, Integer>();
            for(int i=1; i<teams.size(); i++)
    		{
    			int matches_int = Integer.parseInt(matches.get(i).getText());
    			String team_name = teams.get(i).getText();
    			hp.put(team_name, matches_int);
    			
    		}
    		
    		int maxValueinMap = (Collections.max(hp.values()));
    		for(java.util.Map.Entry<String, Integer> entry:hp.entrySet())
    		{
    			if(entry.getValue()==maxValueinMap)
    			{
    			System.out.println(entry.getKey()+" "+entry.getValue());	
    			}
    		}
    	}

    }
		}	  

}
