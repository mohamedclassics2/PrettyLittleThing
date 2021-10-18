package com.PrettyLittleThing.stepDefinitions;

import com.PrettyLittleThing.pages.ShoppingPage;
import com.PrettyLittleThing.utilities.Driver;
import io.cucumber.java.en.Then;

public class ShoppingStepDefs {
    @Then("he should be able to make a purchase")
    public void he_should_be_able_to_make_a_purchase() {
        ShoppingPage shoppingPage= new ShoppingPage();
        shoppingPage.buyGreenCrock();
        System.out.println("Driver.get().getCurrentUrl() = " + Driver.get().getCurrentUrl());
        String expectedUrl = "https://www.prettylittlething.com/green-patent-croc-pu-round-toe-high-heeled-mules.html";
        System.out.println("expectedUrl = " + expectedUrl);

    }
}
