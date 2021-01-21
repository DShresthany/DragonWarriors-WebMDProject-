package webMD.StepDef;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webMD.Actions.FindLowestDrugPricesActions;

public class FindLowestDrugPricesStepDef {
	FindLowestDrugPricesActions pricesAction = new FindLowestDrugPricesActions();
	
	@When("I click on find lowest drug prices")
	public void i_click_on_find_lowest_drug_prices() {
	pricesAction.clicklowestDrugLink();
	}

	@When("I view all drugs")
	public void i_view_all_drugs() {
	pricesAction.clickviewDrugsLink();;

	}

	@When("I click on {string}")
	public void i_click_on(String string) {
	pricesAction.clickDrug();

	}

	@Then("I can successfully find lowest price drugs")
	public void i_can_successfully_find_lowest_price_drugs() {
		Assert.assertEquals(pricesAction.verifylowestDrug(), true);
	}

}
