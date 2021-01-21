package webMD.StepDef;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webMD.Actions.SigninActions;

public class SignInStepDef {

	SigninActions signIn = new SigninActions();
	
@When("I click on My Account")
public void i_click_on_My_Account() {
	signIn.clicksignin();

}

@When("I enter my email\"<warroirsdragon@gmail.com>\"")
public void i_enter_my_email_warroirsdragon_gmail_com() {
	signIn.enterUserEmali();

}

@When("I enter my password\"<Talentech123456>\"")
public void i_enter_my_password_Talentech123456() {
	signIn.enterPassword();

}

@When("I click on sign in button")
public void i_click_on_sign_in_button() {
	signIn.clickSigninBtn();

}

@Then("I can successfully sign in to my webmd account")
public void i_can_successfully_sign_in_to_my_webmd_account() {
Assert.assertEquals(signIn.verifySignIn(), true);

}

}
