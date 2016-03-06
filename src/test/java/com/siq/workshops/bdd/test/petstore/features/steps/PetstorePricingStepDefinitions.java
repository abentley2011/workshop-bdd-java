package com.siq.workshops.bdd.test.petstore.features.steps;

import com.siq.workshops.bdd.test.petstore.features.steps.serenity.PetstorePricingSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Then;

public class PetstorePricingStepDefinitions {
	@Steps
	PetstorePricingSteps steps;
	
	@Given("^a Dog costs (.*)$")
	public void a_Dog_costs(double cost) {
		steps.dogCosts(cost);
	}
	
	@When("^I enter Dog and search for price$")
	public void i_enter_Dog_and_search_for_price() {
		steps.iEnterDogAndSearchForPrice();
	}

	@Then("^the result should be (.*)$")
	public void the_result_should_be(double cost) {
		steps.theResultShouldBe(cost);
	}

}
