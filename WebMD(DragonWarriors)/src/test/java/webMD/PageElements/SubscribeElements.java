package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscribeElements {
	@FindBy(xpath = "//li[@class='global-nav-subscribe']/a")
	public WebElement SubscribeBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	public WebElement SignInLink;
	
	@FindBy(xpath = "//input[@class='nls-email']")
	public WebElement email;
	
	@FindBy(xpath = "//button[@name='nl-submit']")
	public WebElement SubmitSubscribe;
	
	@FindBy(xpath = "//img[@class='follow-checkmark']")
	public WebElement verifySubscribe;
	
	
	
}
