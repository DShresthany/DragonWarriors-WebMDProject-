package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInElements {
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	public WebElement SignInLink;
	
	@FindBy(xpath = "//input[@name='user_name']")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@value='Sign In']")
	public WebElement SigninBtn;
	
	@FindBy(xpath = "//span[contains(text(),'My Profile')]")
	public WebElement ConformationSignin;
}
