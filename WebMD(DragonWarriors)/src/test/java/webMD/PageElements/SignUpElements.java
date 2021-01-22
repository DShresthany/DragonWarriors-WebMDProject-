package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpElements {
	
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	public WebElement SignInLink;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	public WebElement SignUpLink;
	
	@FindBy(xpath = "//input[@name='user_name']")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@class='reg-datepicker']")
	public WebElement DOB;
	
	@FindBy(xpath = "//input[@class='form_submit btn']")
	public WebElement ConformationSignUn;
	
	@FindBy(xpath = "//a[contains(text(),'My Profile')]")
	public WebElement signinText;
	
}
