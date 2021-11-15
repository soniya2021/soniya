package DifferentScenario;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import VTiger.GenericUtil.WebDriverUtility;

public class MakeMyTrip {

	@Test(dataProvider = "maketripdate")
	public void mmt(String src,String dest)
	{
		Date date= new Date();
		System.out.println(date);
		String s= date.toString();

		String [] arr=s.split("");
		String day= arr[0];
		String month= arr[1];
		String currentdate= arr[2];
		String year= arr[5];
        
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromcity")).sendKeys(src);
		driver.findElement(By.xpath("//div[text()='"+src+"']")).click();
		driver.findElement(By.id("tocity")).sendKeys(dest);
		driver.findElement(By.xpath("//div[text()='"+dest+"']")).click();
		driver.findElement(By.xpath("//span[text()=departure']"));
		//	driver.findElement(By.xpath("//div[@arial_lable'" + day + " " +month + " "+currentdate+" "+year+"']")).click();

	}

@DataProvider
public Object [][] maketripdate() {
	Object[][] obj=new Object[5][2];
	
	obj[0][0]="PNQ";
	obj[0][1]="HYD";
	obj[1][0]="KOL";
	obj[1][1]="MOM";
	obj[2][0]="BOM";
	obj[2][1]="DEL";
	obj[3][0]="BOM";
	obj[3][1]="MOM";
	obj[4][0]="PNQ";
	obj[4][1]="PNQ";
	
	return obj;
}			
}
