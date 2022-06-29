package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement inputMail;
    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logIn;
}
