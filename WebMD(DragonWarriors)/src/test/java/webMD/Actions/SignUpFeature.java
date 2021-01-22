package webMD.Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import webMD.PageElements.SignUpElements;
import webMD.Utilities.SetupDrivers;

public class SignUpFeature {
	
	SignUpElements SignUp;
	
	public SignUpFeature() {
		this.SignUp = new SignUpElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, SignUp);
	}
	
	public void clickSignInLink() {
		SignUp.SignInLink.click();
	}
	
	public void clickSignUnLink() {
		SignUp.SignUpLink.click();
	}
	
	public void enterEmailPassword() {
		SignUp.Username.sendKeys("newnew@gmail.com");
		SignUp.Password.sendKeys("talentech_1");
		SignUp.Password.sendKeys(Keys.TAB);
		SignUp.DOB.sendKeys("12202003");
		SignUp.Password.sendKeys(Keys.TAB);

	}
	
	public void clickSignUpBtn() {
		SignUp.ConformationSignUn.click();

	}


	public boolean verfifySignUp() {
		boolean bool=false;
		if(SignUp.signinText.isDisplayed()) {
			bool=true;
		}
		return bool;
	}
}
