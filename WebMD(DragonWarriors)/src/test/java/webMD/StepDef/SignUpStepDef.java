package webMD.StepDef;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webMD.Actions.SignUpFeature;

public class SignUpStepDef {
	SignUpFeature SignUp = new SignUpFeature();

	@When("I click on sign in")
	public void i_click_on_sign_in() {
		SignUp.clickSignInLink();

	}

	@When("I click on sign up link")
	public void i_click_on_sign_up_link() {
		SignUp.clickSignUnLink();

	}

	@When("I enter correct email, password, dob")
	public void i_enter_correct_email_password_dob() {
		SignUp.enterEmailPassword();

	}

	@When("I click on sign up button")
	public void i_click_on_sign_up_button() throws InterruptedException {
		SignUp.clickSignUpBtn();
		Thread.sleep(5000);
	}

	@Then("I should be able to see my profile text")
	public void i_should_be_able_to_see_my_profile_text() {
		Assert.assertEquals(SignUp.verfifySignUp(), true);

	}
}
