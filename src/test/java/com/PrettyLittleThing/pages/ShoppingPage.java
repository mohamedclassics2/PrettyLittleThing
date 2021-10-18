package com.PrettyLittleThing.pages;

import com.PrettyLittleThing.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class ShoppingPage {
    public ShoppingPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//span[normalize-space()='SHOES']")
    public static WebElement shoes;

    @FindBy (xpath = "//a[normalize-space()='HEELS']")
    public static WebElement heels;

    @FindBy (xpath = "//h2[normalize-space()='Green Patent Croc PU Round Toe High Heeled Mules']")
    public static WebElement greencrock;

    @FindBy (xpath = "//div[normalize-space()='5']")
    public static WebElement sizeFive;

    @FindBy (xpath = "//button[@id='add-to-bag']")
    public static WebElement addToBag;

    public void buyGreenCrock(){
        shoes.click();
        heels.click();
        sizeFive.click();
    }


}
