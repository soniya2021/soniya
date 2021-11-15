package COM.VTIGER.OBJECTREPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import VTiger.GenericUtil.WebDriverUtility;

public class HomePage   extends WebDriverUtility{

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrglink() {
		return Orglink;
	}

	public WebElement getAdmImg() {
		return admImg;
	}

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Organizations")
	private WebElement Orglink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement admImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement signoutbtn;
}
