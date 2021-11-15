package COM.VTIGER.TESTCASE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LoginTestCase1 {
	public static void main(String[] args) throws Throwable 
     
      {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
     
	//public void loginTestcase1() throws InterruptedException 
	//{
	WebDriver Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("http://localhost:8888/");
	Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	WebElement ele=Driver.findElement( By.name("user_name"));
	ele.sendKeys("admin");
	WebElement ele1=Driver.findElement(By.name("user_password"));
	ele1.sendKeys("admin");
	Driver.findElement(By.name("Login")).click();
	Driver.findElement(By.xpath("//input[@id='submitButton']"));
	Driver.findElement(By.xpath("//img[@onclick='fnAddWindow(this,\"addWidgetDropDown\");']"));
	Driver.findElement(By.xpath("//img[@title='Create Organization...']"));
	Driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("testyentra");
	Driver.findElement(By.xpath("/html[1]/body[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]"));
    Thread.sleep(2000);
	Actions a = new Actions(Driver);
	WebElement icon = Driver.findElement(By.xpath("\"//img[contains(@src,'themes/softed/images/user.PNG')]\""));
	a.moveToElement(icon).perform();
	Thread.sleep(2000);
	WebElement ici = Driver.findElement(By.xpath("//a[normalize-space()='Sign Out']"));
	ici.click();
	
	}
}
