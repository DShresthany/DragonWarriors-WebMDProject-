package webMD.StepDef;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webMD.Actions.SubscribeActions;

public class SubscribeStepDef {
	SubscribeActions subsAction = new SubscribeActions();
	
@When("I click on subscribe button")
public void i_click_on_subscribe_button() {

	subsAction.clickSubscribeBtn();
}

@When("I enter my email to webmd newsletter box")
public void i_enter_my_email_to_webmd_newsletter_box() {
	subsAction.enterEmail();

}

@When("click on subscribe button")
public void click_on_subscribe_button() {
	subsAction.submitSubscribeBtn();

}

@Then("I can succesfully subscribe webmd newsletter")
public void i_can_succesfully_subscribe_webmd_newsletter() {
	Assert.assertEquals(subsAction.verifySubscribe(), true);

}

}
