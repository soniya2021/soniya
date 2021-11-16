package VTiger.GenericUtil;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {


	@SuppressWarnings("unused")
	private static final String While = null;
	public void SelectByIndex(WebElement ele,int index) {
	Select sel = new Select(ele);
	sel.selectByIndex(index);
	}
	 public void SelectByValue(WebElement ele, String value) {
	 Select sel = new Select(ele);
	 sel.selectByValue(value);
	 }
	 public void SelectByVisibleText(WebElement ele,String text) {
	 Select sel = new Select(ele);
	 sel.deselectByVisibleText(text);
	 }
	 public void WaitForPageLoad(WebDriver Driver) {
		 Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 }
	 public void WaitForElementtobeVisible(WebDriver Driver,WebElement ele) {
		 WebDriverWait wait = new WebDriverWait(Driver, 10);
		 wait.until(ExpectedConditions.visibilityOf(ele)); 
	 }
	 public void mouseover(WebDriver driver ,WebElement element) {
		 Actions act = new Actions(driver);
		 act.moveToElement(element).perform();
		 }
	 public void rightclick(WebDriver driver,WebElement element) {
		 Actions act = new Actions(driver);
		 act.contextClick(element).perform();
	 }
	 public void maximiseWin(WebDriver driver) {
		 driver.manage().window().maximize();
		 
	 }
	 public void SwitchToWindow(WebDriver driver , String partialWintitle) 
	 {
		 
		 Set<String> window = driver.getWindowHandles();
	    	Iterator<String> it = window.iterator();
			while(it.hasNext())
	    	{
	    		String winID=it.next();
	    		String title = driver.switchTo().window(winID).getTitle();
	    		if(title.contains(partialWintitle))
	    		{
	    			break;
		}
		}
	 }
	@SuppressWarnings("unused")
	private void While() {
		// TODO Auto-generated method stub
		
	}
	public void acceptAlert(WebDriver  driver) {
	    driver.switchTo().alert().accept();
	    }
	 
	public void dissmisAlert(WebDriver driver11) {
		driver11.switchTo().alert().dismiss();
	    }
	public void switchToFrame(WebDriver driver1, WebElement element) {
		driver1.switchTo().frame(element);
		}
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
		}
	public void switchToFrame(WebDriver driver1 , String idorname) {
		driver1.switchTo().frame(idorname);
		}
	String takeScreenShotpath(WebDriver driver1,String screenshotname) throws Throwable{
		String Screenshotpath ="./screenshot/"+screenshotname+".PNG";
		TakesScreenshot ts = (TakesScreenshot)driver1;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(Screenshotpath);
		Files.copy(src, dst);
		return  Screenshotpath;
	}
	public void scrollToWebElement(WebDriver driver1, WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver1;
	int y = element.getLocation().getY();
	js.executeScript("window .scrollBy()0,"+y+")",element);
	}
	public void pressEnter() throws Throwable 
	{
		Robot rc = new Robot();
    	rc.keyPress(KeyEvent.VK_ENTER);
    	rc.keyRelease(KeyEvent.VK_ENTER);
	}	
	}
	
	
