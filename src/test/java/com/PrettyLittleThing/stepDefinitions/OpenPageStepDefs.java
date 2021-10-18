package com.PrettyLittleThing.stepDefinitions;

import com.PrettyLittleThing.utilities.ConfigurationReader;
import com.PrettyLittleThing.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenPageStepDefs {
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }



    @When("the user navigates to categories")
    public void the_user_navigates_to_categories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Then("user is on the prettylittlething page")
    public void user_is_on_the_prettylittlething_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
