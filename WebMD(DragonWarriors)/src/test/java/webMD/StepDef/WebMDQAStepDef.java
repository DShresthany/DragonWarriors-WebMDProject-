package webMD.StepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import webMD.Actions.QAactions;
import webMD.Utilities.SetupDrivers;

public class WebMDQAStepDef {
	QAactions QA = new QAactions();
	
	@Given("I move the mouse over the tab Health A-Z")
	public void i_move_the_mouse_over_the_tab_Health_A_Z() throws InterruptedException {
//		List<WebElement> list = SetupDrivers.chromeDriver.findElements(By.xpath("//li[@class='global-nav-links-link']"));
//		for(WebElement Health : list) {
//			if(Health.getText().contains("Health A-Z")){
//				System.out.println(Health.getText());
				//QA.moveMouseOver();	
		QA.moveMouseOver();
			}
		
	

	@Given("I click on Questions and answers")
	public void i_click_on_Questions_and_answers() {
		QA.clickQALink();
	}

	@Given("I land on the browse by topic page")
	public void i_land_on_the_browse_by_topic_page() {
	Assert.assertEquals(QA.verifyQAPage(), true);
	}

	@Given("I click on eating disorders")
	public void i_click_on_eating_disorders() {
		QA.clickTopic();
	}

	@Given("I land on the eating disorder questions and answers")
	public void i_land_on_the_eating_disorder_questions_and_answers() {
		Assert.assertEquals(QA.verifyTopic(), true);

	}

	@Given("I click on the types of eating disorder question")
	public void i_click_on_the_types_of_eating_disorder_question() {
		QA.clickQuestion();
	}

	@Then("I should be taken to the answer")
	public void i_should_be_taken_to_the_answer() {
		Assert.assertEquals(QA.verifyAnswerPage(), true);

	}
}
