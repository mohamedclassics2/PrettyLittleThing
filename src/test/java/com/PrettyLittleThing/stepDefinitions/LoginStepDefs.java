package com.PrettyLittleThing.stepDefinitions;

import com.PrettyLittleThing.pages.LoginPage;
import com.PrettyLittleThing.utilities.BrowserUtils;
import com.PrettyLittleThing.utilities.ConfigurationReader;
import com.PrettyLittleThing.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {

        new LoginPage().login(ConfigurationReader.get("emailaddress"), ConfigurationReader.get("password"));
    }

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "https://www.prettylittlething.com/customer/account/login";
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);
        Assert.assertEquals(expectedUrl, actualUrl);
    }



}
