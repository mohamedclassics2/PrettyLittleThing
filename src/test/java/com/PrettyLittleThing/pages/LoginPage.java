package com.PrettyLittleThing.pages;

import com.PrettyLittleThing.utilities.BrowserUtils;
import com.PrettyLittleThing.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy (xpath =  "//a[@class='cookie-preference__accept button']")
    public static WebElement acceptCookies;

    @FindBy(className= "account-icon")
    public static WebElement loginIcon;


    @FindBy(xpath="//input[@name='username']")
    public WebElement emailAddress;

    @FindBy(xpath ="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='submit']")
    public WebElement signin;


    public void login(String userNameStr, String passwordStr) {
        acceptCookies.click();
        BrowserUtils.waitFor(2);
        loginIcon.click();
        BrowserUtils.waitFor(2);
        emailAddress.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        signin.click();
        // verification that we logged
    }


}








