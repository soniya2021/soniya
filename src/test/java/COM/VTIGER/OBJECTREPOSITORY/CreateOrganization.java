package COM.VTIGER.OBJECTREPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import VTiger.GenericUtil.WebDriverUtility;

public class CreateOrganization  extends WebDriverUtility{
	WebDriver driver;
	
		public CreateOrganization(WebDriver driver) {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(name="accountname")
		private WebElement orgName;
		
		@FindBy(name="industry")
		private WebElement indType;

		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveBtn;

		
		public WebElement getOrgName() {
			return orgName;
		}

	
		public WebElement getIndType() {
			return indType;
		}

		
		public WebElement getSaveBtn() {
			return saveBtn;
		}
		
		public void createOrgName(String organisationName)
		{
			orgName.sendKeys(organisationName);
			saveBtn.click();
		}
		
		public void createOrgNamewithIndustry(String organisationName, String industryType)
		{
			orgName.sendKeys(organisationName);
			SelectByVisibleText(indType, industryType);
			saveBtn.click();
		}

		}
			




