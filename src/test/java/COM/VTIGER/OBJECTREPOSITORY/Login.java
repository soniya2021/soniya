package COM.VTIGER.OBJECTREPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {

	public Login(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}


	@FindBy(name="user_name")
	private WebElement usernameTxtFild;
	
	@FindBy(name="user_password")
	private WebElement passwrdTxtFild;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUsernameTxtFild() {
		return usernameTxtFild;
	}

	public WebElement getPasswrdTxtFild() {
		return passwrdTxtFild;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	 public void LoginIntoVtiger(String username,  String password)
	 {
	 usernameTxtFild.sendKeys(username);  
	 passwrdTxtFild.sendKeys(password);
	 loginbtn.click();
	}


}
